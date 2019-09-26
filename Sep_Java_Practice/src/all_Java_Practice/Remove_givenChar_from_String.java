package all_Java_Practice;

import java.util.Scanner;

public class Remove_givenChar_from_String {

	public static void main(String[] args) {
		System.out.println("WAP to remove given character from string");
		
		String s="manoj kushwaha";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String .....");
		String TotalString = sc.nextLine();
		System.out.println("Enter String .....");
		String givenString = sc.nextLine();
		System.out.println(TotalString.replaceAll(givenString, "A"));
		System.out.println();
	}
}
