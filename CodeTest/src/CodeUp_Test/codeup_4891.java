package CodeUp_Test;

import java.util.Scanner;

public class codeup_4891 {
	public static void main(String[] args) {
//		코이 초등학교에 새로 부임하신 교장선생님은 어린 학생들의 행복감과 학생들의 성적 차이 관계를 알아보기로 했다.
//		그래서 이전 성적을 조사하여 학생들의 시험 점수 차이 변화를 알아보려고 한다.
//		예를 들어서 2016년 학생 8명의 점수가 다음과 같다고 하자.
//		27, 35, 92, 75, 42, 53, 29, 87
//		그러면 가장 높은 점수는 92점이고 가장 낮은 점수는 27점이므로 점수의 최대 차이는 65이다.
//		한편 2017년 학생 8명의 점수가 다음과 같았다.
//		85, 42, 79, 95, 37, 11, 72, 32
//		이때 가장 높은 점수는 95점이고 가장 낮은 점수는 11점이므로 점수의 최대 차이는 84이다.
//		N명 학생들의 점수가 주어졌을 때, 가장 높은 점수와 가장 낮은 점수의 차이를 구하는 프로그램을 작성하시오.
		
		Scanner scn = new Scanner(System.in);
		scn.nextLine();
		String s = scn.nextLine();
		String arr[] = s.split(" ");
		int max = 0;
		int min = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			if(Integer.parseInt(arr[i]) > max) {
				max = Integer.parseInt(arr[i]);
			}
			if(Integer.parseInt(arr[i]) < min) {
				min = Integer.parseInt(arr[i]);
			}
		}
		System.out.println(max-min);
	}
}
