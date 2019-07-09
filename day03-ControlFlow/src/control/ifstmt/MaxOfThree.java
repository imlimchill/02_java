package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 세 정수 중에서 가장 큰 값을 판별하는 클래스
 * 입력값은 int num1, num2, num3; 변수에 저장
 * 가장 큰 값은 int max;변수에 저장
 * 
 * 중첩 if ~ else 로 판단
 * 
 * 마지막 출력 printf 사용
 * @author Administrator
 *
 */
public class MaxOfThree {

	public static void main(String[] args) {
		// 선언
		int num1;
		int num2;
		int num3;
		int max;
		
		Scanner scan;
		
		// 초기화
		scan = new Scanner(System.in);
		
		// 안내문 출력 및 정수 저장
		System.out.println("세 개의 정수를 입력해 주세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		// 중첩 if 문
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		} // end else
		
		//ctrl + shift + f : 자동 줄 맞춤 (어느 정도 해줌)
		
		System.out.printf("입력받은 정수 3개 %d, %d, %d 중 가장 큰 수는 %d 입니다.", num1, num2, num3, max);
		
	} //end main

}
