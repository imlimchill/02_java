package control.swtchstmt;

import java.util.Scanner;

/**
 * switch 구문 사용하여 다름의 기준으로 학점을 계산하는 클래스
 * --------------------------------------------------------------------- 
 * A : 90점이상 
 * B : 80 ~ 89 점 사이 
 * C : 60 ~ 79 점 사이 
 * D : 40 ~ 59 점 사이 
 * F : 이하 나머지
 * ---------------------------------------------------------------------- 
 * printf
 * 로 출력
 * 
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		// 선언
		int score;
		char grade = '0';
		
		// 초기화 및 점수 저장
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 정수를 입력하세요");
		score = scan.nextInt();
		
		// 사용
		switch (score / 10) {
		case 0 : 
		case 1 : 
		case 2 : 
		case 3 :
			grade = 'F';
			break;
			
		case 4 : 
		case 5 :
			grade = 'D';
			break;
			
		case 6 : 
		case 7 :
			grade = 'C';
			break;
			
		case 8 :
			grade = 'B';
			break;
			
		case 9 : 
		case 10 :
			grade = 'A';
			
		} //end switch
		
		System.out.printf("점수 : %d 학점 : %c", score, grade);
		
		scan.close();
	}

}
