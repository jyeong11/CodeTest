package CodeUp_Test;

import java.util.Scanner;

public class codeup_1905 {
	public static void main(String[] args) {
//		재귀함수
//		정수 n이 입력으로 들어오면 1부터 
//		n까지의 합을 구하시오.
//		이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(sum(n));
	}
	
	public static int sum(int n) {
		if(n <= 1) {
			return 1;
		}else {
		 return	n + sum(n - 1);
		}
	}
}
