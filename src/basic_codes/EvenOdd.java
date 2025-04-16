package basic_codes;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number:");
		int no = sc.nextInt();

		/*
		 * if(no % 2==0) System.out.println(no +"-is Even no."); else
		 * System.out.println(no +"-is Odd no.");
		 */

		String evenodd = (no % 2 == 0) ? "EVEN" : "ODD";
		System.out.println(no + "-is" + evenodd);
	}

}
