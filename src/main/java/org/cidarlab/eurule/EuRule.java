package org.cidarlab.eurule;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.cidarlab.eurule.dom.CompositePredicate;
import org.cidarlab.eurule.parser.EuRuleLexer;
import org.cidarlab.eurule.parser.EuRuleParser;
import org.cidarlab.eurule.tester.*;
import org.cidarlab.minieugene.data.pigeon.WeyekinPoster;
import org.cidarlab.minieugene.dom.Component;
import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.symbol.SymbolTables;
import org.cidarlab.minieugene.util.SolutionExporter;

import java.net.URI;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class EuRule {

	private EuRuleParser parser;
	
	public EuRule() {}
	
	public void test(String script) 
			throws EugeneException {
		
		try {
			// first, we need to parse the script
			this.parse(script);
		} catch(Exception e) {
			throw new EugeneException(e.getMessage());
		}
		
		Map<String, List<CompositePredicate>> predicates = 
				this.parser.getPredicateRepository().getPredicates();

		List<Component[]> solutions = new ArrayList<Component[]>();
		for(String name : predicates.keySet()) {
//			System.out.println("All composite predicates named " + name + ": ");
			List<CompositePredicate> lst = predicates.get(name);
			for(CompositePredicate cp : lst) {
//				System.out.println(cp.toString());

				// TEST IT
				solutions.addAll(
						new PredicateTester().test(cp, this.parser.getN()));
			}
			
		}
		
		visualize(solutions);
		
	}
	
	private void visualize(List<Component[]> solutions) {
		SolutionExporter se = new SolutionExporter(solutions, null);
		try {
			// ACT -> GraphViz
//			URI act = me.visualizeACT();
				
			// PIGEON
			URI pig = se.toPigeon();
			System.out.println(pig);
//			WeyekinPoster.launchPage(pig);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void parse(String script) 
			throws EugeneException {
		
		// Lexer
		EuRuleLexer lexer = new EuRuleLexer(
				new ANTLRStringStream(script));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Parser
		this.parser = new EuRuleParser(tokens);

		// initialize the symbol tables
		parser.init(new SymbolTables());
		
		// PARSING
		try {
			parser.eurule();
		} catch(Exception e) {
			throw new EugeneException(e.getMessage());
		}
		
	}
}
