package day01;

import java.util.Scanner;

public class EX14_IfSwitch_Test {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 예시
		 * 두 정수와 연산자 입력(예: 1 + 2) : 1 / 2
		 * 1 / 2 = 0.5
		 * 예시
		 * 두 정수와 연산자 입력(예: 1 + 2) : 1 ? 2
		 * ?는 산술 연산자가 아닙니다.
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.print("산술연산자를 입력해주세요.");
		char met = scan.next().charAt(0);
		System.out.print("정수를 입력해주세요.");
		int num2 = scan.nextInt();
		
		// 입력 받은 연산자가 +이면 덧셈을 출력
		if(met == '+') {
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 + num2)) + "산술연산자가 맞습니다.");
		}
		// 입력 받은 연산자가 -이면 뺄셈을 출력
		else if(met == '-') {
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 - num2)) + "산술연산자가 맞습니다.");
		}
		// 입력 받은 연산자가 *이면 곱셈을 출력
		else if(met == '*') {
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 * num2)) + "산술연산자가 맞습니다.");
		}
		// 입력 받은 연산자가 /이면 나눗셈을 출력
		else if(met == '/') {
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 / (double)num2)) + "산술연산자가 맞습니다.");
		}
		// 입력 받은 연산자가 %이면 나머지를 출력
		else if(met == '%') {
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 % num2)) + "산술연산자가 맞습니다.");
		}
		// 입력 받은 값이 +, -, *, /, % 가아니라면 산술연산자가 아닙니다를 출력
		else {
			System.out.println("산술연산자가 아닙니다.");
		}
		
		// 입력 안내 문구
		System.out.print("두 정수와 연산자 입력(예: 1 + 2) : ");
		// 정수1을 입력 받음
		int num3 = scan.nextInt();
		// 연산자를 입력 받음(문자)
		char op = scan.next().charAt(0);
		// 정수2를 입력 받음
		int num4 = scan.nextInt();
		
		switch(op) {
		case '+':
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 + num2)) + "산술연산자가 맞습니다.");
		case '-':
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 - num2)) + "산술연산자가 맞습니다.");
		case '*':
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 * num2)) + "산술연산자가 맞습니다.");
		case '/':
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 / num2)) + "산술연산자가 맞습니다.");
		case '%':
			System.out.println((num1 + " " + met + " " + num2 + " = " + (num1 % num2)) + "산술연산자가 맞습니다.");
			break;
		default:
			System.out.println("산술연산자가 아닙니다.");
		}
	}

}
