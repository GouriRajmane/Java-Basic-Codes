package basic_codes;

public class SumNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int num = 100, sum = 0, a=3;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum =+ i;
           
        }

        System.out.println("Sum = " + sum);
        a =+ a; // this works same as that of a+=>(a+a);
        int b=a;
        System.out.println(a);
        System.out.println(b);
	}

}
