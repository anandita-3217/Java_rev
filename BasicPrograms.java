import java.util.Scanner;


public class BasicPrograms {

    public String addBin(String bin1,String bin2){
        int sum = Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2);
        return Integer.toBinaryString(sum);
    }
    public boolean isPrime(int n){
        if (n < 2) return  false;
        for(int i = 2;i<= Math.sqrt(n);i++){
            if (n%i == 0) return false;
        }
        return  true;
    }
    public int[] primeSeries(int n) {
        int[] primes = new int[n];
        int count = 0; // count of prime numbers found
        int num = 2; // starting number to check

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }

        return primes;

    }
    public int fib(int num){
        double phi = (1+Math.sqrt(5))/2;
        return  (int) Math.round(Math.pow(phi,num)/Math.sqrt(5));
    }
    public int[] fibSeries(int num){
        int[] series = new int[num];
        for(int i = 0;i<num;i++){
            series[i] = fib(i);
        }
        return  series;
    }
    public int evenSumofFibSeries(int N){
        if (N <= 0)
            return 0;

        int fib[] = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;

        // Initializing the sum
        int s = 0;

        // Adding remaining numbers
        for (int j = 2; j <= 2 * N; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];

            // Only considering even indexes
            if (j % 2 == 0)
                s += fib[j];
        }

        return s;
    }

    public boolean Neon(int num){
        int sq = num * num;
        int sum = 0;
        while(sq>0){
            int r = sq % 10;
            sum += r;
            sq = sq /10;
        }
        if (sum == num){
            return  true;
        }

        return false;
    }
    public String VowelOrConsonant(char ch){
        String vowels = "aeiouAEIOU";
        return (vowels.indexOf(ch)!= -1)? "Vowel" : "COnsonant";

//        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
//        for( char vowel : vowels){
//            if (ch == vowel){
//                return "Vowel";
//            }
//        }
//        return "Consonant";
    }

    public static void main(String[] args) {
        BasicPrograms bp = new BasicPrograms();

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Binary Strings");
//        String bin1 = sc.next();
//        String bin2 = sc.next();
//        System.out.println("Binary Sum: "+ bp.addBin(bin1,bin2));

//        System.out.println("Enter Prime no.s up to");
//        int n = sc.nextInt();
//        int[] primes = bp.primeSeries(n);
//        System.out.println("First "+ n+" Primes: ");
//        for(int prime : primes){
//            System.out.println(prime+" ");

//        System.out.println("Enter num for even fib sum: ");
//        int fibsuminput = sc.nextInt();
//        System.out.println("Sum of Fibonacci numbers at even indices: " + bp.evenSumofFibSeries(fibsuminput));

//        System.out.println("Is Neon Number input");
//        int nip = sc.nextInt();
//        System.out.println("Is neon: "+ bp.Neon(nip));
        System.out.println("Enter String to check whether vowel or consonant ");
        char ch = sc.next().charAt(0);
        System.out.println(bp.VowelOrConsonant(ch));


        }


    }


