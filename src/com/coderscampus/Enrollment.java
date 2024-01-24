package com.coderscampus;

public class Enrollment implements Comparable<Enrollment> {
	private String iD;
	private String name;
	private String course;
	private String grade;
	
	public Enrollment (String iD, String name, String course, String grade ) {
		this.iD = iD;
		this.name= name;
		this.course= course;
		this.grade = grade;
		
		
	}
	
	
	
	
	


	public String getiD() {
		return iD;
	}







	public void setiD(String iD) {
		this.iD = iD;
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







	public String getGrade() {
		return grade;
	}







	public void setGrade(String grade) {
		this.grade = grade;
	}







	@Override
	public String toString() {
		return "Courses [iD=" + iD + ", name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}




	@Override
	public int compareTo(Enrollment o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
