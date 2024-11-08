import  java.lang.*;
import java.util.*;
public class StringProblems {
    public String reverse(String input){
        return new StringBuilder(input).reverse().toString();
    }
    public boolean isPalindrome(String original){
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
    public String toBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }
    public int toDecimal(String binary ){
        return Integer.parseInt(binary,2);
    }

    public String concatStrings(String s1 , String s2){
        return s1 + s2;
    }

    public String binaryToOctal(String binary){

        return Integer.toOctalString(Integer.parseInt(binary,2));
    }

    public String decimalToOctal (int decimal){
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {
        StringProblems sols = new StringProblems();

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Input:");

        String input = sc.next().toLowerCase();

        String rev = sols.reverse(input);
        System.out.println("Reversed String: "+rev);

        boolean palindrome = sols.isPalindrome(input);
        System.out.println("Is Palindrome: "+palindrome);

        System.out.println("Enter Decimal: ");
        int decimal = sc.nextInt();
        String bin = sols.toBinary(decimal);
        String octd = sols.decimalToOctal(decimal);
        System.out.println("Binary: "+ bin);
        System.out.println("Octal: "+ octd);

        System.out.println("Enter Binary: ");
        String binary  = sc.next();
        String octal = sols.binaryToOctal(binary);
        int dec = sols.toDecimal(binary);
        System.out.println("Decimal: "+dec);
        System.out.println("Octal: "+octal);

        String concat = sols.concatStrings(binary,input);
        System.out.println("s1+s2: "+concat);

    }
}
