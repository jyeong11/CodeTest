package Test;

public class codeup_2368 {

	public static void main(String[] args) {
//		int a = 22104;
//		int b = 22054;
//		int c = 23063;
//		
//		int am = a / 40;
//		int bm = b / 50;
//		int cm = c / 30;
//		int min = Math.min(am, Math.min(bm, cm));
//		System.out.println(min);
		
		// for문 사용
		int[] arr = new int[]{22104, 22054, 23063};
		int[] arr2 = new int[]{40, 50, 30};
		
		// 아주 큰 값으로 초기화 해두기
		int min = 1000000;
		
		for(int i = 0; i < arr.length; i++) {
			int minNum = arr[i] / arr2[i];
			if(minNum < min) {
				min = minNum;
			}
		}
		System.out.println(min);
	}
}

