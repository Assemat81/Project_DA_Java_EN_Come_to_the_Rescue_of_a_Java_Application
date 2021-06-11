package com.hemebiotech.analytics;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Including the elements in a list of String
 *
 */
public class Symptom extends ReadSymptomDataFromFile {

	public Symptom(Path FILENAME) {
		super(FILENAME);

	}

	/**
	 * Symptoms in alphabetical order and in lower case
	 * 
	 * @return return List of String called listOfLowerCaseSymptoms: symptoms in a list which
	 *         contains many duplications, in alphabetical order and writing in
	 *         lower case
	 * @throws Exception even if the file is not found
	 *
	 */
	public List<String>createListOfSymptom(String line) throws Exception {
		// create a list to include the elements of the file
		List<String> originListOfSymptoms = new ArrayList<String>();

		// create a list to put the elements of the file in lower case
		List<String> listOfLowerCaseSymptoms = new ArrayList<String>();

		try {
			originListOfSymptoms = new ArrayList<String>(Files.readAllLines(FILENAME));

			// "for" loop to convert all elements of the file in lower case
			for (String curentSymptom : originListOfSymptoms) {
				listOfLowerCaseSymptoms.add(curentSymptom.toLowerCase());

			}

			// sort the elements in alphabetical order
			Collections.sort(listOfLowerCaseSymptoms);

			System.out.println("\n" + "** The list of ordered symptoms containing duplications: ");
			System.out.println(listOfLowerCaseSymptoms);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listOfLowerCaseSymptoms;

	}
}
