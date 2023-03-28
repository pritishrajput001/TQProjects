package com.crud;

import java.util.Scanner;

public class CourseMain {
	public static void main(String[] args) {

		CourseTest cdb = new CourseTest();

		Course c[] = new Course[5];
//	

		Scanner sc = new Scanner(System.in);
		int choice;
		int x = 0;

		do {
			System.out.println("__Welocme to CourseDB__");
			System.out.println("Choose Following Options: ");
			System.out.println("1.Add Course");
			System.out.println("2.Update Course");
			System.out.println("3.View Course");
			System.out.println("4.View Course By Id");
			System.out.println("5.Delete Course");
			System.out.println("-------------------------");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				// for (int i = 0; i < c.length; i++) {
				if (x < c.length) {
					c[x] = new Course();
					cdb.addCourse(c[x]);
					x++;
				} else {
					System.out.println("Courses are full....");
				}

				// }
				break;
			case 2:
				System.out.println("Enter Course Id to update :");
				int id = sc.nextInt();
				cdb.updateCourse(c, id);
				System.out.println("Course updated successfully!");
				break;

			case 3:
				cdb.viewCourse(c);
				break;

			case 4:
				System.out.println("Enter course id you want to view....");
				int cid1 = sc.nextInt();
				cdb.viewCourseByID(c, cid1);
				break;

			case 5:
				System.out.println("Enter Id for delete");
				int cid = sc.nextInt();
				cdb.deleteCourse(c, cid);
				break;

			default:
				System.out.println("Invalid Input");

			}
			System.out.println("Do you want to perform more operation Yes-1/No-0");
			choice = sc.nextInt();
		} while (choice == 1);
		sc.close();

	}
}