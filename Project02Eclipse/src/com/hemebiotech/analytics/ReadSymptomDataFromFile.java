package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	// attribute
	Path FILENAME;

	// constructor
	public ReadSymptomDataFromFile(Path fILENAME) {
		super();
		FILENAME = fILENAME;
	}

	String line;

	// Method to read file
	/**
	 * Read symptom data from a source
	 * 
	 * @param Path FILENAME
	 * @return the return value from the operation is a list of strings that main
	 *         contain many duplications. The implementation does not need to order
	 *         the list
	 * 
	 * @throws IOException even if the file is not found
	 */
	public String symptomReader() throws IOException {
		// try-with-resources construct here which will automatically handle the close
		try (BufferedReader reader = Files.newBufferedReader(FILENAME)) {

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
		}

		return line;
	}

}
