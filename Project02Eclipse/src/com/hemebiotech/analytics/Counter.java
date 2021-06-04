package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Counter {
	List<String> listOfSymptoms;

	// COUNTING DUPLICATE
	/**
	 * 
	 * List<String>listOfSymptoms go through a Map to count duplicate
	 * 
	 * 
	 * @return return the occurrences of each symptom
	 * 
	 */
	public TreeMap<String, Long> countingOccurrences(List<String> listOfSymptoms) {

		// the List go through a Map
		TreeMap<String, Long> counter = new TreeMap<String, Long>();

		for (String symptom : listOfSymptoms) {
			if (counter.containsKey(symptom)) {
				/*
				 * If the line already contains the symptom, the counter that is associated with
				 * it is incremented
				 */
				counter.put(symptom, counter.get(symptom) + 1);

			} else {
				// otherwise we add the association by starting the counter to 1
				counter.put(symptom, 1L);

			}

		}
		return counter;
	}

}
