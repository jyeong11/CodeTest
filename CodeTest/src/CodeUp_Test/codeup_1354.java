package CodeUp_Test;

import java.util.Scanner;

public class codeup_1354 {
	
	public static void main(String[] args) {
//		길이 n이 입력되면 역삼각형을 출력한다.
//		예) n이 5이면
//		*****
//		****
//		***
//		**
//		*
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}
