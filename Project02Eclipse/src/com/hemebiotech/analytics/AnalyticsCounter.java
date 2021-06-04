package com.hemebiotech.analytics;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {

		final Path FILENAME = Paths.get(
				"PROJET2_Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");

		ISymptomReader readSymptom = new ReadSymptomDataFromFile(FILENAME);
		String line = readSymptom.symptomReader();

		Symptom symptomOrdered = new Symptom(FILENAME);
		List<String> listOfSymptoms = symptomOrdered.createListOfSymptom(line);

		Counter symptomCounter = new Counter();
		TreeMap<String, Long> counter = symptomCounter.countingOccurrences(listOfSymptoms);

		ISymptomWriter symptomWriter = new WriteResultInFile();
		symptomWriter.writeSymptomAndOccurrence(counter);
	}
}
