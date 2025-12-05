package homework;

public class HW02_Star {

	public static void main(String[] args) {
		/* 샘플 코드를 참고하여 아래와 같이 출력 되도록 코드를 작성하세요. */
		
		/* *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		
		
		
//		for(int i = 1; i <= 1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i = 1; i <= 2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i = 1; i <= 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i = 1; i <= 4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i = 1; i <= 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
//		for(int i = num; i < 5; i++) {
//			
//			String star = num + str1;
//				switch(str1) {
//				case " ":
//					star = str1 + num;
//				case "  ":
//					star = str1 + str1 + num;
//				}
//			System.out.print(str1 + "*");
//			}
		int row = 5, col = 5;	
		

		for(int i = 1; i <= row; i++) {
		
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* *          i = 1 일때 * =1개
		 * **         i = 2 일때 * =2개
		 * ***        i = 3 일때 * =3개
		 * ****       i = 4 일때 * =4개
		 * *****      i = 5 일때 * =5개
		 *                        *=?
		 * */                    
		
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*      *     i = 1 일때 공백 = 4, *=1
		 *     **     i = 2 일때 공백 = 3, *=2
		 *    ***     i = 3 일때 공백 = 2, *=3
		 *   ****     i = 4 일때 공백 = 1, *=4
		 *  *****     i = 5 일때 공백 = 0, *=5
		 * */

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*      *      1
		 *     ***     3
		 *    *****    5
		 *   *******   7
		 *  *********  9    
		 * */
	}

}
