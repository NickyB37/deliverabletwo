
package deliveribleTwo;

import java.util.Arrays;
import java.util.Scanner;

public class values {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int checkSum = 0;

		System.out.print(" What is your message:");
		
		String input = scnr.nextLine();
		String message = input.toUpperCase();
		
		
		System.out.println("Your encoded message is : " + message);

		for (int i : message.getBytes()) {
			checkSum = checkSum + i;  
			
			
			System.out.print(i + "-" );
		}
		
		System.out.println();
		
		//System.out.println(message);
	
		System.out.print(" Message checkSum is: " + checkSum);
		
		
		
		

		

	}

}
