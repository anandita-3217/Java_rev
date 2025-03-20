import  java.lang.*;
import java.io.*;
import java.util.Scanner;

public class NumericProblems {
    static boolean isPrime(int num){
        if(num <= 1) return  false;
        return IntStream.rangeClosed(2,(int) Math.sqrt(num)).noneMatch(n -> num % n == 0);
    }
    
    
    public static void main(String[] args) {
        
        // Print a list using lambda experssions
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        names.forEach(name-> System.out.println(name));

        // Fliter all the even from  a list using Streams
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evens);

        // Find the maximum value in a list using Streams
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6);
        int max = numbers1.stream().max(Integer::compare).orElse(0);
        System.out.println(max);

        //  Convert a list of strings to uppercase
        List<String> names1 = Arrays.asList("alice","bob","charlie");
        List<String> upper = names1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);

        //  Group strings by their length using groupingBy
        List<String> names2 = Arrays.asList("alice","bob","charlie");
        Map<Integer,List<String>> grouped = names2.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);

        // Find the sum of numbers using reduce()
        List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6);
        int sum = numbers2.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        // Count word occurances in a list using groupingBy()
        List<String> fruit = Arrays.asList("apples","bananas","apples");
        Map<String ,Long> counts = fruit.stream().collect(Collectors.groupingBy(w -> w,Collectors.counting()));
        System.out.println(counts);

        // Concatenate strings using joining()
        List<String> words = Arrays.asList("Java","is","awesome");
        String sentence = words.stream().collect(Collectors.joining(" "));
        System.out.println(sentence);

        // FInd the first non repeated character in String
        String str = "swiss";
        Character res = str.chars().mapToObj(c -> (char) c).filter(ch->str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(res);

        // Use stream.distinct to remove duplicates from a list
        List<Integer> nums = Arrays.asList(1,2,3,4,4,2,5,5,6);
        List<Integer> distinct = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        // Find all elements starting with "A" in a list
        List<String> names3 = Arrays.asList("Alice","Bob","Charlie","Alex","Annabeth");
        List<String> Anames = names3.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(Anames);


        // Sort a list of strings alphabetically in reverse order
        List<String> names4 = Arrays.asList("Dexter","Charlie","Frank","Bob","Elena","Alice");
        List<String> alphaSort = names4.stream().sorted().collect(Collectors.toList());
        System.out.println(alphaSort);

        List<String> alphaSortRev = names4.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(alphaSortRev);

        // Flatten a List using flatMap()
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(1,2,3));
        List<Integer> flat = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(nestedList);
        System.out.println(flat);


        //  Use Collectors.partitionBy() to separate  even and odd numbers
        List<Integer> nums2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> parted = nums2.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(parted);

        // Find the second highest number in a List
        List<Integer> nums4 = Arrays.asList(1,2,3,4,56,78);
        int max_2 = nums4.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new RuntimeException("None found"));
        System.out.println(max_2);

        // Count the frequency of characters in a string using Streams
        String str = "java";
        Map<Character,Long> freq = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting() ));
        System.out.println(freq);

        // Generate an infinite stream of even numbers and limit it to 10 elements
        List<Integer> evennums = Stream.iterate(0,n-> n+2).limit(10).collect(Collectors.toList());
        System.out.println(evennums);

        //  Check if all elements in a list are greater than a given number
        List<Integer> nunums = Arrays.asList(10,20,30);
        int k = 100;
        boolean allGreater = nunums.stream().allMatch(n-> n > k);
        System.out.println(allGreater);

        // Find the average of a list of numbers
        List<Integer> findAvg = Arrays.asList(10,20,30,40);
        double avg = findAvg.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);

        // Count occurances of eac word in a sentence
        String sen = "Java is fun and Java is awesome";
        Map<String,Long> wordCount = Arrays.stream(sen.split(" ")).collect(Collectors.groupingBy(word -> word,Collectors.counting()));
        System.out.println(wordCount);

        // Find the longest word in a list
        List<String> strList = Arrays.asList("apple","banana","cherry","date");
        String longest = strList.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(longest);

        // Merge 2 lists into a single list using flatMap()
        List<Integer> mList1 = Arrays.asList(1,2,3);
        List<Integer> mList2 = Arrays.asList(4,5,6);
        List<Integer> merged = Stream.of(mList1,mList2).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(merged);

        // Find the first element in a Stream greater than given m
        int m = 10;
        List<Integer> gList = Arrays.asList(5,8,12,3,20);
        int first = gList.stream().filter(n-> n > m).findFirst().orElse(-1);
        System.out.println(first);

        // Find the minimum value in  aliist using Streams
        List<Integer> minList = Arrays.asList(10,20,5,15);
        int min = minList.stream().min(Integer:: compareTo).orElseThrow(() -> new RuntimeException("No minimum value"));
        System.out.println(min);
        
        // Use Stream.generate() to create a list of random numbers

        List<Double> randomNumbers = Stream.generate(Math::random).limit(5).collect(Collectors.toList());
        System.out.println(randomNumbers);

        // Find duplicates in a list usin Stream
        List<Integer> dupnumbers = Arrays.asList(1,2,3,4,3,2);
        Set<Integer> duplicates =  dupnumbers.stream().filter(n-> Collections.frequency(dupnumbers,n) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);

        // Partion a list primes and non primes
        List<Integer> primesAndNon = Arrays.asList(1,2,3,4,5,6,8,9,10);
        Map<Boolean,List<Integer>> parted2 = primesAndNon.stream().collect(Collectors.partitioningBy(num -> isPrime(num)));
        System.out.println(parted2);

        // Use Stream.flatMap() to process nested collections
        List<List<String>> nestedStringList =  Arrays.asList(
                Arrays.asList("Alice","Bob"),
                Arrays.asList("Charlie","Dev")
        );
        List<String> flatStringList = nestedStringList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatStringList);

        // Calculate the factorial of a number using Streams
        int fac  = 5;
        int factorial = IntStream.rangeClosed(1,fac).reduce(1,(a,b) -> a*b);
        System.out.println(factorial);

        // Use Stream.skip() and Stram.limit to extract sublists

        List<Integer> exnumber = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> sublist = exnumber.stream().skip(2).limit(3).collect(Collectors.toList());;
        System.out.println(sublist);

        // Use Collectors.teeing() to compute 2 oprations on Stream
        List<Integer> number_op = Arrays.asList(1,2,3,4,5,6,7);
        Map<String,Double> results = number_op.stream().collect(Collectors.teeing(
                Collectors.summingDouble(n -> n),Collectors.averagingDouble(n -> n),(sum,avg) -> Map.of("Sum",sum,"Average",avg)
        ));
        System.out.println(results);

        // Find all the palindromic strings in a list
        List<String> strs = Arrays.asList("anna","madam","racecar","java","level","hello","mister");
        List<String> palindromicStrings = strs.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());
        System.out.println(palindromicStrings);

        // 

    }
}
