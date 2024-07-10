package level0; // 0. n의 배수

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n = scan.nextInt();
		
		
		if (num % n == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scan.close();

	}

}
