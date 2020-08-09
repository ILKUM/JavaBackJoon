package if문;

import java.util.Scanner;

public class Main_2753 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = a % 400;
		
		if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
