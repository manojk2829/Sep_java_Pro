package october_Interview;

import java.util.Scanner;

public class Parfact_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number --- > ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				sum=sum+i;
			}
		}if(sum==num){
		    System.out.println(num +" is parfact Number");
		}else{
			System.out.println(num+ " Not Parfect");
		}
	}
}
