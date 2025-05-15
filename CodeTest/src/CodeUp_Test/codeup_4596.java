package CodeUp_Test;

import java.util.Scanner;

public class codeup_4596 {
	public static void main(String[] args) {
//	문제 1) 최대값 (중등1, 고등1)
//	<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수가 주어질 때, 
//	이들 중 최대값을 찾고 그 최대값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
//	예를 들어, 다음과 같이 81개의 수가 주어지면 이들 중 최대값은 90이고, 이 값은 5행 7열에 위치한다.
		
//	[생각]
//	81개의 숫자를 받을려면 for문 돌려서 이차원 배열을 만들어야 할 거 같음 
// 	for문을 두번 돌려야 할 거 같음
//	 첫번쨰 줄 최댓값, 두번째 줄 위치
		Scanner scn = new Scanner(System.in);
		int arr[][] = new int[9][9];
		int max = 0;
		int row = 0;
		int col = 0;
		
		for(int i = 0; i < 9; i ++) {
			for(int j = 0; j < 9; j ++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j ++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					row = i + 1; 
					col = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(row + " " + col);
	}
}
