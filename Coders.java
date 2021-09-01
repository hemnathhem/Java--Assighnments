package Assighnment;

import java.security.DomainCombiner;
import java.util.Scanner;

//Day 1 Assighnment

public class Coders {

	public static void main(String[] args) {

		int Roll;
		String Name;
		float marks;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the roll  number");
		Roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		Name = sc.next();
		sc.nextLine();
		System.out.println("Enter Mark");
		marks = sc.nextFloat();
		sc.nextLine();
		System.out.println(
				"Roll number is " + Roll + "  " + "Student name " + Name + " " + "Student Mark" + "  " + marks);

//Day 2 Assighnment

		int X = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		int Z = X + Y;
		System.out.println("X value is" + " " + X + " " + "and , " + "Y value is" + " " + Y + " ," + "Sum Z is " + Z);

	}
}
