package day02;

public class EX04_whileTexst {

	public static void main(String[] args) {
		
 		// Hello World 5번 출력예제
		
		// 구구단 2단 출력 예제 
		int num = 2;
		int i =0;
		int j = 1;
		
		// 내가 한거
		while(j++ <= 5) {
			System.out.println("Hello World");
		}
		
		while(i++ <= 8) {
			System.out.println(" 2 X " + i + " = " + num * i);
		}
			
		// 강사님
		int o = 5;
		while(o-- > 0) {
			// 조건식에서 i가 5이면 여기 실행문에서는 i가 4
			System.out.println("Hello World");
		}
		
		int k = 1;
		while(k <= 9) {
			System.out.println(" 2 X " + k + " = " +2*k);
			k++;
		}
	}

}
