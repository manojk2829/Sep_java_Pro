package all_Java_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class All_Program_Practise {
    //WAP to remove duplicate characters in string.
	public static void main(String[] args) {
		  System.out.println("Remove duplicate characters from String.....");
		  String str = "manoj kushwaha java developer 42 gfd 543 1253453";
		  Set<Character> s=new HashSet<>();
		  StringBuffer sf = new StringBuffer();
		  for(int i=0;i<str.length();i++){
			  Character c=str.charAt(i);
			  if(!s.contains(c)){
				  s.add(c);
				  sf.append(c);
			  }
		  }
		  System.out.println(sf.toString());
		  System.out.println();
		  
		  System.out.println("Total number of word in String....");
		  System.out.println(str.split("\\s+").length);
		  int worldCount=1;
		  for(int i=0;i<str.length();i++){
			  if(str.charAt(i)==' ' && i<str.length()-1 && str.charAt(i+1)!=' '){
				  worldCount++;
			  }
				 
		  }
		  System.out.println("Total number of world --- > " + worldCount);
		  
		  System.out.println("Duplicate Words in Arrays......");
		  String[] ss=new String[]{"man","ma","man","java","java"};
		  Set nonduplicateSet = new HashSet<>();
		  Set duplicateSet = new HashSet<>();

            for(String string : ss){              
			  if(!nonduplicateSet.contains(string)){
				  nonduplicateSet.add(string);
			  }else{
				  duplicateSet.add(string);
			  }
		  }
		  System.out.println(duplicateSet);
		  
		  System.out.println();
		  System.out.println("Write a program to check two strings are Anagroms or not");

		  String s1="manoj";
		  String s2 = "j11onam";
		  System.out.println("Both String are Anagrams ---- > " +checkAnagramString(s1,s2));
		  
	}
	
	
	public static boolean checkAnagramString(String s1,String s2){
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
	
	
	

}
