package level0; // 0. 홀짝 구분하기

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if (1 <= n && n <= 1000) {
			if (n % 2 == 1) {
				System.out.println(n + " is odd");
			} else {
				System.out.println(n + " is even");
			}
		}
		scan.close();
	}
}
