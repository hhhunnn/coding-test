package level0; // 0. 문자열 곱하기

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String my_string = scan.nextLine();
		int k = scan.nextInt();
		
		for(int i = 0; i < k; i++) {
			System.out.print(my_string);
		}
		scan.close();

	}

}
