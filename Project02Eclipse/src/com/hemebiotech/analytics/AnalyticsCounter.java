package com.hemebiotech.analytics;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;

/**
 * Main class
 *
 *
 */
public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {

		final Path FILENAME = Paths.get("symptoms.txt");

		ISymptomReader readSymptom = new ReadSymptomDataFromFile(FILENAME);
		String line = readSymptom.symptomReader();

		Symptom symptomOrdered = new Symptom(FILENAME);
		List<String> listOfLowerCaseSymptoms = symptomOrdered.createListOfSymptom(line);

		Counter symptomCounter = new Counter();
		TreeMap<String, Long> counter = symptomCounter.countingOccurrences(listOfLowerCaseSymptoms);

		ISymptomWriter symptomWriter = new WriteResultInFile();
		symptomWriter.writeNewFile(counter);
	}
}
