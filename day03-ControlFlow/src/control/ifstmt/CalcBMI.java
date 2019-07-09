package control.ifstmt;

import java.util.Scanner;

/**
 * 스캐너 사용해 값 입력받기
 * 몸무게 = double weight;
 * 키 = double height;
 * 출력 = 당신의 몸무게는 ~, 키는 ~ 로 당신은 ~ 입니다.
 * @author Administrator
 *
 */

public class CalcBMI {

	public static void main(String[] args) {
		// 선언 + 초기화
		double weight;
		double height;
		double bmi;
		String result;
		
		Scanner scan = new Scanner(System.in);
		
		// 값 입력
		System.out.printf("당신의 몸무게를 입력하세요.");
		weight = scan.nextDouble();
		System.out.printf("당신의 키를 입력하세요.");
		height = scan.nextDouble();
		
		// BMI 계산
		bmi = weight / ((height/100) * (height/100));
		
		// BMI 판정
		if (bmi < 15.0) {
			result = "병적인 저체중";
		} else if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23.0) {
			result = "정상";
		} else if (bmi < 27.5) {
			result = "과체중";
		} else if (bmi < 40.0) {
			result = "비만";
		} else {
			result = "병적인 비만";
		}
		
		// 출력
		System.out.printf("당신의 몸무게는 %.1f, 키는 %.1f 로 당신은 %s 입니다.", weight, height, result);
		
	}

}
