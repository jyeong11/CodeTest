package CodeUp_Test;

import java.util.Scanner;

public class codeup_4056 {
	public static void main(String[] args) {
//		A선생님이 연말정산을 하려고 한다. 근로소득공제액은 총급여액에 따라 달라지며,
//		아래 표의 규칙에 의해서 결정된다.(근로소득공제액은 만원미만은 절사한다.)
//		총 급여액	                   근로소득공제액
//		500만원 이하                  총 급여액의 100분의 70	
//		500만원 초과 1500만원 이하	    350만원 + 500만원 초과하는 금액의 100분의 40
//		1500만원 초과 4500만원 이하	    750만원 + 1500만원 초과하는 금액의 100분의 15
//		4500만원 초과 1억원 이하	        1200만원 + 4500만원 초과하는 금액의 100분의 5
//		1억원 초과	                    1475만원 + 1억원 초과하는 금액의 100분의 2
//		예를 들어 총급여액이 3130만원인 경우 750+(3130−1500)∗15/100 = 994.5
//		가 되므로 근로소득공제액은 994만원이 된다.
//		근로소득공제액을 구하는 프로그램을 작성하시오.
		
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt(); // 급여액
		int deductions = 0; // 공제액
//		1,000,000 >> 100
		
		if(s <= 500) {
			deductions = s * 70/100;
		}else if(s > 500 && s <= 1500) {
			deductions = 350 + (s - 500) * 40/100;
		}else if(s > 1500 && s <= 4500) {
			deductions = 750 + (s - 1500) * 15/100;
		}else if(s > 4500 && s <= 10000) {
			deductions = 1200 + (s - 4500) * 5/100;
		}else {
			deductions = 1475 +(s - 10000) * 2/100;
		}
		
		System.out.println(deductions);
	}
}
