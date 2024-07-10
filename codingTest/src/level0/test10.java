package level0; // 문자열 겹쳐쓰기
import java.util.Scanner;


public class test10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String my_string = scan.nextLine();
		String overwrite_string = scan.nextLine();
		int s = scan.nextInt();
		
		char[] ch1 = my_string.toCharArray();
		char[] ch2 = overwrite_string.toCharArray();
		int i = 0;
		if (ch2.length >= 1 && ch2.length <= ch1.length) {
			for (i = 0; i <= ch1.length; i++) {
				if (s <= i && i <= (overwrite_string.length() + s)) {
					System.out.print(ch2[i]);
				} else {
					System.out.print(ch1[i]);
				}
			}
		}
		scan.close();
		
	}
}
