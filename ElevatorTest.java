//---------------------------------------------------------------------------------------------------------
// ElevatorTest.java					Author: Debra Ragland 				CPSC 50100
//
// This is the more verbose version of my elevator code. 
// 
// The program is designed to interactively "pick up a passenger" from their location and bring 
//	and them to their desired destination. The elevator is resting in the elevator at the start of
// 		of the program and is designed to pick one passenger up and and take them to a different location.
//----------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class ElevatorTest {

	static int[] bldg = { 0, 1, 2 };
	static int zone1, zone2;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
// Alert the user that the elevator is in the basement and ask them what floor they're on.

		System.out.print("The elevator is currently in the basement (B...).");
		System.out.println();
		System.out.print("On which floor are you waiting for the elevator? "
				+ "Please select 0 for basement, 1 for 1st floor, or 2 for second floor: ");
		zone1 = scan.nextInt();

// From the basement, pick up the passenger.
		
		if (zone1 == bldg[0]) {
			System.out.println("The elevator doors are open. Please enter.");
		} else if (zone1 == bldg[1]) {
			System.out.println("The button has been pushed at 1.");
			System.out.println("The elevator is going up.");
			System.out.println("B...");
			System.out.println("1...");
		} else if (zone1 == bldg[2]) {
			System.out.println("The button has been pushed at 2.");
			System.out.println("The elevator is going up.");
			System.out.println("B...");
			System.out.println("1...");
			System.out.println("2...");
		}
	
// Alert the user that the elevator has arrived at their floor.
		if (zone1 == bldg[1]) {
			System.out.println("The doors are now open at 1.");
		} else if (zone1 == bldg[2]) {
			System.out.print("The doors are now open at 2.");
		}
		System.out.println();

// Ask the user where they want the elevator to take them. The elevator moves in the specfied direction.
		System.out.print("Where would you like the elevator to take you?");
		zone2 = scan.nextInt();
		System.out.println("The elevator doors are now closed.");

		if (zone1 > zone2) {
			if (zone1 == bldg[2] && zone2 == bldg[1]) {
				System.out.println("The elevator is going down (D).");
				System.out.println("2...");
				System.out.println("1...");
				System.out.println("The doors are now open at 1. Please exit the elevator.");
				System.out.println("The doors are now closed.");
			} else if (zone1 == bldg[1] && zone2 == bldg[0]) {
				System.out.println("The elevator is going down (D).");
				System.out.println("1...");
				System.out.println("B...");
				System.out.println("The doors are now open at B. Please exit the elevator.");
				System.out.println("The doors are now closed.");
			} else if (zone1 == bldg[2] && zone2 == bldg[0]) {
				System.out.println("The elevator is going down (2D).");
				System.out.println("2...");
				System.out.println("1...");
				System.out.println("B...");
				System.out.println("The doors are now open at B. Please exit the elevator.");
				System.out.println("The doors are now closed.");
			}
		}
		if (zone1 < zone2) {
			if (zone1 == bldg[1] && zone2 == bldg[2]) {
				System.out.println("The elevator is going up again.");
				System.out.println("1...");
				System.out.println("2...");
				System.out.println("The doors are now open at 2. Please exit the elevator.");
				System.out.println("The doors are now closed.");
			} else if (zone1 == bldg[0] && zone2 == bldg[1]) {
				System.out.println("B...");
				System.out.println("1...");
				System.out.println("The doors are now open at 1. Please exit the elevator.");
				System.out.println("The doors are now closed.");
			} else if (zone1 == bldg[0] && zone2 == bldg[2]) {
				System.out.println("The elevator is going up (2U).");
				System.out.println("B...");
				System.out.println("1...");
				System.out.println("2...");
				System.out.println("The doors are now open at 2. Please exit the elevator.");
				System.out.println("The doors are now closed.");
			}

		}
		scan.close();
	}
	
}
