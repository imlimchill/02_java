package control.loop;

/**
 * while 문을 이용하여 0 ~ 100 사이의 홀수의 합을 구하는 클래스
 * @author Administrator
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		// 선언 + 초기화
		int num = 1;
		int sum = 0;
		
		// 사용
		while (num <= 100) {
			if (num % 2 == 1) {
				sum += num;
			}
			num++;
		}
		
		// 출력
		System.out.printf("1부터 100사이 홀수의 합은 %d 입니다.%n", sum);
		
	} // end main

} // end class
