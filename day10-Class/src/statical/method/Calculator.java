package statical.method;

/**
 * 산술 연산인 뎃셈, 뺄셈, 곱셉, 나눗셈을 처리하는 각각의 메소드
 * add, subtract, multiply, divide 를 정의한다.
 * 
 * 각 메소드마다 매개변수를 정수 2개, 실수 2개를 받는 메소드 중복 정의 기법을 사용하여
 * 총 8개의 메소드를 정의하고 연산 결과를 리턴하도록 작성한다.
 * 
 * 이 때 각 메소드는 모두 static 으로 작성 
 * @author Administrator
 *
 */
public class Calculator {
	// 필드
	
	// 생성자
	
	// 메소드
	// add 덧셈
	public static int add (int num1, int num2) {
		return num1 + num2;
	}
	
	public static double add (double num1, double num2) {
		return num1 + num2;
	}
	
	// subtract 뺄셈
	public static int subtract (int num1, int num2) {
		return num1 - num2;
	}
	
	public static double subtract (double num1, double num2) {
		return num1 - num2;
	}
	
	// multiply 곱셈
	public static int multiply (int num1, int num2) {
		return num1 * num2;
	}
	
	public static double multiply (double num1, double num2) {
		return num1 * num2;
	}
	
	// divide 나눗셈
	public static int divide (int num1, int num2) {
		return num1 / num2;
	}
	
	public static double divide (double num1, double num2) {
		return num1 / num2;
	}
}
