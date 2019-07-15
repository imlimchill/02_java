package practice.methods;

public class MethodsTest {

	public static void main(String[] args) {
		
		// 변수 정의
		int result;
		double resultDouble;
		String printResult;
		int[] inputNum = { 1, 2, 3 };

		// 1. 메소드 정의 클래스 VarietyMethods 의 변수 선언
		VarietyMethods methods;
		
		// 2. 초기화
		methods = new VarietyMethods();
		
		// 3. 사용
		methods.sayHello();
		methods.maxims("홍길동", "호부호영을 못하니...");
		methods.maxims("소크라테스", "Know yourself");
		methods.maxims("피터사간", "모든 사람은 두 종류의 고통중에서 선택해야 한다. 훈련하는 고통이거나 후회하는 고통이거나");
		double cel = methods.fahToCel(100.0);
		System.out.println("cel = " + cel);
		
		// 생일 텍스트 출력 메소드
		methods.birthYearMonth("임채정", 1997, 4);

		// 입력받은 수의 구구단을 출력하는 메소드
		methods.printNineNineTable(4);

		// 입력받은 배열의 원소에 해당하는 구구단을 출력하는 메소드
		methods.printNineNineTableFromArray(inputNum);

		// bmi 결과를 출력하는 메소드
		printResult = methods.calcBmi(155, 50);
		System.out.printf("당신의 bmi결과는 %s 입니다.%n", printResult);

		// 두 정수를 입력받아 작은 수를 리턴하는 메소드
		result = methods.min(10, 6);
		System.out.printf("두 정수 중 작은 값을 %d 입니다.%n", result);

		// 두 정수를 입력받아 큰 수를 리턴하는 메소드
		result = methods.max(10,6);
		System.out.printf("두 정수 중 큰 값을 %d 입니다.%n", result);

		// 배열을 입력받아 원소의 합을 리턴하는 메소드
		result = methods.sumOfArray(inputNum);
		System.out.printf("각 원소의 합은 %d 입니다.%n", result);

		// 배열을 입력받아 원소의 평균을 리턴하는 메소드
		resultDouble = methods.avgOfArray(inputNum);
		System.out.printf("각 원소의 평균은 %f 입니다.%n", resultDouble);

		// 입력되는 연산자가 + 일때만 연산의 결과가 출력되는 메소드
		methods.adder('+', 10, 20);
	}

}
