package all_Java_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Na;

public class Basic_Program {

	public static void main(String[] args) {
		//Fact, Palindrom, Armstrong, table, Reverse String, Reverse integer, 
		//Arrange the Arrays in order
/*	   int fact=1;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter Number...");
	   int x = s.nextInt();
	   String xxString = String.valueOf(x);
	   StringBuffer sf=new StringBuffer(xxString);
	   System.out.println(sf.reverse());*/
	   stringReverse();
      }

	public static void stringReverse(){
/*		String s = "manoj kushwaha";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		Scanner s1=new Scanner(System.in); 
		System.out.println("Enter String ...");
		   
	    String sss = s1.nextLine();
		System.out.println(s.replaceAll(sss, ""));*/
		
		String sArrays[] = new String[]{"java","mana","java","m","m"};
		Set nonDuplicateSet = new HashSet<>();
		Set DuplicateSet = new HashSet<>();
		for (String  string : sArrays) {
			if(!nonDuplicateSet.contains(string)){
				nonDuplicateSet.add(string);
			}else {
				DuplicateSet.add(string);
			}
		}
		System.out.println(DuplicateSet);
		
		int n[] = {32,324,543,16,433,536,57,542,4,547,34,77,6};
		System.out.println(Arrays.toString(n));
		int temp, small=n[0],large = n[0];
		for(int i=0;i<n.length;i++){
				if(small>n[i]){
					small= n[i];
				}else if (large < n[i]){
					large =n[i];
				}
		}
		System.out.println(small + "    " +large);
		
		
	}
}
