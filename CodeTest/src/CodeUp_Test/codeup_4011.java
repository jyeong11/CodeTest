package CodeUp_Test;

import java.util.Scanner;

public class codeup_4011 {
	public static void main(String[] args) {
//		주민등록번호의 출생년도, 출생월, 출생일 및 성별을 출력하는 프로그램을 작성하시오.
//		출생년도는 주민등록번호 앞 2자리이고, 출생월은 주민등록번호 3, 4자리,
//		출생일은 주민등록번호 5, 6 자리, 성별은 ‘-’ 문자 다음에 나오는 숫자가 1이면 2000년 이전에 출생한 남자,
//		2면 2000년 이전에 출생한 여자로 한다. 만약, ‘-’ 문자 다음에 3이면 2000년 이후에 출생한 남자,
//		4면 2000년 이후에 출생한 여자로 한다.
//		(출력시 남자는 ‘M’, 여자는 ‘F’로 출력한다.)
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String year = "19";
		String yy = str.substring(0,2);
		String mm = str.substring(2,4);
		String dd = str.substring(4,6);
		String gender = str.substring(7, 8);
		
		if(gender.equals("2") || gender.equals("4")) {
			if(gender.equals("4")) {
				year = "20";
			}
			gender = "F";
			System.out.println(year + yy +"/" + mm +"/" + dd+ " " + gender);
		}else if(gender.equals("1") || gender.equals("3")) {
			if(gender.equals("3")) {
				year = "20";
			}
			gender = "M";
			System.out.println(year + yy +"/" + mm +"/" + dd + " " + gender);
		}
	}
}
