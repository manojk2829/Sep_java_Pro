package all_Java_Practice;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Remove_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(str.replaceAll("\\s+", " * Space * "));
        System.out.println(str.split("\\s+").length);
        int V=0,C=0;
        for(int i=0;i<str.length();i++){
        	 Character ch1 = str.charAt(i);
        	 if(ch1 == 'a'){  
        		 V++;
        	 }
        }
   	    System.out.println(str.replace('a', 'A'));
        System.out.println(V);
        
        ArrayList al = new ArrayList();
        List l = Collections.synchronizedList(al);
       
	}   

}
