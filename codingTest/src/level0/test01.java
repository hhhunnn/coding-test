package level0; // 0.문자열 출력하기

import java.util.HashSet;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		// replace 이용
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		str = str.replaceAll(" ", "");
		if(str.length() >= 1 && str.length() <= 1000000) {
			System.out.println(str);
		} else {
			System.out.println("출력되지 않습니다.");
		}
		scan.close();
		
	}

}
