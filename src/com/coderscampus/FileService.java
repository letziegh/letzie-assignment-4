package com.coderscampus;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class FileService {

	public void writeToAFile(String fileName, Enrollment[] enrollments) throws IOException {

		BufferedWriter writer1 = new BufferedWriter(new FileWriter(fileName));

		try {

			writer1.write("Student ID, Student Name, Course, Grade \n");
			for (Enrollment e : enrollments) {
				//writer1.write(e.getiD() + " " + e.getName() + " " + e.getCourse() + " " + e.getGrade() + "\n");
				writer1.write(e.getiD() + ", " + e.getName() + " ," + e.getCourse() + " ," + e.getGrade() + "\n");

			}
		} finally {
			if (writer1 != null)
				writer1.close();

		}
	}

	public Enrollment[] sortedStudentsInFileOne() {
		int counter = 0;
		FileService fileService = new FileService();
		Enrollment[] enrollments = fileService.getStudentsFromFile();
		Enrollment[] finalEnrollment = new Enrollment[33];

		Arrays.sort(enrollments, new Comparator<Enrollment>() {

			@Override
			public int compare(Enrollment o1, Enrollment o2) {

				return o2.getGrade().compareTo(o1.getGrade());
			}

		});

		for (int i = 0; i < enrollments.length; i++) {
			Enrollment enrollment = enrollments[i];
			if (enrollment.getCourse().contains("APMTH")) {
				finalEnrollment[counter] = enrollment;
				counter++;

			}

		}
		return finalEnrollment;

	}

	public Enrollment[] sortedStudentsInFileTwo() {
		int counter = 0;
		FileService fileService = new FileService();
		Enrollment[] enrollments = fileService.getStudentsFromFile();
		Enrollment[] finalEnrollment = new Enrollment[34];

		// Arrays.sort(enrollments);
		Arrays.sort(enrollments, new Comparator<Enrollment>() {

			@Override
			public int compare(Enrollment o1, Enrollment o2) {

				return o2.getGrade().compareTo(o1.getGrade());
			}

		});

		for (int i = 0; i < enrollments.length; i++) {
			Enrollment enrollment = enrollments[i];
			if (enrollment.getCourse().contains("COMPSCI")) {
				finalEnrollment[counter] = enrollment;
				counter++;

			}

		}
		return finalEnrollment;
	}

	public Enrollment[] sortedStudentsInFileThree() {
		int counter = 0;
		FileService fileService = new FileService();
		Enrollment[] enrollments = fileService.getStudentsFromFile();
		Enrollment[] finalEnrollment = new Enrollment[33];

		// Arrays.sort(enrollments);
		Arrays.sort(enrollments, new Comparator<Enrollment>() {

			@Override
			public int compare(Enrollment o1, Enrollment o2) {

				return o2.getGrade().compareTo(o1.getGrade());
			}

		});

		for (int i = 0; i < enrollments.length; i++) {
			Enrollment enrollment = enrollments[i];
			if (enrollment.getCourse().contains("STAT")) {
				finalEnrollment[counter] = enrollment;
				counter++;

			}

		}
		return finalEnrollment;
	}

	public Enrollment[] getStudentsFromFile() {
		String filePath = "student-master-list.csv";

		String outputFile1 = "course1.csv";
		String outputFile2 = "course2.csv";
		String outputFile3 = "course3.csv";

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath));

		) {
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
			// }

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

		}

		return null;

	}

}
