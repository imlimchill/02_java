package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문 사용하여 다름의 기준으로 학점을 계산하는 클래스
 * --------------------------------------------------------------------- A : 90점
 * 이상 B : 80 ~ 89 점 사이 C : 60 ~ 69 점 사이 D : 40 ~ 59 점 사이 F : 이하 나머지
 * ---------------------------------------------------------------------- printf
 * 로 출력
 * 
 * @author Administrator
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 선언
		int score;
		char grade;

		// 스캐너 선언과 초기화
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 정수를 입력 :");
		score = scan.nextInt();

		// if 문
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 60) {
			grade = 'C';
		} else if (score >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// 출력
		System.out.printf("%d 점에 해당하는 학점은 : %c 입니다.", score, grade);
	}

}
