package control.ifstmt;

/**
 * 두 정수를 비교하여 더 큰 값을 찾는 클래스
 * if문 을 사용하여 작성한다.
 */
import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// 선언
		int x;
		int y;
		int max = 0;
		Scanner scan;
		
		// 초기화
		scan = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하시오.");
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 입력된 두 값을 비교
		if (x > y) {
			max = x;
			System.out.printf("두 개의 정수 x = %d, y = %d 중에 큰 정수는 %d%n", x, y, max);
		}
		
		if (y > x) {
			max = y;
			System.out.printf("두 개의 정수 x = %d, y = %d 중에 큰 정수는 %d%n", x, y, max);
		}
		
		if (x == y) {
			System.out.printf("두 개의 정수 x = %d, y = %d 로 둘의 크기가 동일하다.", x, y);
		}
		
	}

}
