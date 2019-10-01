package october_Interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_Char_in_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String -- > ");
		String s=sc.nextLine();
		Set nonduplicate = new HashSet();
		Set duplicate = new HashSet();
		for(int i=0;i<s.length();i++){
			Character ch=s.charAt(i);
			if(!nonduplicate.contains(ch))
				nonduplicate.add(ch);
			else 
				duplicate.add(ch);
		}
		System.out.println("Duplicate character -- > " + duplicate);

	}

}
