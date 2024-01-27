package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Assignment4Application {

	/*
	 * 1. Create java project 2. create main 3. create POJO 4. Download master list
	 * file 5. parse and Separate data into 3 CSV files 6. Group Students by course
	 * 7. Once separated sort the students by grade in descending order The CSV
	 * output file names should be called: course1.csv, course2.csv, and
	 * course3.csv.
	 * 
	 * HINTS
	 * 
	 * In order to sort an array, you'll need to figure out how to handle null
	 * entries in your array. If you're trying to use Arrays.sort(yourArray), and
	 * yourArray contains null values, the sort will crash. When writing to a file,
	 * you can use "\n" to write a new line to the file. Fore example:
	 * fileWriter.write("This is one line \n"); If you want to turn String input
	 * into an Integer, you can parse it like so: Integer myIntVal =
	 * Integer.parseInt(myStringVal);
	 * 
	 */
	// FIRST GET THE READER TO READ CSV FILE THEN PARSE INTO 3 DIFFERENT
	// FILES--DONE!!!!COMPLETED!!!just added C://
//	parse by class(compsci, stat, apmth) put each into an array
	// and Separate data into 3 CSV files; use bufferedwriter to read 3 arrays into
	// 3 different files
	// Watch video on looping \n to start a new line for each student in file to

	// Use this. to sort
	// then save into 3 separate csv files
	public static void main(String[] args) throws IOException  {
		FileService fileService = new FileService();
		Enrollment [] enrollments = fileService.getStudentsFromFile();
		String[] studentCourses = new String [enrollments.length];
		

			
		
		
		for(int i =0; i<enrollments.length; i++) {
			studentCourses [i] = enrollments[i].getCourse();
			
		}
		//BEFORE SORTING MUST SPLIT FILE BASED ON COURSE, THEN SORT BY GRADE IN DESCENDING ORDER
		Arrays.sort(studentCourses);
		for(String studentCourse: studentCourses) {
			System.out.println(studentCourse);
			
		}
		
		
	}
	}
		

		

//		String path = "C:\\Users\\abbah\\OneDrive\\Desktop\\student-master-list.csv";
//		try {
//			BufferedReader reader = new BufferedReader(new FileReader(path));
//			int i= 0;
//			Enrollment[] enrollments = new Enrollment [101];
//			String line = "";
//			while ((line = reader.readLine()) != null) {
//				
//				String[] student = line.split(","); //change from "," to Course; change from array to string to read values
//				String iD= student[0];
//				//int idInt = Integer.parseInt(iD);
//				String name = student[1];
//				String course = student[2];
//				String grade = student[3];
//				//int grade = Integer.parseInt(student[3]);
//				Enrollment enrollment= new Enrollment(iD, name, course, grade);
//				enrollments[i] = enrollment;
//				//Courses c= new Courses(student[0], student[1], student [2], student[3]);
//				//student [i] = new students;
//				i++;
//				System.out.println(enrollment);
//				//Arrays.toString(enrollments)
//				
//				
//			}
//				//insert loop with string to read arrays
//				//System.out.println(values);
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}//return enrollments;
//
//	
