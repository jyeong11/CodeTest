package CodeUp_Test;

import java.util.Scanner;

public class codeup_2009 {
	public static void main(String[] args) {
//		학교 앞 카페에서 아메리카노를 한 잔을 사면 쿠폰을 한 장 받을 수 있다.
//		이 쿠폰은 카페에서 요구하는 필요 개수(N)를 채우면 아메리카노 한잔으로 다시 교환 할 수 있다.
//		그런데 이 가게는 특이하게도 쿠폰을 모아 아메리카노로 교환할 때에도 쿠폰을 또 한 장 준다.
//		현재 영일이가 가진 쿠폰의 개수(K)와 카페에서 요구하는 필요 쿠폰 개수(N)가 입력되면,
//		최대한 먹을 수 있는 아메리카노의 개수를 계산하는 프로그램을 작성하시오
		
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt(); //쿠폰 
		int c = scn.nextInt(); //필요쿠폰 
		int cnt = 0; //원래 있는 쿠폰으로 먹을 수 있는 수 
		int t = 0; //최대 아아 갯수
		
		while (k >= c) { 
			cnt = k / c; // 원래 아아 먹을 수 있는 횟수
			t += cnt; // 최대 마실 수 있는 변수에 저장 
			k = (k % c) + cnt; // 남은 쿠폰수 + 아아 먹을 때 발생한 쿠폰 수 
			//쿠폰수 = 남은쿠폰수 + 발생한 쿠폰수 
		}
		System.out.println(t);
	}
}
