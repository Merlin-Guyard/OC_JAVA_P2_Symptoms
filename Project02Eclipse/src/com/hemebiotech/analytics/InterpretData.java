package com.hemebiotech.analytics;

import java.util.*;

public class InterpretData {

	public List<String> interpret(List<String> symptomsbruts) {
		List<String> result = new ArrayList<String>();
		HashSet<String> setname = new HashSet<String>(symptomsbruts);
//			List<String> name = new ArrayList<String>(setname);	

		try {
//				for(int i=0;i<name.size();i++) { //for each
			for (String str : setname) {
			result.add(str + " : " + Collections.frequency(symptomsbruts, str) + "\n");
		}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("Problème interpretation");
		}
		return result;
	}
}