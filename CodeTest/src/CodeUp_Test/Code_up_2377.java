package CodeUp_Test;

public class Code_up_2377 {

	public static void main(String[] args) {
//		전북특별자치도 임실군은 우리나라 최초로 치즈 공장이 설립되어 치즈 생산을 처음 시작한 곳이며 
//		치즈 만들기 등을 체험할 수 있는 임실치즈테마파크로도 유명하다.
//		테마파크에서 일하는 비버는 다음의 규칙에 따라 치즈를 생산한다.
//		우유를 남기지 않으면서, 정확히 2024의 치즈를 생산하기 위해서 필요한 젖소는 최소 몇 마리인지 구해보자.
//		각 컨디션의 젖소의 수는 무한히 많다고 가정한다.
//		우유 10L로 차즈 1kg 만듬
//		젖소 최상의 컨디션 = 25L	 보통의 컨디션 = 15L 최하의 컨디션 = 10L
		
//		[생각]
//		우유가 20240있어야 함 
//		2024의 치즈를 만들기 위a 최소 몇마리인지 
//		치즈의 나머지가 0이 될때까지 우유를 나누어야 함
		int cheese = 20240;
		int[] milk = {25, 15, 10};
		int cow = 0;
		int remainder = 0;
		
		for(int i = 0; i < milk.length; i++) {
			remainder = cheese % milk[i];
			if(remainder != 0) {
				
				remainder = remainder % milk[i + 1];
			}
			cow += cheese / milk[i];
		}
		System.out.println(cow);
	}

}
