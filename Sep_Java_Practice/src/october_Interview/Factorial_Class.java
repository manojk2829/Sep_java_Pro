package october_Interview;

import java.util.Scanner;

public class Factorial_Class {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of Factorial...");
         int n=sc.nextInt();
         int fact=1;
         for(int i=1;i<=n;i++){
        	 fact=fact*i;
         }
         System.out.println("Factorial of "+n +"is --> "+fact );

	}

}
