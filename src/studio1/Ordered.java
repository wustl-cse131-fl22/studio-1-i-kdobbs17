package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean xGreaterThanY = x-y > 0; 
		boolean yGreaterThanX = y-z > 0 ; 
		boolean xLessThanY= x-y < 0; 
		boolean yLessThanX = y-z < 0; 
	
		boolean isOrdered = xGreaterThanY && yGreaterThanX || xLessThanY && yLessThanX;
		
		System.out.println(isOrdered); 
		
		
		
				
	}

}
