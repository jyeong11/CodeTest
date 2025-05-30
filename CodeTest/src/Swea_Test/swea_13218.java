package Swea_Test;

import java.util.Scanner;

public class swea_13218 {

	public static void main(String[] args) {
//		당신은 교수이다. 매주 월요일과 수요일 오전 9시부터 10시 30분까지 진행되는 당신의 수업에는 N명의 수강생이 있다.
//		당신은 학생들에게 조별과제를 부여하기 위해 학생들을 몇 개의 조로 나누려고 한다
//		당신은 한 조가 2명 이하의 학생으로 구성되면 토론이나 업무 배분 등이 제대로 이루어지지 않아 팀워크를 평가할 기회를 박탈당한다고 생각한다. 
//		따라서, 당신은 3명 이상의 학생으로 구성된 조의 수를 최대화하려고 한다. 각 학생은 정확히 한 개의 조에만 속할 수 있다.
//		학생들을 조로 적당히 나누었을 때, 3명 이상의 학생으로 구성된 조의 수의 최댓값이 얼마인지를 구하는 프로그램을 작성하라.
//		[입력]
//		첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
//		각 테스트 케이스는 하나의 줄로 이루어진다. 각 줄에는 학생의 수 N (1 ≤ N ≤ 1000)이 주어진다.
//		[출력]
//		각 테스트 케이스마다, N명의 학생들을 조로 적당히 나누었을 때, 3명 이상의 학생으로 구성된 조의 수의 최댓값을 출력한다.
		
//		[생각]
//		3명 이상 구성된 조의 수를 최대화 --> 최소 3명의 팀을 많이 만들어야 함 
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 3
		for (int tc = 1; tc <= T; tc++) { 
			int studentCnt = sc.nextInt();  
			int result = studentCnt / 3;
			System.out.println("#" + tc + " " + result);
		}
	}
	
//	[처음 풀이 방식]
//	답은 나왔는데 제출하니 1000개 테스트 중 37개만 맞았다고 뜸,,,
//	나는 입력 값을 받으면 입력 숫자가 여러개라서 배열을 만들려고 
//	이런 로직을 짠 거 같다.. 문제에 비해 어렵게 접근 한 거 같음
//	그래서 다시 문제를 풀어보니 
//	어차피 for문 밖이라 그냥 단순 계산만 하면 되는 거 였음
	
//		int num = 0;
//		for (int tc = 0; tc < T; tc++) { /* 0~2 */
//			int studentCnt = sc.nextInt(); // 1 
//			int[] teamCnt = new int[studentCnt]; // 1
//			teamCnt[tc] += studentCnt; //1
//			int result = teamCnt[tc] / 3;
//			num++;
//			System.out.println("#" + num + " " + result);
//		}

}
