package snack;

/**
 * 오레오 쿠키를 정의하는 클래스
 * ------------------------------------------------
 * 속성
 * cream : String : 바닐라, 초코, 딸기, 말차
 * radius : double : 오레오 쿠키 1개의 반지름
 * thickness : double : 오레오 쿠키 1개의 두께
 * ------------------------------------------------
 * 생성자
 * 기본생성자
 * 중복정의 된 this, this() 로 정의하는 생성자
 * 총 4개의 생성자 중복정의
 * --------------------------------------------------
 * 메소드 : 
 * print() : void : 오레오 쿠키의 상태 출력
 * changeCream(String cream) : void
 * 			: 매개변수로 입력된 cream 값으로 오레오 쿠키의 크림을 변경합니다. 
 * @author Administrator
 *
 */
public class Oreo {
	// 멤버 변수
	/** 오레오 크림*/
	String cream;
	
	/** 오레오의 반지름*/
	double radius;
	
	/** 오레오의 두께*/
	double thickness;
	
	// 생성자
	// (1) 기본생성자
	Oreo() {
		
	}
	
	// (2) 매개변수를 가진 생성자 3개
	Oreo(String cream) {
		this();
		this.cream = cream;
	}
	
	Oreo(String cream, double radius) {
		this(cream);
		this.radius = radius;
	}
	
	Oreo(String cream, double radius, double thickness) {
		this(cream, radius);
		this.thickness = thickness;
	}
	
	// 메소드
	/**
	 * 오레오의 전체 상태를 출력하는 클래스
	 */
	public void print() {
		System.out.println("현재 오레오의 상태");
		System.out.printf("[크림 = %s]%n", cream);
		System.out.printf("[반지름 = %4.1f]%n", radius);
		System.out.printf("[두께 = %4.1f%]n%n", thickness);
	}
	
	/**
	 * 오레오의 크림을 입력받아 바꾸는 클래스
	 * @param cream
	 */
	public void changeCream(String cream) {
		this.cream = cream;
	}
}
