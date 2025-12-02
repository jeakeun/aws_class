package day02;

import java.util.Scanner;

public class EX11_BreakTest {

	public static void main(String[] args) {
		/* 문자를 입력 받아 입력받은 문자가 q이면 종료. 아니면 계속 입력을 받는 코드를 작성하세요.
		 */
		Scanner scan = new Scanner(System.in);
		char ch;
		
		for(int i = 1; ; i++ ) { // for 무한루프가 돌아갈때는(초기화; 조건식 ; 증감식) 안에 공백이여도 상관없다 // 예 => ( ; ; ){}
			System.out.print("문자를 입력하세요");
			ch = scan.next().charAt(0);
			System.out.println(" 입력 문자 : " + ch);
			if ( ch == 'q') {
				break;
			}
		}
		System.out.println("프로그램 종료.");
		
		for(ch = 'a'; ch != 'q'; ) {
			System.out.print("문자를 입력하세요");
			ch = scan.next().charAt(0);
			System.out.println(" 입력 문자 : " + ch);
		}
		System.out.println("프로그램 종료.");
		
		do {
			System.out.print("문자를 입력하세요");
			ch = scan.next().charAt(0);
			System.out.println(" 입력 문자 : " + ch);
		}while(ch != 'q');
		System.out.println("프로그램 종료.");
	}

}
