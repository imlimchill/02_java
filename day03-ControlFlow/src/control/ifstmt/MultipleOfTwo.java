package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 정수에 대해서 2의 배수인지 판별
 * 
 * Scanner 를 사용하여 입력된 정수를 input 변수에 저장하고 입력된 값이 2의 배수인지 판단하는 조건을 작성하시오
 * 2의 배수 반별 결과는 String result 에 저장하시오
 * 나머지는 int mod 에 저장하여 사용하시오
 * 
 * - (1) ---------------------------------------------------------
 * 2의 배수일 때 : "입력값 4 은(는) 2의 배수입니다."
 * 2의 배수가 아닐 때 : "입력값 5 은(는) 2의 배수가 아닙니다."
 * 
 * -- (2) --------------------------------------------------------
 * 2의 배수일 때 : "입력값 4 은(는) 2의 배수입니다."
 * 2의 배수가 아닐 때 : "입력값 5 은(는) 2의 배수가 아닙니다."
 * 						"나머지가 1입니다."
 * ---------------------------------------------------------------
 * @author Administrator
 *
 */
public class MultipleOfTwo {

	public static void main(String[] args) {
		// 선언
		int input;
		int mod;
		String result;
		Scanner scan;
		
		// 초기화
		scan = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하시오.");
		input = scan.nextInt();
		
		// 사용
		if (input % 2 == 0) {
			result = "2의 배수입니다.";
		} else {
			result = "2의 배수가 아닙니다.";
		}
		
		System.out.printf("입력값 %d 은(는) %s%n", input, result);
		
		// (2) 나머지 구하기
		mod = input % 2;
		if (mod > 0) {
			System.out.printf("나머지가 %d입니다.", mod);
		}
		
		scan.close();
	}

}
