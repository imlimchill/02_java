package control.loop;

import java.util.Scanner;

/**
 * 점수를 while 로 계속 입력받아 총점과 평균 구하기
 * 
 * @author Administrator
 *
 */
public class TotalNAverage {

	public static void main(String[] args) {
		// 선언 + 초기화
		int total = 0;
		int score = 0;
		int count = 0;
		double average;
		
		Scanner scan = new Scanner(System.in);
		
		// 안내문 출력 및 정수 입력
		System.out.println("점수를 입력(끝내려면 0 입력) : ");
		score = scan.nextInt();
		
		// total 점수 구하기
//		while (score != 0) {
//			total += score;
//			System.out.println("점수를 입력(끝내려면 0 입력) : ");
//			score = scan.nextInt();
//			count++;
//		}
		
		do {
			if(score == 0) {
				break;
			}
			
			total += score;
			System.out.println("점수를 입력(끝내려면 0 입력) : ");
			score = scan.nextInt();
			count++;
		} while (score != 0);
		
		
		// 평균 구하기 및 출력
		if (count == 0) {
			System.out.println("입력된 값이 없습니다.");
		} else {
			average = (double)total / count;
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f%n", average);
		}
		
	} // end main

} // end class
