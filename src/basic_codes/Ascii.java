package basic_codes;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		int ascii = ch;
		
		  // You can also cast char to int
        int castAscii = (int) ch;
       //int castAscii = (char) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

	}

}
