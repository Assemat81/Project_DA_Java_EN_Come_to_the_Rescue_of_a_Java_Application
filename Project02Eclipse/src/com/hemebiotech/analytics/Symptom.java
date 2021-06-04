package com.hemebiotech.analytics;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Symptom extends ReadSymptomDataFromFile {

	public Symptom(Path fILENAME) {
		super(fILENAME);

	}

	/**
	 * Symptoms in alphabetical order
	 * 
	 * @return return list<String>getSymptoms: symptoms in a list which contain many
	 *         duplications, in alphabetical order
	 *
	 */
	public List<String> createListOfSymptom(String line) {
		List<String> listOfSymptoms = new ArrayList<String>();

		try {
			listOfSymptoms = new ArrayList<String>(Files.readAllLines(FILENAME));
			// alphabetical order
			Collections.sort(listOfSymptoms);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listOfSymptoms;

	}
}
