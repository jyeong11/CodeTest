package CodeUp_Test;

import java.util.Scanner;

public class codeup_1164 {
	public static void main(String[] args) {
//		어떤 차의 높이가 170cm 이다.
//		이 차는 3개의 터널을 차례대로 지나게 될 것이다.
//		터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 날 것이다.
//		터널의 높이가 차례대로 3개 주어지면 터널을 무사히 잘 통과하면 PASS 를 출력하고, 사고가 난다면 CRASH 를 출력하시오.
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		
		if(num1 <= 170 || num2 <= 170 || num3 <= 170) {
			System.out.println("CRASH");
		}else {
			System.out.println("PASS");
		}
	
	}
}
