import java.util.Random;

public class EX16_Random {

	public static void main(String[] args) {
		/* min~max사이의 랜덤한 수를 생성하는 예제 */
		int min = 1, max = 10;
		
		int r = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(r);

		Random random = new Random();
		int r2 = random.nextInt(min, max+1);
		System.out.println(r2);
		
	}

}
