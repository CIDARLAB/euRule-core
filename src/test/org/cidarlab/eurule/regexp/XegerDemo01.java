package org.cidarlab.eurule.regexp;

import nl.flotsam.xeger.Xeger;

public class XegerDemo01 {

	public static void main(String[] args) {
		String regex = "(ab){4,6}c";
//		String regex = "[ab]*c";
		Xeger generator = new Xeger(regex);
		
		generator.enumerate();
	}

}
	