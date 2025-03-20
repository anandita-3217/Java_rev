# Java Revision

This repository contains a collection of  functions implemented in Java, focusing on **string manipulation**, **numeric problem-solving** and **other basic programs**. The repository includes the main classes: `StringProblems`, `NumProb`, `BasicPrograms` and `Patterns`. Each class is designed to perform a set of operations that can be useful in various programming contexts, for last minute java programming revision. 

---

## Classes Overview

### StringProblems Class

The `StringProblems` class contains basic string manipulation methods, including:
- **Reversing a String**: Reverses the characters in a string.
- **Palindrome Check**: Verifies if a string is a palindrome.
- **String Concatenation**: Concatenates two strings together.
- **Additional String Operations**: Includes other string handling methods.

### NumProb Class

The `NumProb` class provides solutions to various numeric problems, such as:
- **Fibonacci Series Generation**: Generates the Fibonacci sequence up to a specified term.
- **Factorial Calculation**: Computes the factorial of a given number.
- **Prime Number Check**: Checks if a number is prime.
- **Palindrome Number Check**: Verifies if a number is a palindrome.
- **Greatest Common Divisor (GCD)** and **Least Common Multiple (LCM)** calculation.
- **Number Conversion**: Converts numbers between binary, decimal, and octal formats.
- **Area Calculation**: Calculates the area of geometric shapes (circle, rectangle, etc.).
- **Array Sorting**: Implements sorting algorithms such as bubble sort, insertion sort, and merge sort.

### BasicPrograms Class

The `BasicPrograms` class provides the following additional functionalities:

1. **Binary Addition**
   - **Method**: `addBin(String bin1, String bin2)`
   - **Description**: Adds two binary strings and returns the result as a binary string.

2. **Prime Number Check**
   - **Method**: `isPrime(int n)`
   - **Description**: Checks if a number `n` is prime.

3. **Prime Series Generation**
   - **Method**: `primeSeries(int n)`
   - **Description**: Generates an array of the first `n` prime numbers.

4. **Fibonacci Number at Position**
   - **Method**: `fib(int num)`
   - **Description**: Computes the Fibonacci number at a specified position `num`.

5. **Fibonacci Series Generation**
   - **Method**: `fibSeries(int num)`
   - **Description**: Generates an array containing the first `num` terms of the Fibonacci series.

6. **Sum of Even Fibonacci Terms**
   - **Method**: `evenSumofFibSeries(int N)`
   - **Description**: Computes the sum of Fibonacci numbers at even indices up to the `2 * N`-th term.

7. **Neon Number Check**
   - **Method**: `Neon(int num)`
   - **Description**: Checks if a number is a neon number, where the sum of the digits of its square equals the number itself.

8. **Vowel or Consonant Check**
   - **Method**: `VowelOrConsonant(char ch)`
   - **Description**: Checks if a character is a vowel or consonant.

---
### Patterns Class

The `Patterns` class provides functions to print various patterns of stars and numbers:

1. **StarRightTriangle**
   - **Description**: Prints a right-aligned triangle of stars.
   - **Example**:
     ```
     *
     * *
     * * *
     * * * *
     ```

2. **StarLeftTriangle**
   - **Description**: Prints a left-aligned triangle of stars.
   - **Example**:
     ```
           *
         * *
       * * *
     * * * *
     ```

3. **NumPyramid**
   - **Description**: Prints a pyramid of numbers incrementally from the top row down.
   - **Example**:
     ```
         1
       2 3 2
     3 4 5 4 3
     ```

4. **RevPyramid**
   - **Description**: Prints a reverse pyramid of stars.
   - **Example**:
     ```
     *******
      *****
       ***
        *
     ```

5. **Pyramid**
   - **Description**: Prints an upright pyramid of stars.

6. **UpperStarTriangle**
   - **Description**: Prints an upper triangle of stars.

7. **SpiralMatrix**
   - **Description**: Fills a square matrix with numbers in a spiral order.
   - **Example** (for `n = 3`):
     ```
     1 2 3
     8 9 4
     7 6 5
     ```

8. **Diamond**
   - **Description**: Prints a diamond shape with stars.

9. **DownwardRightTriangle**
   - **Description**: Prints a right triangle pointing downward.

10. **DownwardPyramidMirror**
    - **Description**: Prints a mirrored downward pyramid pattern.

11. **PascalsTriangle**
    - **Description**: Prints Pascal's triangle up to `n` rows.

12. **HollowRectangle**
    - **Description**: Prints a hollow rectangle with specified dimensions.

13. **HollowSquare**
    - **Description**: Prints a hollow square with stars around the edges.
### Problems Class
    - Problems solved using  

14. **SquareWithDiagonals**
    - **Description**: Prints a square pattern with diagonals filled in with stars.

15. **FlippedRightTriangle**
    - **Description**: Prints a right triangle with flipped alignment.
---
### Problems Class

The `Problems` class contains implementations of various programming problems and exercises, leveraging Java's functionality to solve common algorithmic challenges. This class includes:

- **Stream and Lambda Operations**: Demonstrates the use of Java Streams API and lambda expressions for data processing.
- **Collection Manipulations**: Shows techniques for working with lists, maps, and sets.
- **String Processing**: Implements various string manipulation techniques using modern Java features.
- **Functional Programming**: Showcases functional programming concepts applied to solve common problems.
- **Algorithmic Solutions**: Includes implementations of algorithms like finding duplicates, palindromes, and prime numbers.

The class provides solutions to problems such as:
- Finding the first non-repeated character in a string
- Removing duplicates from collections
- Filtering elements based on conditions
- Sorting and grouping data
- Flattening nested collections
- Calculating statistical values (sum, average, min, max)
- Identifying palindromic strings
- Partitioning data into categories
- Processing infinite streams with limitations
- Extracting sublists from collections

These implementations demonstrate modern Java programming techniques and can serve as reference examples for solving similar problems in various applications.
