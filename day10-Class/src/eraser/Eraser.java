package eraser;

/**
 * 칠판지우개를 정의하는 클래스
 * --------------------------------------------
 * 지우개 일련변호 부여를 위한 클래스 변수
 * count 를 선언하고 0으로 초기화
 * --------------------------------------------
 * 칠판 지우개 속성 정의 => 멤버변수로 생성
 * 가로 : width : double
 * 세로 : height : double
 * 높이 : depth : double
 * 곂   : layer : int
 * 색상 : color : String
 * --------------------------------------------
 * 생성자 정의 : 중복정의
 * 기본 생성자 명시
 * 			: 기본생성자에서 serial 변수에 증가된 count 변수의 값을 저장;
 * 
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * 
 * 생성자 리팩토링 (1)
 * 						  : this 키워드를 사용하여 매개변수 생성자 정의
 * 
 * 생성자 리팩토링 (2)
 * 						  : this() 다른 생성자 호출 적용하여 생성자 여러개 중복정의
 * -------------------------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판 지우개 : erase() : void 
 * 			   : "칠판을 지웠습니다." 문자열 출력
 * 한겹씩 제거 : peel() : void
 * 			   : 현재 layer 값에서 1 감소 / layer 가 0이 되기 전까지
 * 지우개 상태 출력 : print() : void
 * 					: 현재 지우개의 가로, 세로, 높이, 남은 곂, 색상 등의 상태를 출력
 * 
 * @author Administrator
 *
 */
public class Eraser {
	
	// TODO 스태틱 변수 int 타입의 count 선언하고 0 초기화
	static int count = 0;
	
	// 1. 멤버변수 선언부
	// TODO int 타입의 일련번호 저장할 멤버정수 serial 선언
	int serial;
	
	/** 지우개 가로 길이*/
	double width;
	
	/** 지우개 세로 길이*/
	double height;
	
	/** 지우개 높이 길이*/
	double depth;
	
	/** 지우개 겹의 수*/
	int layer;
	
	/** 손잡이 색깔*/
	String color;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	/**
	 * 지우개 클래스의 기본 생성자
	 * 각 멤버변수 필드를 타입의 기본값으로 초기화 진행
	 */
	Eraser() {
		//TODO 멤버변수인 serial 을 count 클래스 변수를 증가시킨 값으로 저장
		serial = ++count;
	}
	
	/**
	 * 지우개의 가로 필드만 초기화 하는 생성자
	 * @param width : 가로 길이 => 직접초기화
	 */
	// (2) 매개변수를 받는 생성자
	Eraser(double width) {
		this(); // 위의 기본 생성자 호출 : 매개 변수가 비어있는 this() 이므로
		this.width = width; // width 필드는 매개변수로 넘겨진 값으로 초기화
	}
	
	/**
	 * 지우개의 가로, 세오 필드만 초기화하는 생성자 *
	 * @param width : 가로길이 => width 필드를 초기화하는 생성자의 기능을 사용
	 * @param height : 세로길이 => 직접 초기화
	 */
	Eraser(double width, double height){
		this(width);
		this.height = height;
	}
	
	/**
	 * 지우개의 가로, 세로, 높이 필드를 초기화하는 생성자
	 * @param width : 가로길이 ==> 매개변수 2개 받는 생성자로 초기화
	 * @param height : 세로길이 ==> 매개변수 2개 받는 생성자로 초기화
	 * @param depth : 높이 ==> 직접 초기화
	 */
	Eraser(double width, double height, double depth){
		this(width, height);
		this.depth = depth;
	}
	
	/**
	 * 지우개의 가로, 세로, 높이, 겹 필드를 초기화하는 생성자
	 * @param width : 가로길이 ==> 매개변수 3개 받는 생성자로 초기화
	 * @param height : 세로길이 ==> 매개변수 3개 받는 생성자로 초기화
	 * @param depth : 높이길이 ==> 매개변수 3개 받는 생성자로 초기화
	 * @param layer : 곂 ==> 직접 초기화
	 */
	Eraser(double width, double height, double depth, int layer){
		this(width, height, depth);
		this.layer = layer;
	}
	
	// 다섯 개 모두 받는다.
	Eraser(double width, double height, double depth, int layer, String color) {
		// alt + shift + a : 세로 편집 모드 토글
		// alt + shift + r : 같은 변수 같이 편집하기
		this(width, height, depth, layer);
		this.color = color;
	}
	// 3. 메소드 선언부
	// (1) 칠판 지우개
	public void erase() {
		System.out.println("칠판을 지웠습니다.");
	}
	
	// (2) 한겹씩 제거
	/**
	 * 남아있는 지우개 겹을 벗겨내는 메소드
	 * layer 값이 0보다 작을 수는 없다.
	 */
	public void peel() {
		// if 를 사용하여 layer 값이 0보다 작아질 수 없도록 값을 체크
		if(this.layer > 0) {
			layer--;
		} else {
			System.out.println("제거할 지우개가 없습니다.");
		}
	}
	
	// (3) 지우개 상태 출력
	public void print() {
		System.out.println("현재 지우개 상태");
		System.out.printf("serial : %d%n", serial);
		System.out.printf("width : %4.2f%n", width);
		System.out.printf("height : %4.2f%n", height);
		System.out.printf("depth : %4.2f%n", depth);
		System.out.printf("layer : %d%n", layer);
		System.out.printf("color : %s%n", color);
	}
}
