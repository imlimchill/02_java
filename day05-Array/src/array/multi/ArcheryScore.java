package array.multi;

import java.util.Scanner;

/**
 * 3명의 양궁선수의 9차시까지 점수를 배열에 입력하고 전체 합산 점수가 가장 높은 선수의 인덱스 점수를 출력하라
 * @author Administrator
 *
 */
public class ArcheryScore {

	public static void main(String[] args) {
		// 선언 + 초기화
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3]; // 세명의 선수의 합 저장
		int max = 0; // 세 명의 선수 중 가장 높은 점수
		int win = 0; // 우승한 사람
		int input;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.printf("%d 번째 선수 점수 입력 :", idx + 1);
			for (int ind = 0; ind < score[idx].length; ind++) {
				input = scan.nextInt();
				score[idx][ind] = input;
				sum[idx] += input; // 합 저장
				
			}
			if (sum[idx] > max) {
				max = sum[idx];
				win = idx;
			}
		}
		
		System.out.println("우승 선수 :");
		System.out.printf("%d 번째 선수 (총 점수 : %d)", win + 1, max);
	} // end main

} // end class
