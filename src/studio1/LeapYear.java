package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("What year?"); 
		int year = in.nextInt(); 
		boolean by4 = year % 4 == 0 ; 
		boolean by100 = year % 100 != 0; 
		boolean by400= year % 400 == 0; 
		
		boolean isLeapYear = by4 && by100 || by400 ; 
		
		
		
		System.out.println(year + " is a leap year: " + isLeapYear); 
		
		
	}
	}

