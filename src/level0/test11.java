package level0; // 0. 문자 리스트를 문자열로 변환하기

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String arr1 = scan.nextLine();
		String arr2 = scan.nextLine();
		String arr3 = scan.nextLine();
		
		System.out.println(arr1 + arr2 + arr3);
		
		scan.close();
		
	}
}
