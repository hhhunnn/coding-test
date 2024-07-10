package level0; // 문자열 돌리기

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] str1 = str.toCharArray();
		int i = 0;
		
		if(str.length() >= 1 && str.length() <= 10) {
			for(i = 0; i <= str.length(); i++) {
				System.out.println(str1[i]);
			}
			
		}
		scan.close();
		
	}

}
