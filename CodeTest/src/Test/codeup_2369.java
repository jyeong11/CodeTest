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