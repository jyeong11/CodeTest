package CodeUp_Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class codeup_2374 {

	public static void main(String[] args) {
//		비버고등학교 학생들이 전북특별자치도 군산시로 2박 3일의 수학여행을 갔다.
//		학생들은 선생님의 안내에 따라 군산스탬프투어에 참여해야 한다.
//		선생님은 스탬프투어 시간 동안 군산의 관광지 중에서
//		학생이 원하는 관광지를 관람하고 스탬프를 받아오는 학생들에게 특별한 기념품을 주기로 하였다.
//		어떤 관광지에서 스탬프를 받기 위해서는 일정 시간 동안 관람해야 한다.
//		전체 관광지 수는 5개이고, 선생님이 정해준 관광지 수는 3개, 학생들의 수는 10명, 스탬프투어 시간은 100이다.
//		각 관광지의 관람 시간은 1번 관광지 30분, 2번 관광지 25분, 3번 관광지 20분, 4번 관광지 30분, 5번 관광지 35분이다.
//		10명의 학생의 관광지 관람 순서가 다음과 같이 주어질 때, 기념품을 받는 학생의 수를 구해보자.
		
//		[생각]
//		일단 5개의 관광지가 각 몇분이 걸리는지 선언
//		그리고 주어진 문제에서 각 학생마다 3개 투어 하는 거 선언
		
//		관광지 
		Map<Integer, Integer> sight = new HashMap<>();
		sight.put(1, 30);
		sight.put(2, 25);
		sight.put(3, 20);
		sight.put(4, 30);
		sight.put(5, 35);
		
//		int result = sight.get( 3) + sight.get(5) + sight.get(2); 
		
		// 학생
		Map<Integer, List<Integer>> student = new HashMap<>();
		student.put(1, Arrays.asList(3,5,2));
		student.put(2, Arrays.asList(2,3,5));
		student.put(3, Arrays.asList(5,2,3));
		student.put(4, Arrays.asList(5,2,1));
		student.put(5, Arrays.asList(2,5,1));
		student.put(6, Arrays.asList(5,2,1));
		student.put(7, Arrays.asList(3,2,1));
		student.put(8, Arrays.asList(4,1,3));
		student.put(9, Arrays.asList(3,4,5));
		student.put(10, Arrays.asList(1,2,4));
		
		int[] result = new int[10];
		int studentCnt = 0;
		
		for(int i = 0; i < 10; i++) {
			result[i] = sight.get(student.get(i + 1).get(0)) + sight.get(student.get(i + 1).get(1)) + sight.get(student.get(i + 1).get(2));
			if(result[i] + 15 < 100) {
				studentCnt++;
			}
		}
		System.out.println(studentCnt);
	}
//	학생마다 관광지를 넣는게 어려웠던 거 같다..
//	처음에는 구글링해서 하나의 키 값에 여러개의 value를 어떻게 넣는지 찾아봤는데
//	그 과정에서 HashMap<String,ArrayList<Point>> 가 있었다 그래서 Point에 대해 찾아보니 x, y 좌표를 구하는거라
//	이 문제와는 맞지 않는다고 생각했고 구글링하다가 도저히 모르겠어서 ChatGPT한테 물어봄
//	Arrays.asList를 쓰면 된다고 했고 사용해서 품
//	[아쉬운 점 ] 
//	sight.get(student.get(i + 1).get(0)) + sight.get(student.get(i + 1).get(1))... 
//	>> 이부분도 반복되는 것 같아 for문으로 돌렸으면 좋을 거 같음
//	그리고 if(result[i] + 15 < 100) 조건문에서 관광지로 이동하는 시간 5분(3곳 * 5)를 하드코딩했음
}
