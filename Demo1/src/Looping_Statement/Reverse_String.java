package Looping_Statement;

import java.util.Scanner;

public class Reverse_String {
	
	public void reverseString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to reverse: ");
		String a=sc.nextLine();
		String rev="";
		
		for(int i=0; i<=a.length()-1;i++) {
			char c=a.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) {
		Reverse_String obj = new Reverse_String();
		obj.reverseString();
	}

}
