package com.hemebiotech.analytics;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {

		final Path FILENAME = Paths.get("Project02Eclipse/symptoms.txt");

		ISymptomReader readSymptom = new ReadSymptomDataFromFile(FILENAME);
		String line = readSymptom.symptomReader();

		Symptom symptomOrdered = new Symptom(FILENAME);
		List<String> listOfSymptoms = symptomOrdered.createListOfSymptom(line);

		Counter symptomCounter = new Counter();
		TreeMap<String, Long> counter = symptomCounter.countingOccurrences(listOfSymptoms);

		ISymptomWriter symptomWriter = new WriteResultInFile();
		symptomWriter.writeNewFile(counter);
	}
}
