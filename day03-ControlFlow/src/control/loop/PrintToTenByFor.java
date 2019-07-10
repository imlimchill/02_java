package control.loop;

/**
 * 1 ~ 10 까지 출력하는 클래스
 * 
 * for 문을 사용해서 출력
 * @author Administrator
 *
 */
public class PrintToTenByFor {

	public static void main(String[] args) {
		
		// for (선언식; 조건식; 증감식) {
		// 문장들;
		// }
		
		// 1. 선언식 : 선언의 형태 => 타입 변수이름;
		// 2. 조건식 : 조건의 형태 => 비교 연산자(관계, 동일) 를 사용한 식 / 연산의 결과가 true, false 로 얻어짐
		// 3. 증감식 : 증감연산자(++, --) 를 활용하여 선언식에서 선언된 루프제어 변수값을 변경
		
		for (int idx = 1; idx <= 10; idx++) {
			System.out.printf("idx = %2d%n", idx);
		}
		
		for (int idx = 1; idx < 11; idx++) {
			System.out.printf("idx = %2d%n", idx);
		}
		
		for (int idx = 0; idx < 10; idx++) {
			System.out.printf("idx = %2d%n", idx + 1);
		}
		
		// ☆혼나는 방법☆
		int dex = 10;
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		// 변수이름을 i 한글자를 준다.
		// for 문 밖에서 선언해도 안에서 하면 밖에꺼 못씀
		
		// 역순으로 출력
		System.out.println("=========역순 출력========");
		for (int idx = 10; idx > 0; idx--) {
			System.out.printf("idx = %2d%n", idx);
		}
		
		// final 변수 == 상수를 활용한 for loop
		final int FROM = 1;
		final int TO = 10;
		
		System.out.println("=========from, to 상수를 사용한 출력========");
		for (int idx = FROM; idx <= TO; idx++) {
			System.out.printf("idx = %2d%n", idx);
		}
		
		// from, to 상수를 사용한 역순 출력
		System.out.println("=========FROM, TO 상수를 사용한 역순 출력========");
		for (int idx = TO; idx >= FROM; idx--) {
			System.out.printf("idx = %2d%n", idx);
		}
		
		System.out.println("=========FROM, TO 상수를 사용해 0~9 출력========");
		for (int idx = FROM; idx <= TO; idx++ ) {
			System.out.printf("idx = %2d%n", idx - 1);
		}
		
	} //end main

}
