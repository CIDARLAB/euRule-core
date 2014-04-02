package org.cidarlab.eurule.dom;

import java.util.List;

import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.predicates.Predicate;

import JaCoP.constraints.PrimitiveConstraint;
import JaCoP.core.IntVar;
import JaCoP.core.Store;

public class CompositePredicate 
	extends Predicate {

	private String name;
	private List<Predicate> predicates;
	
	public CompositePredicate(String name, List<Predicate> predicates) {
		this.name = name;
		this.predicates = predicates;
	}
	
	/**
	 * 
	 * @return the name of the composite predicate
	 */
	public String getName() {
		return this.name;
	}
	
	public List<Predicate> getPredicates() {
		return this.predicates;
	}
	
	
	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrimitiveConstraint toJaCoP(Store store, IntVar[][] variables)
			throws EugeneException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrimitiveConstraint toJaCoPNot(Store store, IntVar[][] variables)
			throws EugeneException {
		// TODO Auto-generated method stub
		return null;
	}

	private static final String NEWLINE = System.getProperty("line.separator");
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name).append(" :=").append(NEWLINE);
		for(int i=0; i<this.predicates.size(); i++) {
			sb.append("\t").append(this.predicates.get(i));
			if(i < this.predicates.size() - 1) {
				sb.append(",").append(NEWLINE);
			}
		}
		sb.append(".");
		return sb.toString();
	}
	
}
