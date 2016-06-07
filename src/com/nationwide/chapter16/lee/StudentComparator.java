package com.nationwide.chapter16.lee;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		if (s1.getGradeLevel() == s2.getGradeLevel())
			return 0;
		else if (s1.getGradeLevel() > s2.getGradeLevel())
			return 1;
		else
			return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student(10, "Mary", 12, 3.2);
		Student s2 = new Student(15, "Fred", 9, 3.6);

		System.out.println("Compare to Returns :: " + s1.compareTo(s2));
		int result = s1.compareTo(s2);

		if (result < 0)
			System.out.println(s1.getName() + " comes before " + s2.getName());
		else if (result > 0)
			System.out.println(s2.getName() + " comes before " + s1.getName());
		else
			System.out.println(s1.getName() + " is equal to " + s2.getName());

		System.out.println();

		StudentComparator newWay = new StudentComparator();
		System.out.println("Compare to Returns :: " + newWay.compare(s1, s2));
		int result2 = newWay.compare(s1, s2);

		if (result2 < 0)
			System.out.println(s1.getName() + " comes before " + s2.getName());
		else if (result2 > 0)
			System.out.println(s2.getName() + " comes before " + s1.getName());
		else
			System.out.println(s1.getName() + " is equal to " + s2.getName());

	}

}
