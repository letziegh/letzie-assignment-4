package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileService {

	//public void writeStudentsToFile(Object BufferedWriter, BufferedWriter writer1, BufferedWriter writer2, BufferedWriter writer3) throws IOException {
		//FileService fileService = new FileService();
		//BufferedWriter  writer1 = new BufferedWriter();

//		String outputFile1 = "course1.csv";
//		String outputFile2 = "course2.csv";
//		String outputFile3 = "course3.csv";
//
//		BufferedWriter = null;
//
//		try {
//			writer1 = new BufferedWriter(new FileWriter(outputFile1));
//			writer1.write(fileService.sortedStudentsInFileOne());
//			writer2 = new BufferedWriter(new FileWriter(outputFile2));
//			writer3 = new BufferedWriter(new FileWriter(outputFile3));
//		} finally {
//			if (writer1 != null)writer1.close();
//			if(writer2 !=null)writer2.close();
//			if(writer3 !=null)writer3.close();
//			// String line="";
//			// while ((line = reader.readLine()) != null) {
//			// writer.write(fileService.sortedStudentsInFileOne());
//		}
//	}


	

	public Enrollment[] sortedStudentsInFileOne() {
		FileService fileService = new FileService();
		Enrollment[] enrollments = fileService.getStudentsFromFile();
		Enrollment[] finalEnrollment = new Enrollment[33];
		// String[] studentCourses = new String[enrollments.length];
		Arrays.sort(enrollments);
System.out.println(enrollments.length);
		for (int i = 0; i<finalEnrollment.length;i++) {
			if (enrollments[i].getCourse().contains("APMTH")) {
				finalEnrollment[i] = enrollments[i];
				System.out.println(i);
				
			}
				
		}
		return finalEnrollment;

	}

	public void sortedStudentsInFileTwo() {
		FileService fileService = new FileService();
		Enrollment[] enrollments = fileService.getStudentsFromFile();
		// String[] studentCourses = new String[enrollments.length];
		Arrays.sort(enrollments);

		for (Enrollment compsci : enrollments) {
			if (compsci.getCourse().contains("COMPSCI")) {
				System.out.println(compsci);
			}
		}
	}

	public void sortedStudentsInFileThree() {
		FileService fileService = new FileService();
		Enrollment[] enrollments = fileService.getStudentsFromFile();
		// String[] studentCourses = new String[enrollments.length];

		for (Enrollment stat : enrollments) {
			if (stat.getCourse().contains("STAT")) {
				System.out.println(stat);
			}
		}
	}

	public Enrollment[] getStudentsFromFile() {
		String filePath = "C:\\Users\\abbah\\git\\letzie-assignment-4\\student-master-list.csv";

		String outputFile1 = "course1.csv";
		String outputFile2 = "course2.csv";
		String outputFile3 = "course3.csv";

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
				BufferedWriter writer1 = new BufferedWriter(new FileWriter(outputFile1));
				BufferedWriter writer2 = new BufferedWriter(new FileWriter(outputFile2));
				BufferedWriter writer3 = new BufferedWriter(new FileWriter(outputFile3))) {
//		 String header = reader.readLine();
//            if (header != null) {
//                writer1.write(header);
//                writer1.newLine();
//                writer2.write(header);
//                writer2.newLine();
//                writer3.write(header);
//                writer3.newLine();
//                
//               System.out.println(header);
 //           }
				
			int i = 0;
			Enrollment[] enrollments = new Enrollment[100];
			String line = "";
			reader.readLine();// place this here to read first line of code, instead of using header
								// reader.readline
			while ((line = reader.readLine()) != null) {

				String[] student = line.split(","); // change from "," to Course; change from array to string to read
													// values
				// String iD= student[0];
				int iD = Integer.parseInt(student[0]);
				String name = student[1];
				String course = student[2];
				// String grade = student[3];
				int grade = Integer.parseInt(student[3]);
				Enrollment enrollment = new Enrollment(iD, name, course, grade);
				enrollments[i] = enrollment;
				// Courses c= new Courses(student[0], student[1], student [2], student[3]);
				// student [i] = new students;
				i++;

			}
			return enrollments;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// return;
			// System.out.println(enrollment);

			// Arrays.toString(enrollments);
			// NEXT STEP SPLIT INTO SEPARATE COURSES!!!!!

			// Store the students in a variable by courses using an if statement make a
			// method

		}


return null;

}

}

/*
 * Create file reader create file writer
 * 
 * split in to 3 separate files
 * 
 * You will need to parse the Master List File and separate the data into 3
 * separate CSV files. Each CSV file should contain a list of students specific
 * to that particular course (i.e. we're grouping the students by course).
 * 
 * For each of the 3 CSV files, you'll need to sort the students by grade in
 * descending order.
 * 
 * The CSV output file names should be called: course1.csv, course2.csv, and
 * course3.csv.
 * 
 */

//public Enrollment getSortedClasses(Enrollment[] enrollments, String name, String course, Integer grade) {
//	
//	for(int i =0; i<enrollments.length; i++) {
//		Enrollment studentEnrollments = enrollments[i];
//		
//		if(studentEnrollments.equals("COMSCI"){
//			
//		}
