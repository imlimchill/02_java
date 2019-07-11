package array.multi;

/**
 * 2차 배열로 1 ~ 5 선수의 방어륳 입력 후 방어율이 가장 낮은 최고의 투수를 찾는 클래스
 */
import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		// 선언, 초기화
		Scanner scan = new Scanner(System.in);
		double[][] era = new double[3][5];
		double min = 10.0;
		double input = 0;
		int team = 0;
		int person = 0;
		
		// 각 팀별로 각 투수의 방어율을 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for (int idx = 0; idx < era.length; idx ++) {
			System.out.printf("%d 번째 팀 1 ~ 5선발 투수 방어율", idx + 1);
			for (int ind = 0; ind < era[idx].length; ind++) {
				input = scan.nextDouble();
				era[idx][ind] =  input;
				if (era[idx][ind] < min) {
					min = era[idx][ind];
					team = idx;
					person = ind;
				}
			}
		} //end for
		
		// 결과 출력
		System.out.println("최고의 투수는");
//		for (int idx = 0; idx < era.length; idx++) {
//			for (int ind = 0; ind < era[idx].length; ind++) {
//				
//			}
//		}
		System.out.printf("%d 팀의 %d 선발이다. 방어율 = %f", team + 1, person + 1, min);
		
		
	} //end main

} //end class
