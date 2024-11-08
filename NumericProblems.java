import  java.lang.*;
import java.io.*;
import java.util.Scanner;

public class NumericProblems {

    public int revNum (int num){
        int rev = 0;
        while(num !=0){
            int d = num %10;
            rev = rev*10+d;
            num /= 10;

        }
        return  rev;
    }
    public boolean isPalindrome(int num){
        return  num == revNum(num);
    }
    public  boolean isPrime(int num){
        if(num<= 1) return false;
        for (int i = 2;i<Math.sqrt(num);i++){
            if(num %i == 0) return  false;
        }
        return  true;
    }
    public boolean isLeapYear(int num){
        return (num % 4 ==0 && num % 100 != 0) || (num % 400 == 0) ;
    }

    public int GreatestamongTen (int[] nums){
        int max = nums[0];
        for (int num : nums){
            if (num > max) max = num;
        }
        return max;
    }
    public int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b%a,a);

    }
    public  int findGCD(int arr[]){
        int n = arr.length;
        int result = arr[0];
        for (int ele : arr){
            result = gcd(result,ele);
            if (result == 1) return 1;

        }
        return  result;
    }
    public  long factorial(int num){
        if (num == 0 || num == 1){
            return num;
        }
        return num * factorial(num -1);
    }

    public int fib(int number){
        double phi = (1+Math.sqrt(5))/2;
        return  (int)Math.round(Math.pow(phi,number)/Math.sqrt(5));
    }
    public int[] fibList(int num){
        int[] series = new int[num];
        double phi = (1+Math.sqrt(5))/2;

        for (int i =0;i<num;i++){
            series[i] = (int)Math.round(Math.pow(phi,i)/Math.sqrt(5));
        }
        return series;

    }



    public static void main(String[] args) {
        NumericProblems np = new NumericProblems();
        Scanner sc = new Scanner(System.in);

//        System.out.println("Array Input: ");
//        int[] array = new int[10];
//        for (int i =0;i<10;i++){
//            array[i] = sc.nextInt();
//        }

        System.out.println("Enter Integer for manipulation: ");
        int number = sc.nextInt();
//
//        System.out.println("Enter Integer for manipulation: ");
//        int number1 = sc.nextInt();
//        System.out.println("Reverse a Number: "+np.revNum(number));
//
//        System.out.println("Check if a number is a palindrome: " + np.isPalindrome(number));

//        System.out.println("Check if a number is a prime: "+np.isPrime(number));
//
//        System.out.println("Fibonacci number of the number: "+np.fib(number));

//        int[] series = np.fibList(number);
//
//        System.out.println("Fib Series:" ) ;
//        for (int num : series){
//            System.out.print(num+ " ");
//        }

//        System.out.println("Check if the number is a leap year: " + np.isLeapYear(number));




//        System.out.println("Greatest among 10: "+np.GreatestamongTen(array));
//
//

//        System.out.println("GCD: "+np.gcd(number1,number));

//        System.out.println("GCD for array: "+np.findGCD(array));
//
        System.out.println("Factorial: "+np.factorial(number));
//
//        System.out.println("Is Armstrong: ");

    }
}
