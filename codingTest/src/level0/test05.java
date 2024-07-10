package level0; // 대소문자 바꿔서 출력

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		char[] ch = str.toCharArray();
		
		if((str.length() >= 1) && (str.length() <= 20)) {
			
			for (char c : ch) {
				if(Character.isUpperCase(c) == true) {
					c = Character.toLowerCase(c);
				} else {
					c = Character.toUpperCase(c);
				}
				System.out.print(c); 
			}
		}
		scan.close();
	}

}


