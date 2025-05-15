package CodeUp_Test;

import java.util.Scanner;

public class codeup_1155 {

	public static void main(String[] args) {
//		인학이는 숫자 7을 좋아한다.
//		어떤 정수가 입력되면 그 수가 7의 배수인지 확인하시오.
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num % 7 ==0) {
			System.out.println("multiple");
		}else {
			System.out.println("not multiple");
		}
	}
}
