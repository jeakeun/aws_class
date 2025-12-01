package day01;
/* 실행 방법 : Run 메뉴 > Run 클릭(단축키 Ctrl + F11)
 * 주석 단축키 : 한줄 주석(단축키 : Ctrl + /) 여러줄 주석 (단축키 : 블록 지정 훟 Ctrl + Shift + /)
*/
public class EX01_HelloWorld {

	public static void main(String[] args) {
		// 표준 출력을 이용하여 콘솔에 문자열을 출력
		// 문자 : 한 글자 :char 2바이트 '' 를이용
		// 숫자 : 정수 byte(1바이트) -128~127
		// 		 	 short(2바이트) -32,768 ~ 32,767
		// 		  	 int(4바이트) -2,147,483,648 ~ 2,147,483,647 (약 ±21억)
		// 		 	 long(8바이트) -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (약 ±9 * 10^18)
		//     : 실수 flot(4바이트) 소수점 6~7자리 double(8바이트) 소수점 15자리이상
		 
		System.out.println("Hello World");
	}

}
