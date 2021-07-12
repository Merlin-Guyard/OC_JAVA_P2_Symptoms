package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteSymptomDataToFile {

	public void SendSymptoms(List<String> symptomstraites) {

		try {
			FileWriter writer = new FileWriter("result.out");

			for (int i = 0; i < symptomstraites.size(); i++) {
				writer.write(symptomstraites.get(i));
			}

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Problème ecriture");
		}
	}
}
