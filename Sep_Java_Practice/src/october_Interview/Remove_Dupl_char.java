package october_Interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Dupl_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String -- > ");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		Set duplicate = new HashSet();
		
		for(int i=0;i<s.length();i++){
			Character ch=s.charAt(i);
			if(!duplicate.contains(ch)){
				duplicate.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}

}
