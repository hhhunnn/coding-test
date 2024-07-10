package level0; // a와 b 출력하기

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		scan.close();

	}

}
