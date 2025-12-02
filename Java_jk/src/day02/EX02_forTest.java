package day02;

import java.util.Scanner;

public class EX02_forTest {

	public static void main(String[] args) {
		
		// 구구단 2단을 출력하는 코드를 작성하세요.
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 X " + i + " = "  + 2 * i);
																	
		}
		
		// a에서 z까지 출력하는 코드를 작성하세요.
		
		// 내가 한거
		for(int i = 97; i <= 122; i++ ) {
			System.out.print((char)i);
		}
		System.out.println();
		
		// 강사님이 한거
		for(int num = 0; num < 26; num++) {
			System.out.print((char)('a'+num));
		}
		System.out.println();
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
		System.out.println();
		/* 1부터 10까지 합을 구하는 코드를 작성하세요
		 * 
		 * sum = 0
		 *  */
		int sum;
		int i;
		for(i = 1, sum = 0; i <= 10; i++) {
			sum = sum + i;
			System.out.println("1부터 10까지 합 :" + sum);
		}
		
	}

}
