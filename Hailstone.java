/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

/*
Taryn Boonpongmanee
10.7.21
This program writes takes in a number and does calculations to get it down to 1
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		//gets user to enter a number
		int currentNum = readInt("Enter a number: ");
		int count = 0;
		
		//until the number equals 0
		while(currentNum != 1) {
			//if even do this computation
			if(isEven(currentNum)) {
				int evenNum = currentNum/2;
				println(currentNum + " is even, so I take half: " + evenNum);
				currentNum = evenNum;
			//if odd do this computation
			} else {
				int oddNum = (3*currentNum) + 1;
				println(currentNum + " is odd, so I make 3n + 1: " + oddNum);
				currentNum = oddNum;
			}
			count++;
		}
		
		//print out how long it took
		println("The process took " + count + " to reach 1");
	}
	
	//determine whether the number is even
	public boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}

