package com.hemebiotech.analytics;

/**
 * Anything that will read symptom data from a source
 * 
 */
public interface ISymptomReader {
	// method to read the file
	public String symptomReader() throws Exception;
}

