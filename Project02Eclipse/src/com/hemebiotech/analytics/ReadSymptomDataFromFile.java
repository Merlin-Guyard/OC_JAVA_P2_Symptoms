package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadSymptomDataFromFile {

	public List<String> GetSymptoms(String file) {
		ArrayList<String> result = new ArrayList<String>();

		if (file != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Problème lecture");
			}
		}

		return result;
	}
}
