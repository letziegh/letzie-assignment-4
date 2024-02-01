package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Assignment4Application {

	
	
	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		
		
		
		String outputFile1 = "course1.csv";
		String outputFile2 = "course2.csv";
		String outputFile3 = "course3.csv";
		//System.out.println(Arrays.toString(fileService.sortedStudentsInFileOne()));
		fileService.writeToAFile(outputFile1,fileService.sortedStudentsInFileOne());	
		fileService.writeToAFile(outputFile2,fileService.sortedStudentsInFileTwo());	
		fileService.writeToAFile(outputFile3,fileService.sortedStudentsInFileThree());	
		
		
	

	}
}


