package delete_package;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class All_Programs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter --");
		int n = sc.nextInt();
		int temp,digit,rev=0;
		temp=n;
		while(n>0){
			digit = n%10;
			rev=(digit*digit*digit)+rev;
			n=n/10;
		}
		if(temp==rev){
			System.out.println(rev + " -- > Palindrom");
		}else{
			System.out.println("Not");
		}
		
		
		
		
		
/*		int n[] = {32,325,12,312,-546,324,4,432,17,3};
		int small=n[0],large=n[0];
		for(int i=0;i<n.length;i++){
				if(small>n[i]){
					small=n[i];
				}else if(large<n[i]){
					large=n[i];
				}
		}
		System.out.println(small+ " " +large);*/

		
		//Print number of Word 
/*		Scanner sc=new Scanner(System.in);
		System.out.println("Enter --");
		String str = sc.nextLine();
		System.out.println(str.split("\\s+").length);
		System.out.println(str.replaceAll("\\s+", ""));
		int V=0,C=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
				V++;
			}else if(c>='a' && c<='z'){
				C++;
			}
		}
		System.out.println(V +"   "+ C);*/
				
		//Bobble Sort --
/*		int n[] = {32,325,12,312,546,324,4,432,17,3};
		System.out.println(Arrays.toString(n));
		int temp;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.print(n[i]+",");
		}
*/
		
		//String occurence in Array.
/*		String s[] ={"s","ma","s","manoj","ma"};
		System.out.println();
		Set remove = new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for (String st : s) {
			if(!remove.contains(st)){
				remove.add(st);
				sb.append(st +",");
			}
     	}
		System.out.println(sb.toString());*/
		
/*		String str = "manoj kushwaha mca";
		Set remove = new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			Character ch=str.charAt(i);
			if(!remove.contains(ch)){
				remove.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());*/
		
		
/*		String str = "manoj kushwaha mca";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			count=0;
		for(int j=0;j<ch.length;j++){
			if(j<i && ch[i]==ch[j]){
				break;
			}if(ch[i]==ch[j]){
				count++;
			}if(j==ch.length-1){
				System.out.println(ch[i] +"  "+count);
			}
		}
	}
*/
		
		
/*		String s[] ={"s","ma","s","s","manoj","ma"};
		int count=0;
		for(int i=0;i<s.length;i++){
			count=0;
			for(int j=0;j<s.length;j++){
				if(j<i && s[i]==s[j]){
					break;
				}if(s[i]==s[j]){
					count++;
				}if(j==s.length-1){
					System.out.println(s[i]+" "+count);
				}
			}
		}*/
		
/*		String s[] ={"s","ma","s","s","manoj","ma"};
		Set non = new HashSet<>();
		Set duplicate = new HashSet<>();
		
		for (String str : s) {
			if(!non.contains(str)){
				non.add(str);
			}else{
				duplicate.add(str);
			}
		}
		System.out.println(duplicate);
		
		String str = "manoj kushwaha";
		Set non1 = new HashSet<>();
		Set duplicate1 = new HashSet<>();
        for(int i=0;i<str.length();i++){
        	Character ch=str.charAt(i);
        	if(!non1.contains(ch)){
        		non1.add(ch);
        	}else{
        		duplicate1.add(ch);
        	}
        }
		
		System.out.println(duplicate1);*/
	}
}
