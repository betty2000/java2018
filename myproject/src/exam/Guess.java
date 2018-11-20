package exam;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int result = random .nextInt(10)+1;
		System.out.println(result);
		int min = 1;
		int max = 10;
		int guess = sc.nextInt();
		System.out.println(min + "to "+ max );
		
		
		
	}

}
