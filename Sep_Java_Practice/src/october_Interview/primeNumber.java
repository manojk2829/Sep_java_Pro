package october_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		//Prime number --
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check parfact- ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++){
		boolean prime =true;
		for(int j=2;i<n/2;i++){
			if(n%i==0){
			   prime=false;
			   break;
			}
	     }
		if(prime){
			System.out.println(prime+ " -- Number is prime");
		}else{
			System.out.println(prime +" -- Number is not prime");
		}
	}
  }
}

