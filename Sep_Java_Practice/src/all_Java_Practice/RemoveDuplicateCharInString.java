package all_Java_Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		String str = "manojKushwahamanoj";
		StringBuffer sb=new StringBuffer();
		Set<Character> set= new HashSet<>();
	    for(int i=0;i<str.length();i++){
	    	Character c=str.charAt(i);
	    	if(!set.contains(c)){
	    		set.add(c);
	    		sb.append(c);
	    	}
	    }
	    System.out.println(sb.toString());
	    
	    int n1=0,n2=1,n3;
	    System.out.print(n1+" "+n2);
		for(int i=0;i<=10;i++){
			n3=n1+n2;
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
		int a=10,b=15;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+ "  "+b);
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int --- > ");
		int n = sc.nextInt();
		int sum=0;int r;
		int temp=n; 
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
		    n=n/10;
		}
		if(temp==sum){
			System.out.println(sum+ " Palindrom");
		}else{
			System.out.println("Not");
		}
		/*int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);*/
		
		
		
		/*Set<Character> s = new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			Character ch = str.charAt(i);
			if(!s.contains(ch)){
				s.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());*/
	}
}
