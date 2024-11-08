public class NumProb {

    // Reverse a Number
    public int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    // Check if a Number is a Palindrome
    public boolean isPalindromeNumber(int number) {
        return number == reverseNumber(number);
    }

    // Check if a Number is Prime
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Check if a Year is a Leap Year
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Find the Greatest Among Ten Numbers
    public int greatestAmongTen(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    // Generate Fibonacci Series up to n Terms
    public int[] fibonacciSeries(int terms) {
        int[] series = new int[terms];
        double phi = (1 + Math.sqrt(5)) / 2;

        for (int i = 0; i < terms; i++) {
            series[i] = (int) Math.round(Math.pow(phi, i) / Math.sqrt(5));
        }

        return series;
    }


    // Calculate GCD (Greatest Common Divisor)
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Calculate Factorial
    public long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Check if a Number is an Armstrong Number
    public boolean isArmstrong(int number) {
        int sum = 0, temp = number, digits = String.valueOf(number).length();
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == number;
    }

    // Calculate Area of a Circle
    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate Area of a Triangle
    public double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Swap Two Numbers
    public void swap(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }

    // Calculate LCM of Two Numbers
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Calculate Average of Two Numbers
    public double average(int a, int b) {
        return (a + b) / 2.0;
    }

    // Calculate Sum of Digits of a Number
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Calculate Square Root without using Math.sqrt
    public double squareRoot(int number) {
        double guess = number / 2.0;
        double precision = 0.00001;
        while (Math.abs(guess * guess - number) > precision) {
            guess = (guess + number / guess) / 2.0;
        }
        return guess;
    }

    // Check if a Number is Odd or Even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int fibonacciNthTerm(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    // Main method for testing
    public static void main(String[] args) {
        NumProb np = new NumProb();

        // Testing reverseNumber
        System.out.println("Reversed Number: " + np.reverseNumber(1234));

        // Testing isPalindromeNumber
        System.out.println("Is Palindrome Number: " + np.isPalindromeNumber(121));

        // Testing isPrime
        System.out.println("Is Prime: " + np.isPrime(17));

        // Testing isLeapYear
        System.out.println("Is Leap Year: " + np.isLeapYear(2024));

        // Testing greatestAmongTen
        int[] numbers = {1, 5, 3, 9, 2, 8, 6, 7, 4, 10};
        System.out.println("Greatest Among Ten: " + np.greatestAmongTen(numbers));

        // Testing fibonacciSeries
        int[] fibonacci = np.fibonacciSeries(10);
        System.out.print("Fibonacci Series: ");
        for (int num : fibonacci) System.out.print(num + " ");
        System.out.println();

        // Testing gcd
        System.out.println("GCD of 54 and 24: " + np.gcd(54, 24));

        // Testing factorial
        System.out.println("Factorial of 5: " + np.factorial(5));

        // Testing isArmstrong
        System.out.println("Is Armstrong: " + np.isArmstrong(153));

        // Testing areaOfCircle
        System.out.println("Area of Circle with radius 5: " + np.areaOfCircle(5));

        // Testing areaOfTriangle
        System.out.println("Area of Triangle: " + np.areaOfTriangle(5, 10));

        // Testing swap
        int[] swapNumbers = {5, 10};
        np.swap(swapNumbers);
        System.out.println("Swapped Numbers: " + swapNumbers[0] + ", " + swapNumbers[1]);

        // Testing lcm
        System.out.println("LCM of 12 and 15: " + np.lcm(12, 15));

        // Testing average
        System.out.println("Average of 10 and 20: " + np.average(10, 20));

        // Testing sumOfDigits
        System.out.println("Sum of Digits of 123: " + np.sumOfDigits(123));

        // Testing squareRoot
        System.out.println("Square Root of 25: " + np.squareRoot(25));

        // Testing isEven
        System.out.println("Is Even: " + np.isEven(4));

        // Testing fibonacciNthTerm
        int term = 10;
        System.out.println("The " + term + "th Fibonacci term is: " + np.fibonacciNthTerm(term));


    }
}
