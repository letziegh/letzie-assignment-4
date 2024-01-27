package com.coderscampus;

public class Enrollment implements Comparable<Enrollment> {
	private Integer iD;
	private String name;
	private String course;
	private Integer grade;
	
	
	public Enrollment (Integer iD, String name, String course, Integer grade ) {
		this.iD = iD;
		this.name= name;
		this.course= course;
		this.grade = grade;
		
		
		

		
	}
	
	public Integer getiD() {
		return iD;
	}



	public void setiD(Integer iD) {
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




	public Integer getGrade() {
		return grade;
	}



	public void setGrade(Integer grade) {
		this.grade = grade;
	}



	@Override
	public String toString() {
		return "Enrollment [iD=" + iD + ", name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}

	@Override
	public int compareTo(Enrollment o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
