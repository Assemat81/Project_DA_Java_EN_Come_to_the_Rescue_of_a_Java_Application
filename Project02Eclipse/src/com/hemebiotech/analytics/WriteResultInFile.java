package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class WriteResultInFile implements ISymptomWriter {
	// Create and Write a file results.out.txt
	/**
	 * 
	 * Create a new file results.out.txt. Incorporate the results of counting in the
	 * file. Use iterator to cycle through the collection to obtain the elements
	 * 
	 * Write the pairs in the new file separate by "="
	 * 
	 * @throws Exception if the file is not create
	 * 
	 */
	public void writeNewFile(TreeMap<String, Long> counter) {

		try {

			// create the new file
			FileWriter newfile = new FileWriter("results.out.txt");

			// Incorporate the results in a Set<Map.Entry<String,Long>>
			Set<Map.Entry<String, Long>> results = counter.entrySet();
			// Use iterator to cycle through the collection to obtain the elements
			Iterator<Map.Entry<String, Long>> iter = results.iterator();

			// Use a while loop to browse the keys and view the entries for each key
			while (iter.hasNext()) {
				Map.Entry<String, Long> result = (Entry<String, Long>) iter.next();

				// Write the result in the new file
				newfile.write(result.getKey() + " = " + result.getValue() + "\n");
				System.out.println(result.getKey() + " = " + result.getValue() + "\n");
			}
			newfile.close();
		} catch (Exception e) {
		}

	}

}
