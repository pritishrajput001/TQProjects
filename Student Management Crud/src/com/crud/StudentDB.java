package com.crud;

import java.util.Scanner;

public class StudentDB {
	static Scanner sc = new Scanner(System.in);
	static int z = 0;

	public void addStudet(Student stud) {
		System.out.println("Enter student id: ");
		stud.setSid(sc.nextInt());

		System.out.println("Enter student name: ");
		stud.setName(sc.next());

		System.out.println("Enter student age: ");
		stud.setAge(sc.nextInt());
	}

	public void updateStudent(Student s[], int sid) {
		for (int i = 0; i < z; i++) {
			if (s[i].getSid() == sid) {
				System.out.println(s[i].getName() + " " + s[i].getSid() + ": " + s[i].getAge());
				System.out.println("Enter student name: ");
				String name = sc.next();
				s[i].setName(name);
			}
		}
	}

	public void deleteStudent(Student[] s, int sid) {
		boolean flag = false;
		for (int i = 0; i < z; i++) {
			if (s[i].getSid() == sid) {
				flag = true;
				System.out.println(s[i].getSid() + " " + s[i].getName() + " " + s[i].getAge());
				for (int j = i; j < z - 1; j++) {
					s[j] = s[j + 1];
				}
				s[z - 1] = null;
				System.out.println("Student " + sid + "deleted successfully...");
				if (!flag) {
					System.out.println("Student not found..");
				}
				break;
			}
		}
	}

	public void viewStudent(Student s[]) {
		for (int i = 0; i < z; i++) {
			System.out.println(s[i]);

		}
	}

	public void viewStudentById(Student s[], int sid) {
		for (int i = 0; i < z; i++) {
			if (s[i].getSid() == sid) {
				System.out.println(s[i].toString());
			}
		}
	}

	public static void main(String args[]) {
		StudentDB sb = new StudentDB();

		Student s[] = new Student[2];

		Scanner sc = new Scanner(System.in);
		int select;

		do {
			System.out.println("----------Welcome to StudentDB----------");
			System.out.println("Choose options below........");
			System.out.println("1.Add student");
			System.out.println("2.Update student");
			System.out.println("3.View student");
			System.out.println("4.View Student By Id");
			System.out.println("5.Delete student");
			System.out.println("------------------------------");
			System.out.println("Enter your choice.......");
			select = sc.nextInt();

			switch (select) {
			case 1:
				if (z < s.length) {
					s[z] = new Student();
					sb.addStudet(s[z]);
					z++;
				} else {
					System.out.println("You have added mazimum students...");
				}
				break;

			case 2:
				System.out.println("Enter Student Id you want to update :");
				int id = sc.nextInt();
				sb.updateStudent(s, id);
				System.out.println("Student updated successfully!");
				break;

			case 3:
				sb.viewStudent(s);
				break;

			case 4:
				System.out.println("Enter student Id you want to view.....");
				int sid = sc.nextInt();
				sb.viewStudentById(s, sid);
				;
				break;

			case 5:
				System.out.println("Enter Id for delete");
				int sid1 = sc.nextInt();
				sb.deleteStudent(s, sid1);
				break;

			default:
				System.out.println("Invalid Input");

			}
			System.out.println("DO YOU WANT TO PERFORM MORE OPERATIONS..?  Yes-1/No-0");
			select = sc.nextInt();
		} while (select == 1);
		sc.close();
	}

}
