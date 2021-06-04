package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ISymptomWriter {
	/**
	 * Write results of the TreeMap (symptom, occurrence)
	 * 
	 */
	public void writeSymptomAndOccurrence(TreeMap<String, Long> counter);

}
