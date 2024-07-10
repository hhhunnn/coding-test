package level0; // 0. 더 크게 합치기

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String string = "";
		int a1 = Integer.parseInt(a + string + b);
		int a2 = Integer.parseInt(b + string + a);
		
		if (a1 >= a2) {
			System.out.println(a1);
		} else {
			System.out.println(a2);
		}
		scan.close();

	}

}
