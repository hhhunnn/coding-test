package level0; // 0. 홀짝에 따라 다른 값 반환하기

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		
		if (n % 2 == 1) {
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 1) {
					sum += i;
				}
			}
			
		} else {
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					sum += (i * i);
				}
			}
		}
		System.out.println(sum);
		
		scan.close();
		
	}
}
