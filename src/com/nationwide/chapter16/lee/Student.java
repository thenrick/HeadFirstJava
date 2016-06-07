package com.nationwide.chapter16.lee;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int gradeLevel;
	private double gpa;

	public Student(int i, String n, int gl, double g) {
		id = i;
		name = n;
		gradeLevel = gl;
		gpa = g;
	}

	public Student(int i, String n, int gl) {
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public double getGPA() {
		return gpa;
	}

	public boolean equals(Student other) {
		return this.getID() == other.getID();

	}

	public int compareTo(Student other) {

		if (this.equals(other)) {
			return 0;

		}

		else if (getID() > other.getID()) {
			return 1;

		}

		else

			return -1;
	}

	public String toString() {
		return "{ID : " + getID() + " Name : " + getName() + " Grade Level : "
				+ getGradeLevel() + " GPA : " + getGPA() + "}";

	}
}