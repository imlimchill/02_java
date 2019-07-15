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
		
		methods.birthYearMonth("임채정", 1997, 4);

		methods.printNineNineTable(4);

		methods.printNineNineTableFromArray(inputNum);

		printResult = methods.calcBmi(155, 50);
		System.out.printf("당신의 bmi결과는 %s 입니다.%n", printResult);

		result = methods.min(10, 6);
		System.out.printf("두 정수 중 작은 값을 %d 입니다.%n", result);

		result = methods.max(10,6);
		System.out.printf("두 정수 중 큰 값을 %d 입니다.%n", result);

		result = methods.sumOfArray(inputNum);
		System.out.printf("각 원소의 합은 %d 입니다.%n", result);

		resultDouble = methods.avgOfArray(inputNum);
		System.out.printf("각 원소의 평균은 %f 입니다.%n", resultDouble);

		methods.adder('+', 10, 20);
	}

}
