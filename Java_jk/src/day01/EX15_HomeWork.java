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
		
		switch(num / 10) {
		case 10,9: 
			System.out.println(num + " 점 : " + "A학점 입니다.");
			break;
			
		case 8: 
			System.out.println(num +  " 점 : " + "B학점 입니다.");
			break;
			
		case 7: 
			System.out.println(num  + " 점 : " + "C학점 입니다.");
			break;
			
		case 6: 
			System.out.println(num  + " 점 : " + "D학점 입니다.");
			break;
			
		case 0,1,2,3,4,5: 
			System.out.println(num + " 점 : " +  "F학점 입니다.");
			break;
			
		default:
			System.out.println(num + " 점 : " +  "잘못된 성적입니다.");
			
			
		}
	}
}
	


