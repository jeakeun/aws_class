package day01;

import java.util.Scanner;

public class EX15_HomeWork {

	public static void main(String[] args) {
		/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A : 90 ~ 109
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : -9 ~ 59
		 * 잘못된 성적 : -9미만, 110이상
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요.");
		int num = scan.nextInt();
		char cre = scan.next().charAt(0);
		System.out.println(num + " " + "점 : " + " " + cre + " " + "학점 입니다");
		switch(num) {
		case 90 <= 109 == "A": 
			System.out.println(num + " " + "점 : " + " " + cre + " " + "학점 입니다");
		}
	}

}
