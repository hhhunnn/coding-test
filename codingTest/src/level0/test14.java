package level0; // 0. 두 수의 연산값 비교하기

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String string = "";
		int plus = Integer.parseInt(a + string + b);
		int multiple = 2 * a * b;
		
		if (plus >= multiple) {
			System.out.println(plus);
		} else {
			System.out.println(multiple);
		}
		scan.close();
		
	}

}
