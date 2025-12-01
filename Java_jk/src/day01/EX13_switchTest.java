package day01;

import java.util.Scanner;

public class EX13_switchTest {

	public static void main(String[] args) {
		// 월을 입력받아 입력받은 월의 마지막 일을 출력하는 코드를 작성하세요.
		// 31 : 1, 3, 5, 7, 8, 10, 12
		// 30 : 4, 6, 9, 11
		// 28 : 2
		// 예시
		// 월 입력 : 3
		// 3월은 31일까지 있습니다.
		// 예시
		// 월 입력 : 13
		// 13월은 없는 월입니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력해주세요.");
		int mon = scan.nextInt();
		
		switch(mon) {
		case 1,3,5,7,8,10,12:
			System.out.println(mon + "월은 31일 까지 있습니다."); 
			break;
		case 4,6,9,11:
			System.out.println(mon + "월은 30일 까지 있습니다."); 
			break;
		case 2:
			System.out.println(mon + "월은 28일 까지 있습니다.");
			break;
		default:
			System.out.println(mon + "월은 없는 월입니다.");
		}

	}

}
