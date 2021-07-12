package com.hemebiotech.analytics;

import java.util.*;

public class InterpretData {

	public List<String> interpret(List<String> symptomsbruts) {
		List<String> result = new ArrayList<String>();
		HashSet<String> setname = new HashSet<String>(symptomsbruts); // symptoms sans duplicats

		try {
			for (String str : setname) {
			result.add(str + " : " + Collections.frequency(symptomsbruts, str) + "\n"); // occurence des symptoms
		}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("Problème interpretation");
		}
		return result;
	}
}