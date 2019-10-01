package october_Interview;

import java.util.Scanner;

public class Char_Occurance {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String -- > " );
		 String s = sc.nextLine();
		 char[] c=s.toCharArray();
		 int count=0;
		 for(int i=0;i<s.length();i++){
			 count=0;
			 for(int j=0;j<s.length();j++){
				 if(j<i && c[i]==c[j]){
					 break;
				 }
			 if(c[i]==c[j])
					 count++;
				 
				 if(j==s.length()-1){
					 System.out.println("number of character "+c[i] +" in String " + count );
				 }
			 }
		 }
	}
}
