package control.ifstmt;

import java.util.Scanner;

/**
 * 세 정수를 입력받아서 그 중 가장 작은 정수를 판별하는 클래스이다.
 * ------------------------------------------------------------------
 * 가장 작은 정수를 판별할 때 중첩 if ~ else 구문을 사용
 * ------------------------------------------------------------------
 * @author Administrator
 *
 */
public class MinOfThree {

	public static void main(String[] args) {
		// 1. 선언
		int num1;
		int num2;
		int num3;
		int min;
		
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		// 정수 입력 안내 prompt
		System.out.println("세 정수를 입력하세요");
		
		// 입력값 저장
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		// 3. 사용 : 입력값의 대소 판단
		if (num1 < num2) {
			// num1 이 작을 때 진입
			if (num1 < num3) {
				// num1 이 작을 때 
				min = num1;
			} else {
				// num3 이 작을 때
				min = num3;
			}
		} else {
			// num2 가 작을 때
			if (num2 < num3) {
				// num2 가 작을 때
				min = num2;
			} else {
				// num3 이 작을 때
				min = num3;
			}
		} //end else
		
		System.out.printf("다음 세 개의 숫자 num1 = %d, num2 = %d, num3 = %d 중 가장 작은 수는 %d 입니다.", num1, num2, num3, min);
	} // end main

}
