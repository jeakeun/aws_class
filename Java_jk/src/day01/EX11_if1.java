package day01;

import java.util.Scanner;

public class EX11_if1 {

	public static void main(String[] args) {
		/* 조건문
		 *  - 상황에 따라 결과가 달라질 때 사용
		 *  - 예 : 자판기에서 선택한 메뉴에 따라 나오는 음료가 다름
		 *  - ~면 ...해라 표현되면 조건문
		 *   - ~ : 조건식
		 *   - ... : 실행문
		 *   
		 * else if문 문법
		 * if(조건식1){ // 조건식1이 참이면 실행문1을 실행
		 * 		실행문1;
		 * }else if(조건식2){ // 조건식1이 거짓이고 조건식2가 참이면 실행문2를 실행
		 * 		실행문2;
		 * }else{ // 조건식1과 조건식2가 모두 거짓이면 실행뭉3을 실행
		 * 		실행문3;
		 * }	
		 * 
		 * */

		// 정수를 입력받아 입력받은 정수가 짝수인지 판별하는 코드를 작성하세요.
		// 예시
		// 정수 입력 : 5
		// 5는 홀수
		
		// 내가 한거
		Scanner scan = new Scanner(System.in);
		// 안내 문구
		System.out.print("정수를 입력 :");
		// 입력 받기
		int num = scan.nextInt();
		// 조건문 짝수면 짝수라고 나오고 
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
		// 아니라면 홀수라고 나오게하기
		else {
			System.out.println(num + "은 홀수입니다.");
		}
		
		// 강사님이 한거
		System.out.print("정수 입력 :");
		int num1 = scan.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수");
		}
		// 아니라면 홀수라고 나오게하기
		else {
			System.out.println(num1 + "는 홀수");
		}
		String result = num1 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num1 + "는" + result);
	}

}
