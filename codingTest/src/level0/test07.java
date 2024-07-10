package level0; // 문자열 붙여서 출력하기

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		if(str1.length() >= 1 && str1.length() <= 10) {
			if(str2.length() >= 1 && str2.length() <= 10) {
				
				System.out.println(str1 + str2);
				
			}
		}
	scan.close();	
	}
}

