package org.cidarlab.eurule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cidarlab.eurule.dom.CompositePredicate;
import org.cidarlab.minieugene.exception.EugeneException;

public class PredicateRepository {

	private Map<String, List<CompositePredicate>> predicates;
	
	public PredicateRepository() {
		this.predicates = new HashMap<String, List<CompositePredicate>>();
	}
	
	/**
	 * 
	 * @param cp
	 * @throws EugeneException
	 */
	public void put(CompositePredicate cp) {
		
		if(this.predicates.containsKey(cp.getName())) {
			this.predicates.get(cp.getName()).add(cp);
		} else {
			List<CompositePredicate> lst = new ArrayList<CompositePredicate>();
			lst.add(cp);
			this.predicates.put(cp.getName(), lst);
		}
	}
	
	/**
	 * 
	 * @return all composite predicates
	 */
	public Map<String, List<CompositePredicate>> getPredicates() {		
		return this.predicates;
	}
}
