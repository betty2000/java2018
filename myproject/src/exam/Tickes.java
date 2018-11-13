package exam;

import java.util.Scanner;

public class Tickes {

	public static void main(String[] args) {
		while(true){
		
		System.out.print("please enter number of tickes:");
		Scanner scanner = new Scanner (System.in) ;
		int  n = scanner.nextInt();
		if (n != -1) {
		System.out.print("How many round-trip tickes:");
        int rt = scanner.nextInt();
        int total = (n-rt)*1000 + rt*1800;
        
        System.out.println("Tickes:" + n);
        System.out.println("Round-trip:" + rt);
        System.out.println("Total:" + total);
		}
		else{
			break;
		}
	}

}
}
