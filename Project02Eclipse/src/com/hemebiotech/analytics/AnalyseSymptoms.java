package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class AnalyseSymptoms {
	
	final static String file = "symptoms.txt";

	public static void main(String args[]) throws Exception {



		// Lecture du fichier
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();
		List<String> symptomsbruts = read.GetSymptoms(file);
		
		// Interpretation des données
		InterpretData traitementsymptoms = new InterpretData();
		List<String> symptomstraites = traitementsymptoms.interpret(symptomsbruts);
	}
}
