package all_Java_Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class PrioritySequesnce {
	
	@Test(priority=1)
	public void test1(){
        for(char c='a';c<='z';c++){
        	System.out.print(c+",");
        }

   }
	
	@Test(priority=2)
	public void test2(){
	  System.out.println("test 2");	
	  String[] str = new String[]{"manoj","java","ma","ma","java"};
	  Set Nonduplicate=new HashSet();
	  Set duplicate=new HashSet();
	  for (String string: str) {
		 if(!Nonduplicate.contains(string)){
			 Nonduplicate.add(string);
		 }else {
			 duplicate.add(string);
		 }
	}
	  System.out.println("duplicate String --- > " +duplicate);
	   
	}
	
	
	
	@Test(priority=0)
	public void test3(){
	   int n[]= {2,432,43,64,4,3,22,432,578,324,2,56,8};
	   int m1=0,m2=0,m3=0;
	   for(int i=0;i<n.length;i++){
		   if(m1<n[i]){
			   m2=m1;
			   m1=n[i];
		   }else if (m2<n[i]){
			   m2=n[i];
		   }else if(m3<n[i]){
			   m3=n[i];
		   }
	   }
	   System.out.println(m1+"  "+m2+" "+m3);
	}
	
	@Test
	public void test_Aothing(){
		int n[]= {2,432,43,64,4,3,22,432,578,324,2,56,8};
		   int small=n[0],large=n[0];
		   for(int i=0;i<n.length;i++){
			   if(small>n[i]){
				   small=n[i];
			   }else if (large<n[i]){
				   large=n[i];
			   }
	}
         System.out.println(small + "   "+ large);
}
	
	@Test(priority=-1)
	public void test_min_1(){
	 String str= "manoj kushwaha mca test done";
	 System.out.println(str.replaceAll("\\s+", " space "));
	 System.out.println(str.split("\\s+").length);
	 System.out.println();

	 int V=0,C=0;
	 for(int i=0;i<str.length();i++){
		 char c=str.charAt(i);
    	 if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
		 V++;
	 }else if(c>='a' && c<='z'){
		 C++;
	 }
   }
	 System.out.println(V+"   "+C);
	}
	
	
	
	
	
}