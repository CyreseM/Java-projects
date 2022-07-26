package Vin;

import java.util.Scanner;

public class StudentDatabaaseApp {

	public static void main(String[] args) {
		//Ask how many students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students =  new Student[numOfStudents];
		//Create a number of new students
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
	}

}
