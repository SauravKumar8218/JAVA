package java_program;

import java.util.Scanner;

public class Voting_Age_Check {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    System.out.println("Please enter your age: ");
		    int age = scanner.nextInt();
		    
		    if (age >= 18) {
		      System.out.println("You are old enough to vote in a national election!");
		    } else {
		      System.out.println("You are not old enough to vote in a national election.");
		    }

	}

}
