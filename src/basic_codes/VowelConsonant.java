package basic_codes;
import java.util.Scanner;
public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        //char ch1 = scanner.next().toUpperCase().charAt(0);
        

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Input is not a valid alphabet.");
        }
        
        int castAscii = (int) ch;
        System.out.println("Ascii value of entered character: "+castAscii);
        
     
    }
}
/*
 *     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println("Input is not a valid alphabet.");
                }
        }
    }
}
 * */
