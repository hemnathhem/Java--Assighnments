package Assighnment;

import java.util.Scanner;

public class Cab_Fare {

	int fare;
	int d;

	public Cab_Fare() {
		fare = 20;

	}

	public Cab_Fare(int amt) {

		fare = amt;
	}

	void showFare() {
		System.out.println("Total Fare is :" + fare);
	}

}

class RideCab {
	public static void main(String[] args) {
		int cd;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cab distance from user(For pickup):");
		cd = sc.nextInt();
		if (cd > 5) {
			Cab_Fare ob = new Cab_Fare(20 + 10 * (cd - 4));
			System.out.println("Enter the Distance Travelled by user :  ");
			ob.d = sc.nextInt();
			ob.fare = ob.fare + 20 * ob.d;
			ob.showFare();

		} else {
			Cab_Fare ob = new Cab_Fare();
			System.out.println("Enter the Distance Travelled by user :  ");
			ob.d = sc.nextInt();
			ob.fare = ob.fare + 20 * ob.d;
			ob.showFare();
		}
		
	}

}
