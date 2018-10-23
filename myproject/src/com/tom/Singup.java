package com.tom;

import java.util.Scanner;

public class Singup {

	public static void main(String[] args) {
		System.out.println("are you 18 ?(y/N)");
		Scanner scanner =new Scanner(System.in);
		String line = scanner.nextLine();
		
		System.out.println("*"+line+"*");
		boolean adult = line.toUpperCase().equals("Y");
		if(adult){
			System.out.println("your age");
			int age = scanner.nextInt();
			
		}
		else{
			System.out.println("xxxxxx ,bye ");
		}
	}			
}	
	


