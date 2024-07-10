package level0; // 문자열 반복해서 출력하기

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int n = scan.nextInt();
		int i = 0;
		
		if((str.length() >= 1) && (str.length() <= 10)) {
			
			for(i = 1; i <= n; i++) {
				
				if((i >= 1) && (i <= 5)) {
					System.out.print(str);
				} else {
					System.out.println("범위를 초과했습니다.");
					break;
				}
			}	
		}
		scan.close();
	}
}

