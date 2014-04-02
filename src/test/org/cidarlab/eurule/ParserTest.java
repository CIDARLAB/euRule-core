package org.cidarlab.eurule;

import java.io.File;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.cidarlab.eurule.parser.EuRuleLexer;
import org.cidarlab.eurule.parser.EuRuleParser;
import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.symbol.SymbolTables;
import org.cidarlab.minieugene.util.FileUtil;

/**
 * 
 * @author Ernst Oberortner
 */
public class ParserTest {

	public ParserTest() {
	}
	
	public static void main(String[] args) 
			throws Exception {
		ParserTest pt = new ParserTest();
		
		pt.parse(FileUtil.readFile(new File("./tests/basic")));
//		pt.parse(FileUtil.readFile(new File("./tests/contains.eug")));
//		pt.parse(FileUtil.readFile(new File("./tests/drives.eug")));
//		pt.parse(FileUtil.readFile(new File("./tests/interactions.eug")));
//		pt.parse(FileUtil.readFile(new File("./tests/not-morethan.eug")));
//		pt.parse(FileUtil.readFile(new File("./tests/not.eug")));
//		pt.parse(FileUtil.readFile(new File("./tests/operand-naming.eug")));
//		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex1")));
//		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex2")));
//		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex3")));
//		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex4")));
//		pt.parse(FileUtil.readFile(new File("./tests/swati/test01")));
//		pt.parse(FileUtil.readFile(new File("./tests/then/then01")));
//		pt.parse(FileUtil.readFile(new File("./tests/then/then02")));
//		pt.parse(FileUtil.readFile(new File("./tests/then/then03")));
//		pt.parse(FileUtil.readFile(new File("./tests/or")));
	}
	
	/**
	 * 
	 * @param script
	 */
	private void parse(String script) 
			throws EugeneException {
		
		// Lexer
		EuRuleLexer lexer = new EuRuleLexer(
				new ANTLRStringStream(script));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Parser
		EuRuleParser parser = new EuRuleParser(tokens);

		// initialize the symbol tables
		parser.init(new SymbolTables());
		
		// PARSING
		try {
			parser.eurule();
		} catch(Exception e) {
			e.printStackTrace();
			throw new EugeneException(e.getMessage());
		}
		
	}

}
