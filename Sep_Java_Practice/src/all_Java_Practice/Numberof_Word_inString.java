package all_Java_Practice;

import java.util.HashSet;
import java.util.Set;

public class Numberof_Word_inString {

	public static void main(String[] args) {
		String str = "manoj kushwaha sarita kushwaha";
		System.out.println(str.split("\\s+").length);
		Set<Character> s=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			Character c=str.charAt(i);
			if(!s.contains(c)){
				s.add(c);
				sb.append(c);
			}

		}
		System.out.println(sb.toString());
	}
}
