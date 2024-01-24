package com.coderscampus;

public class Courses implements Comparable<Courses> {
	private int ID;
	private String name;
	private String course;
	private int grade;
	
	public Courses (int ID, String name, String course, int grade ) {
		this.ID = ID;
		this.name= name;
		this.course= course;
		this.grade = grade;
		
		
	}
	
	


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "Courses [ID=" + ID + ", name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}




	@Override
	public int compareTo(Courses o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
