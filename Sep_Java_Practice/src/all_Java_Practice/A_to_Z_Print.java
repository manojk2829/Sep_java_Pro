package all_Java_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_to_Z_Print {

	public static void main(String[] args) {
		System.out.println("Find max three number in array.........");
		int n[] = {32,54,54,4,35,65,62,6,7,40};
		int max1=0,max2=0,max3=0; int m1=0,m2=0,m3=0;
		for(int i=0;i<n.length;i++){
			if(max1<n[i]){
				max2=max1;
				max1=n[i];
			}else if(max2<n[i]){
				max2=n[i];
			}else if(max3<n[i]){
				max3=n[i];
			}
		}
		System.out.println(max1 +"  --- " +max2+"  --- " +max3);

		System.out.println("Find number of word in String.");
		String s  ="manoj kushwaha satish manoj";
		System.out.println(s.split("\\s+").length);

		System.out.println();
		System.out.println("Apply Sorting in string.");
		char[] C=s.toCharArray();
		Arrays.sort(C);
		String ssss =new String(C);
		System.out.println(ssss);


		System.out.println();
		System.out.println("Reverse the String....");
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());

		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("Remove blank space from given string");
		String NewString = s.replaceAll("\\s+", "");
		System.out.println(NewString);

		System.out.println("Remove Duplicate word from String....");

		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<s.length();i++){
			Character ch=s.charAt(i);
			if(!set.contains(ch)){
				set.add(ch);
				sf.append(ch);
			}
		}
		System.out.println(sf.toString());

		System.out.println();
		System.out.println("Find out number of vowal and consonant in String");
		int Vco=0,Cco=0;
		System.out.println();
		for(int i=0;i<s.length();i++){
			Character ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				Vco++;
			}else if(ch>='a' && ch<='z'){
				Cco++;
			}
		}
		System.out.println("Vowal -- > " + Vco);
		System.out.println("Consunant -- > " + Cco);

		System.out.println("Find out duplicate String in array list...");
		String[] str = new String[]{"312","t","fds","t","ma","ma","312"};
		Set nonduplicate = new HashSet<>();
		Set duplicate = new HashSet<>();
		for (String ss : str) {
			if(!nonduplicate.contains(ss)){
				nonduplicate.add(ss);
			}else{
				duplicate.add(ss);
			}
		}
		System.out.println(duplicate);

		int string1 = 12345;
		String number = "manoj12345";
		String total = String.valueOf(string1)+number;
		System.out.println(total);
		String s1="1234";
		int nuu=Integer.parseInt(s1);
		int xx=-234;
		System.out.println(nuu+xx);
		String ss1 = "manoj";
		String ss2 = "joNam";
		System.out.println("Both string is Anagram --- > " + anagramTest(ss1,ss2) );
		
		System.out.println("Booble sorting ---------- > ");

		int no[] = {4,546,-543,324,5,67,6,43,3,56,435};
		System.out.println(Arrays.toString(no));
		int temp;
		for(int i=0;i<no.length;i++){
			for(int j=i+1;j<no.length;j++){
				if(no[i]>no[j]){
					temp = no[i];
					no[i]=no[j];
					no[j]= temp;
				}
			}
			System.out.print(no[i]+", ");
		}

		System.out.println();
		System.out.println("Small and Large number in Arrays" );
		int small=no[0], large =no[0];
		for(int i=0;i<no.length;i++){
			if(small>no[i]){
				small = no[i];
			}else if(large < no[i]){
				large = no[i];
			}
		}
		System.out.println("Small ----- > " + small +" and large Number ---- > " + large);

	}


	public static boolean anagramTest(String s1,String s2){

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}

}


/*int n[] = {32,54,54,4,35,65,62,6,7,40};
		int max1=0,max2=0,max3=0;
		for(int i=0;i<n.length;i++){
			if(max1<n[i]){
				max2=max1;
				max1=n[i];
		}else if(max2<n[i]){
			max2=n[i];
		}else if(max3<n[i]){
			max3=n[i];
		}
	}
		System.out.println(max1 +"  --- " +max2+"  --- " +max3);
 */


/*	int n[] = {32,54,654,4,35,65,62,6,7};
		int temp;
		System.out.println(Arrays.toString(n));
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.print(n[i]+", ");*/



//Scanner sc=new Scanner(System.in);
//System.out.println("Enter any Number ---- > " );



/*int num = sc.nextInt();
			if(num%2==0){
				System.out.println("number is even --- > " + num);
			}else{
				System.out.println("given number is odd --- > " + num);
			}
		}*/

/*String str[] = new String[]{"java","ma","java","manoj","ma"};
		Set nonDuplicateSet=new HashSet<>();
		Set DuplicateSet=new HashSet<>();

		for (String string : str) {
			 if(!nonDuplicateSet.contains(string)){
				 nonDuplicateSet.add(string);
			 }else{
				 DuplicateSet.add(string);
			 }
		}		
		System.out.println(DuplicateSet);
	     /*String str ="manoj kushwaha";
	     Set<Character> s=new HashSet<>();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<str.length();i++){
	    	 Character c=str.charAt(i);
	    	 if(!s.contains(c)){
	    		 s.add(c);
	    		 sb.append(c);
	    	 }
	     }
	     System.out.println(sb.toString());*/

