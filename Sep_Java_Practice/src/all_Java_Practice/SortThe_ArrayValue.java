package all_Java_Practice;

import java.util.Arrays;

public class SortThe_ArrayValue {

	public static void main(String[] args) {
		String str = "manoj xzy kushwaha";
          char[] ch=str.toCharArray();
          
          Arrays.sort(ch);
          String s = new String(ch);
          System.out.println(s);
	}

}
