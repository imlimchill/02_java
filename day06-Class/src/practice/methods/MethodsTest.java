package practice.methods;

public class MethodsTest {

	public static void main(String[] args) {
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
	}

}
