package myProjectt;

import java.util.Scanner;

public class factorial_number {
	
	public static void main (String [] args ) {
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number for finding factorial");
	int number = scanner.nextInt();
	
	long factorial = 1;
	
	if(number < 0) {
	     System.out.println(" please enter a  number greater than zero");
	}
	else {
		System.out.println(" the factorials are :");
		for (int i = 1 ; i<= number ; i++) {
			factorial *=i;
			System.out.print(i+ " ");
		
			
		}
	}
	System.out.println(" ");
	
	System.out.println("the factorial of the " + number + " is "+factorial);
	
	
	}

}
