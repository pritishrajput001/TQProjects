package com.crud;

import java.util.Scanner;

public class CourseTest {
	static Scanner sc = new Scanner(System.in);
	static int x = 0;

	public void addCourse(Course c) {
		System.out.println("Enter course Id :");
		c.setCid(sc.nextInt());

		System.out.println("Enter course Name:");
		c.setCname(sc.next());

		System.out.println("Enter fees:");
		c.setCfees(sc.nextFloat());
		System.out.println("Course added successfully....");
	}

	public void updateCourse(Course c[], int cid) {
		for (int i = 0; i < x; i++) {
			if (c[i].getCid() == cid) {
				System.out.println(c[i].getCname() + " " + c[i].getCfees());
				System.out.println("Enter Course Name");
				String name = sc.next();
				c[i].setCname(name);
				System.out.println("Enter Fees");
				float fees = sc.nextFloat();
				c[i].setCfees(fees);
				break;
			}

		}

	}

	public void deleteCourse(Course[] c, int cid) {
		boolean flag = false;
		for (int i = 0; i < x; i++) {
			if (c[i].getCid() == cid) {
				flag = true;
				System.out.println(c[i].getCid() + " " + c[i].getCname() + " " + c[i].getCfees());
				for (int j = i; j < x - 1; j++) {
					c[j] = c[j + 1];
				}
				c[x - 1] = null;
				System.out.println("Course " + cid + " delete successfully");
				if (!flag) {
					System.out.println("Course not found");
				}
				break;
			}
		}

	}

	public void viewCourse(Course ct[]) {
		for (int i = 0; i < x; i++) {
			System.out.println(ct[i]);
		}
	}

	public void viewCourseByID(Course[] c, int cid) {
		for (int i = 0; i < x; i++) {
			if (c[i].getCid() == cid)
				System.out.println(c[i].toString());
		}
	}
}
