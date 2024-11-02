/*
Taryn Boonpongmanee
This program writes the first n number of prime numbers
 */

import acm.program.*;

public class Primes extends ConsoleProgram{
	public void run() {
		//get user to enter a number that will be used for the number of primes
		int numOfPrimes = readInt("Enter a num n: ");
		//start at 2, the first prime
		int startingNum = 2;
		//var to count what prime you are at
		int count = 0;
		//until you have printed out the num of primes the user entered
		while(count < numOfPrimes) {
		
				if(isPrime(startingNum)) {
					println(startingNum);
					count++;
				}
				startingNum++;
		}
	}
	//determine whether number is prime
	public boolean isPrime(int num) {
		//divide by everything under the number you are checking
		for(int divisible = 2; divisible < num; divisible++) {
			if(num % divisible == 0) {
				return false;
			}
		}
		return true;
	}
}
