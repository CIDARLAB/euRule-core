package org.cidarlab.eurule.tester;

import org.cidarlab.minieugene.MiniEugene;
import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.predicates.BinaryPredicate;
import org.cidarlab.minieugene.predicates.LogicalNot;
import org.cidarlab.minieugene.predicates.LogicalOr;
import org.cidarlab.minieugene.predicates.LogicalPredicate;
import org.cidarlab.minieugene.predicates.Predicate;
import org.cidarlab.minieugene.predicates.UnaryPredicate;
import org.cidarlab.minieugene.predicates.counting.*;
import org.cidarlab.minieugene.dom.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cidarlab.eurule.dom.*;

public class PredicateTester {

	public List<Component[]> test(CompositePredicate cp, int maxN) 
			throws EugeneException {
		
		/*
		 * calculate min. N 
		 */
		int minN = this.calculateMinN(cp.getPredicates());
		System.out.println(cp.getName()+ " -> min. N: "+minN+" ... max. N: "+maxN);

		List<Component[]> solutions = new ArrayList<Component[]>();
		if(minN <= maxN) {
			MiniEugene me = new MiniEugene();
	
			for(int i=minN; i<=maxN; i++) {
				// build miniEugene script
				String script = this.buildScript(cp.getPredicates(), i);
		
				// solve the problem
				me.solve(script);
				
				// keep track of the solutions
				solutions.addAll(me.getSolutions());
			}
			
//			me.getStatistics().print();

		}
		
		return solutions;
	}
	
	private String buildScript(List<Predicate> predicates, int N) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("N=").append(N).append(".");
		for(Predicate predicate : predicates) {
			sb.append(this.toString(predicate)).append(".");
		}

//		System.out.println(sb.toString());
		
		return sb.toString();
	}
	
	private HashMap<String, Integer> count;

	private int calculateMinN(List<Predicate> predicates) {
		
		count = new HashMap<String, Integer>();
		
		for(Predicate predicate : predicates) {
			if(predicate instanceof BinaryContains) {
				// ignore them for the time being
			} else if(predicate instanceof Contains) {
				this.addToCount(((Contains) predicate).getA().getName(), 1);
			} else if(predicate instanceof Exactly) {
				this.addToCount(((Exactly) predicate).getA().getName(), 
						((Exactly) predicate).getNum());
			} else if(predicate instanceof MoreThan) {
				this.addToCount(((MoreThan) predicate).getA().getName(), 
						((MoreThan) predicate).getNum() + 1);
			} else if(predicate instanceof LogicalPredicate) {
				if(predicate instanceof LogicalOr) {
					this.logicalOr((LogicalOr)predicate);
				} else if(predicate instanceof LogicalNot) {
					this.logicalNot((LogicalNot)predicate);
				}
			}
		}
		
		
		// finally, we build the sum of the count table
		int minN = 0;
		for(String key : count.keySet()) {
			minN += count.get(key);
		}
		
		return minN;
	}
	
	private void logicalOr(LogicalOr lop) {
		for(Predicate p : lop.getPredicates()) {
			if(p instanceof BinaryContains) {
				// ignore them for the time being
			} else if(p instanceof Contains) {
				this.addToCount(((Contains) p).getA().getName(), 1);
				return;
			} else if(p instanceof Exactly) {
				this.addToCount(((Exactly) p).getA().getName(), 
						((Exactly) p).getNum());
			} else if(p instanceof MoreThan) {
				this.addToCount(((MoreThan) p).getA().getName(), 
						((MoreThan) p).getNum() + 1);
			} else if(p instanceof LogicalNot) {
				this.logicalNot((LogicalNot)p);
			}
		}
	}
	
	private void logicalNot(LogicalNot lnp) {
		Predicate p = lnp.getPredicates().get(0);
		if(p instanceof BinaryContains) {
			// ignore them for the time being
		} else if(p instanceof Contains) {
			this.addToCount(((Contains) p).getA().getName(),
					0);
		} else if(p instanceof Exactly) {
			if(((Exactly) p).getNum() > 1) {
				this.addToCount(((Exactly) p).getA().getName(), 
						1);							
			} else {
				this.addToCount(((Exactly) p).getA().getName(), 
						0);							
			}
		} else if(p instanceof MoreThan) {
			if(((MoreThan) p).getNum() > 1) {
				this.addToCount(((MoreThan) p).getA().getName(), 
						1);							
			} else {
				this.addToCount(((MoreThan) p).getA().getName(), 
						0);							
			}
		}
	}
	
	private void addToCount(String name, int N) {
		if(this.count.containsKey(name)) {
			int n = this.count.get(name);
			if(N < n) {
				this.count.remove(name);
				this.count.put(name, N);
			}
		} else {
			this.count.put(name, N);
		}
	}
	
	private String toString(Predicate p) {
		StringBuilder sb = new StringBuilder();
		if(p instanceof BinaryPredicate) {
			
			sb.append(((BinaryPredicate)p).getA().getName()).append(" ")
				.append(p.getOperator()).append(" ");
			if(p instanceof Exactly) {
				sb.append(((Exactly)p).getNum());
			} else {
				sb.append(((BinaryPredicate)p).getB().getName());
			}
			
		} else if(p instanceof UnaryPredicate) {
			
			sb.append(p.getOperator());
			if(null != ((UnaryPredicate)p).getA()) {
				sb.append(" ").append(((UnaryPredicate)p).getA().getName());
			}
			
		} else if(p instanceof LogicalPredicate) {

			if(p instanceof LogicalNot) {
				sb.append("NOT ").append(
						this.toString(
								((LogicalNot)p).getPredicates().get(0)));
			} else if(p instanceof LogicalOr) {
				
				LogicalOr lop = (LogicalOr)p;
				for(int i=0; i<lop.getPredicates().size(); i++) {
					sb.append(this.toString(lop.getPredicates().get(i)));
					if(i < lop.getPredicates().size() - 1) {
						sb.append(" \\/ ");
					}
				}
			}
		}
		
		
		return sb.toString();
	}
}
