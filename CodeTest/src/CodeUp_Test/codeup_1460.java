package CodeUp_Test;

import java.util.Scanner;

public class codeup_1460 {
	public static void main(String[] args) {
//		다음과 같은 n*n 배열 구조를 출력해보자.
//		입력이 3인 경우 다음과 같이 출력한다.
//		1 2 3
//		4 5 6
//		7 8 9
//		
//		입력이 5인 경우는 다음과 같이 출력한다.
//		1 2 3 4 5
//		6 7 8 9 10
//		11 12 13 14 15
//		16 17 18 19 20
//		21 22 23 24 25
//		입력이 n인 경우의 2차원 배열을 출력해보자.
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[][] = new int[size][size]; 
		int num = 1;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j ++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
