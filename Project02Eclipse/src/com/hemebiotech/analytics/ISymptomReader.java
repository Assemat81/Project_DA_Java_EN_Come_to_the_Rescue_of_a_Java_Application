package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * 
 */
public interface ISymptomReader {
	// method to read the file
	public String symptomReader() throws Exception;

	List<String> GetSymptoms();
}
