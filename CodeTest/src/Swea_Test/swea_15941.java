package Swea_Test;

import java.util.Scanner;

public class swea_15941 {

	public static void main(String[] args) {
//		정수 N이 주어질 때, 모든 변의 길이가 N인 가장 넓은 평행사변형의 넓이를 출력하라.
//		이 넓이는 정수임이 보장된다.
//		[입력]
//		첫 번째 줄에 테스트 케이스의 수 TC가 주어진다. 이후 TC개의 테스트 케이스가 새 줄로 구분되어 주어진다. 
//		각 테스트 케이스는 다음과 같이 구성되었다.
//		첫 번째 줄에 정수 N이 주어진다. (1<=N<=100)
//		[출력]
//		각 테스트 케이스 마다 한 줄씩 문제의 정답을 출력하라.
		
//		[생각] 모든 변의 길이가 같으니 높이도 같다 
//		평행사변형 공식 : 넓이 =  밑변 * 높이 
		
		Scanner scn = new Scanner(System.in);
		int T;
		int area; 
		T = scn.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			double base = scn.nextInt();
			 area = (int)Math.pow(base, 2);
			 System.out.println("#" + test_case + " " + area);
		}
	}
//	처음에는 
//	int base = scn.nextInt();
//	area = base * base;를 생각했지만 너무 1차원적인?? 방법인 거 같아서 
//	다르게 푸는 법이 없나 생각했는데 base 자체를 두번 곱하면 
//	Math 함수에 거듭제곱쓰는 함수가 있을 거 같아 구글링해서 찾아보니 있었음
//	그래서 Math를 사용해서 풀었다 
}
