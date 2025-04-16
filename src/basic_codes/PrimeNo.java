package basic_codes;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=30;
		boolean flag = false;

		// 0 & 1 are not prime numbers
		if (no == 0 || no == 1) {
			flag = true;

		}
		/*
		 * for(int i=2; i<=no/2; ++i) { 
		 * // condition for non prime number 
		 * if (no % i==0) {
		 *  flag = true; 
		 *  break; 
		 *  }
		 * 
		 * }
		 */

		// Using while loop
		int i = 2;

		while (i <= no / 2) {

			// condition for non prime number
			if (no % i == 0) {
				flag = true;
				break;
			}

			++i;
		}

		if (!flag)
			System.out.println(no + "- is a prime no");
		else
			System.out.println(no + "- is not a prime no");

	}

}

/*
 //using Scanner class

public static void main(String[] args) 
{  
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter a number : ");  
    int num = sc.nextInt();  
    if (checkPrime(num)) {  
        System.out.println(num + " is a prime number");  
    }
    else 
    {  
        System.out.println(num + " is not a prime number");  
    }  
}  
public static boolean checkPrime(int num) 
{  
    if (num <= 1) 
    {  
        return false;  
    }  
    for (int i = 2; i < Math.sqrt(num); i++) 
    {  
        if (num % i == 0) 
        {  
            return false;  
        }  
    }  
    return true;  
} */ 

