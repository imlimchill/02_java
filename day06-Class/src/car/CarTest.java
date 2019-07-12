package car;

/**
 * Car(자동차) 라는 타입의 실제 객체를 생성하여 사용(테스트)하는 클래스
 * 
 * @author Administrator
 *
 */
public class CarTest {

	public static void main(String[] args) {
		// Car 라는 타입의 객체를 사용하기 위한 참조 변수가 필요함.
		// 1. Car 타입의 선언
		Car myCar;
		
		// 2. 초기화
		myCar = new Car();
		// 3. 사용 : Car 라는 타입(클래스) 에 정의된 메소드 호출
		// (1) 별명 붙이기
		System.out.println("== 별명 붙이기 전 ==");
		myCar.print();
		System.out.println("== 별명 붙이고 난 후 ==");
		myCar.setNickname("닉네임은 사치야");
		myCar.print();
		
//		System.out.println("1. myCar 의 초기화 후 속도");
//		myCar.print();
		
		// (2) 가속
		System.out.println("1. 60만큼 가속 후 속도");
		myCar.accelerate(60);
		myCar.print();
		
		System.out.println("1. 20만큼 가속 후 속도");
		myCar.accelerate(20);
		myCar.print();
		
		System.out.println("1. 정지 후 속도");
		myCar.stop();
		myCar.print();
	}

} // end class
