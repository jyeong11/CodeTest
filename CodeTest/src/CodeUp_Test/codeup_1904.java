package CodeUp_Test;

import java.util.Scanner;

public class codeup_1904 {
	public static void main(String[] args) {
//		시작수(a)와 마지막 수(b)가 입력되면 a부터 b까지의 모든 홀수를 출력하시오.
//		이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		odd(a, b);
		scn.close();

	}
//	public static int odd(int a, int b) {
//		if(a <= b) { //a가 b보다 작을때 
//			a가 홀수이면 a 반환 아니면 a + 1, b
//			int an = a % 2 != 0? a : odd(a + 1, b);
//			System.out.print(an + " ");
//			return odd(a + 1, b);
//		}else {
//			return;
//		}
	public static void odd(int a, int b) {
		if (a > b) return;
		
		System.out.print((a % 2 != 0? a + " " : ""));
		
		odd(a + 1, b);
	}
}
