import  java.lang.*;
import java.io.*;
import java.util.Scanner;

public class NumericProblems {
    
    
    
    public static void main(String[] args) {
        // NumericProblems np = new NumericProblems();
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

        // 


    }
}
