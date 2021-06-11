package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Read Symptom data from a source
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	// attribute
	Path FILENAME;

	// constructor
	public ReadSymptomDataFromFile(Path FILENAME) {
		super();
		this.FILENAME = FILENAME;
	}

	String line;

	// Method to read file
	/**
	 * 
	 * @param Path FILENAME
	 * @return the return value from the operation is a list of strings that main
	 *         contain many duplications. The implementation does not need to order
	 *         the list
	 * 
	 * @throws Exception even if the file is not found
	 */
	public String symptomReader() throws Exception {
		// try-with-resources construct which will automatically handle the close
		try (BufferedReader reader = Files.newBufferedReader(FILENAME)) {
			System.out.println("** The list of symptoms containing duplications: ");
			// "while" loop to read each line
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("The file cannot be found");
		}

		return line;
	}

}
