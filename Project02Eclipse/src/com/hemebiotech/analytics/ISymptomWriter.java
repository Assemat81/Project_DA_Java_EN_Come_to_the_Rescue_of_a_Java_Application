package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Write results of the TreeMap (symptom, occurrence)
 * 
 */
public interface ISymptomWriter {
	
	public void writeNewFile(TreeMap<String, Long> counter) throws Exception;

}
