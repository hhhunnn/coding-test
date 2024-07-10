package level0;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a, b의 값을 입력해 주세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if ((a >=1) && (b <= 100)) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else {
			System.out.println("범위를 초과하였습니다.");
		}
		scan.close();

	}

}
