package all_Java_Practice;

import java.util.Scanner;

public class Word_Present_or_not_in_String {
/**
 * Interview Programs --
1 - WAP to remove duplicate characters in string.  -- Done
2 - WAP to check two strings are Anagroms or not.  -- Done
3 - WAP to check number of words in string.        -- Done -- syso(str.slip("\\s+").length);
4 - WAP to reverse a string.                       -- Done
5 - WAP to remove all white space in string.       -- Done
6 - WAP to reverse each word of given String.      -- Done
7 - WAP to count vowel and consonants in string.  -- Done
8 - How to sort string in java.                    -- Done
9 - WAP to convert String to int and int to String in java. --Done

8 - WAP to print first non repaded character in string like - Kushwaha -- K.
8 - WAP to check if a String only contains digits. -- Done
9 - WAP to reverse a given string with preserving the position of space.
11- WAP to reverse a string using recursion and iteration.
12- 
13- WAP to perform pormutation of string in java.
14- WAP to check String is palindrom or not.
15- WAP to append a given String to a text file.
16- WAP to check string contains another string.
17- WAP to remove given character from string.
18- WAP to count total number of occurence of a given character in a string with loop or without loop.
19- How to find most repeated word in a test file in java.
20- How to print first repeated and non repeated character in java.
21- WAP to count number of characters no of words and no of line in a text file.
22- Unboxing and Wrapper class.
23- Collection -- Hashtable, Hashmap, Hashset. LIST and SET
24- Where we are using set and list in webdriver script.
25- Difference bitween 


Small and Large number in Arrays.
Three max value in arrays.

1 - WAP to remove duplicate characters in string.  -- Done
2 - WAP to check two strings are Anagroms or not.  -- Done
3 - WAP to check number of words in string.        -- Done -- syso(str.slip("\\s+").length);
5 - WAP to reverse a string.                       -- Done
6 - WAP to remove all white space in string.       -- Done
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = "manoj";
		System.out.println("Enter word is available in String or Not ? ---> " );
		System.out.println(str1.contains(str2));
		
		System.out.println("Given String containts only digit or not ?");

	char c=sc.next().charAt(0);
	    if((c >='a' && c <='z' || c>='A' && c<='Z')){
	    	System.out.println("All char");
	    }else{
	    	System.out.println("not");
	    }
	}
}
