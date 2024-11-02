//Taryn Boonpongmanee
//Pythagorean Theorem

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		//explanation text
		println("This program finds the Pythagorean Theorem of two numbers.");
		
		//gets user to enter numbers
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		
		//computes pythagorean theorem for the numbers entered
		int total = (a*a) + (b*b);
		double c = Math.sqrt(total);
		
		//print answer
		println("The answer is " + c + ".");
	}
}
