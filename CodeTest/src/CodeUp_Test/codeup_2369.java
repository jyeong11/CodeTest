package CodeUp_Test;

import java.util.Arrays;
import java.util.Scanner;

public class codeup_2369 {

	public static void main(String[] args) {
//	       * 1. 쌀 180g, 육수 200ml, 쇠고기 육회 50g, 콩나물 40g, 고사리 50g, 도라지 30g, 달걀 1개, 각종 야채 및 양념을 준비한다.
//	       * 2. 사골 육수에 쌀을 넣어 밥을 짓는다.
//	       * 3. 쇠고기 육회를 준비한다..
//	       * 4. 콩나물, 고사리, 도라지 나물을 준비한다.
//	       * 5. 그릇에 밥을 담고 재료들을 고루 돌려 담은 후 고추장을 얹는다.
//	       * 전주비빔밥축제를 위해 준비된 콩나물의 양(a), 고사리의 양(b), 도라지의 양(c)이 주어질 때,
//	       * 만들 수 있는 전주비빔밥의 최대 그릇 수를 계산해보자.
		
		Scanner scn = new Scanner(System.in);
		String cooking = scn.nextLine(); 
		// 배열로 만들기
		String[] arr  = cooking.split(" "); 
		int[] arr2 = Arrays.stream(arr)
					.mapToInt(Integer:: parseInt)
					.toArray();
		
		int[] cnt = new int[]{40, 50, 30};
		int min = arr2[1];
		
		for(int a = 0; a < arr2.length; a++) {
			int num = arr2[a] / cnt[a];
			if(min > num) {
				min = num; 
			}
		}
		System.out.println(min);
	}
}
// Arrays.stream(arr).mapToInt(Integer:: parseInt).toArray();
// 1) Arrays.stream(arr): arr 배열을 스트림으로 변환
// 2) mapToInt(Integer:: parseInt): 스트림의 요소를 int로 변환
// 3) toArray(): 최종적으로 int 배열로 변환