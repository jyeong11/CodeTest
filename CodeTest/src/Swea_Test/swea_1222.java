package Swea_Test;

import java.util.Scanner;
import java.util.Stack;

public class swea_1222 {

	public static void main(String[] args) {
//		문자열로 이루어진 계산식이 주어질 때, 이 계산식을 후위 표기식으로 바꾸어 계산하는 프로그램을 작성하시오.
//		예를 들어 “3+4+5*6+7”
//		라는 문자열로 된 계산식을 후위 표기식으로 바꾸면 다음과 같다.
//		"34+56*+7+" 변환된 식을 계산하면 44를 얻을 수 있다.
//		문자열 계산식을 구성하는 연산자는 +, * 두 종류이며 피연산자인 숫자는 0 ~ 9의 정수만 주어진다.
//		[입력]
//		각 테스트 케이스의 첫 번째 줄에는 테스트 케이스의 길이가 주어진다. 그 다음 줄에 바로 테스트 케이스가 주어진다.
//		총 10개의 테스트 케이스가 주어진다.
//
//		[출력]
//		#부호와 함께 테스트 케이스의 번호를 출력하고, 공백 문자 후 답을 출력한다.
		for(int j = 1; j <= 10; j++) {
			Scanner scn = new Scanner(System.in);
			scn.nextInt();
			scn.nextLine();
			String problem = scn.nextLine();
			String[] arrs = problem.split("");
			Stack<Integer> stack = new Stack<Integer>();
			
			for(int i = 0; i < arrs.length - 1; i++) {
				if(arrs[i].equals("+")) {
					String temp  = arrs[i];
					arrs[i] = arrs[i + 1];
					arrs[i + 1] = temp;
				}
			}
			for(String arr : arrs) {
//			arr을 String으로 받았으니 문자로 ["0~9"] 비교
				if(arr.matches("[0-9]")) {
					stack.push(Integer.parseInt(arr));
				}else {
					int c = stack.pop();
					int d = stack.pop();
//				문제에서는 +만 나오지만 /, *, - 의 경우를 생각해 switch문 사용
					switch (arr) {
					case "+":
						stack.push(c + d);
					}
				}
			}
			System.out.println("#" + j + " " + stack.pop());
		}
	}

}
