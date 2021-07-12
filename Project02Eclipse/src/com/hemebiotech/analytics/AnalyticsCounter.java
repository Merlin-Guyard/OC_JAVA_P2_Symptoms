package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		final String file = "symptoms.txt";// constante plutôt en global

		// Lecture du fichier
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();// repasser en arg fonction
		List<String> symptomsbruts = read.GetSymptoms(file);
	}
}
