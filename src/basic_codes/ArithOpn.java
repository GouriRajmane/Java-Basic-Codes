package basic_codes;
import java.util.Scanner;

public class ArithOpn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number:");
		int a = scan.nextInt();

		System.out.print("Enter Second number:");
		int b = scan.nextInt();
		scan.close();

		int sum = a + b;
		System.out.println("Addition is:" + sum);

		int sub = a - b;
		System.out.println("Substraction is:" + sub);

		int mul = a * b;
		System.out.println("Multipliaction is:" + mul);

		int div = a / b;
		System.out.println("Division is:" + div);

	}

}