package CodeUp_Test;

import java.util.Scanner;

public class codeup_1155 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num % 7 ==0) {
			System.out.println("multiple");
		}else {
			System.out.println("not multiple");
		}
	}
}
