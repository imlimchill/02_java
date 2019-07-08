package control.ifstmt;

import java.util.Scanner;

/**
 * 하나의 정수를 입력받아서 음수인지 양수인지 판단하는 클래스
 * 
 * 단, 여기서는 0 에 대한 판단은 하지 않는다.
 * 
 * 입력받을 변수 input 을 선언하여 Scanner 로 입력받아 if ~ else 구문으로 부호 판별한 후
 * 판별 결과를 저장하는 변수 String result 에 저장하여
 * 
 * "입력값 100 은(는) 양수입니다."
 * "입력값 -1 은(는) 음수입니다." 
 * "입력값은 0 은(는) 0입니다."
 * 라는 문장을 출력하시오
 * @author Administrator
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 선언
		int input;
		String result;
		Scanner scan;
		
		// 초기화
		scan = new Scanner(System.in);
		
		System.out.printf("0을 제외한 숫자를 하나 입력하시오.");
		input = scan.nextInt();
		
		// 사용
		if (input < 0) {
			result = "음수";
		} else {
			result = "양수";
		}
		
		System.out.printf("입력값 %d 은(는) %s입니다.%n", input, result);
	}

}
