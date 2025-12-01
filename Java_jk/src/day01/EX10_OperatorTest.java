package day01;

import java.util.Scanner;

public class EX10_OperatorTest {

	public static void main(String[] args) {
		// 두 정수를 입력받아 합을 구하는 코드를 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		// 내가 한거
		// 안내 문구
		System.out.print("정수 입력 : ");
		// 입력 받기
		int num1 = scan.nextInt();
		// num1 정수 입력
		System.out.println("입력된 정수 : "+ num1);
		// 안내 문구
		System.out.print("정수 입력 : ");
		// 입력 받기
		int num2 = scan.nextInt();
		// num2 정수 입력
		System.out.println("입력된 정수 : "+ num2);
		// num1 + num2 두합 
		System.out.println("입력된 정수 두합 :" + (num1+ num2));
		
		
		// 강사님이 한거
		// 안내 문구
		System.out.print("두 정수 입력 :");
		// 입력 받고
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		// 결과 출력
		System.out.println(num3 +" + " + num4 + " = " + (num3 + num4));
		

	}

}
