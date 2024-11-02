//Taryn Boonpongmanee
//Find Range

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		//explanation text
		println("This program finds the largest and smallest numbers.");
		
		//defining variables
		int endNum = 0;
		int currentNum = readInt("? ");
		int smallestNum = currentNum;
		int largestNum = currentNum;
		
		//while the number entered does not equal ?
		while(currentNum != endNum) {
			//user enters number
			currentNum = readInt("? ");
			
			//if smaller, replace smallestNum variable with currentNum
			if(currentNum < smallestNum) {
				smallestNum = currentNum;
			}
			
			//if bigger, replace largestNum variable with currentNum
			if(currentNum > largestNum) {
				largestNum = currentNum;
			}
		}
		
		//prints smallest and largest numbers
		println("smallest: " + smallestNum);
		println("largest: " + largestNum);
	}
}

