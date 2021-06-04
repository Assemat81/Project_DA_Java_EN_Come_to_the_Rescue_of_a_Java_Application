package com.hemebiotech.analytics;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AnalyticsCounter {

	final Path FILENAME = Paths.get("Project02Eclipse/src/com/hemebiotech/analytics/symptoms.txt");

	ISymptomReader readSymptom = new ReadSymptomDataFromFile(FILENAME);
	String line = readSymptom.symptomReader();

	Symptom symptomOrdered = new Symptom(FILENAME);
	List<String> listOfSymptoms = symptomOrdered.createListOfSymptom(line);
}
