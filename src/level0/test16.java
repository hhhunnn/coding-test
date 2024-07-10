package level0; // 0. 공배수

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if (number % n == 0 && number % m == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scan.close();

	}
}
