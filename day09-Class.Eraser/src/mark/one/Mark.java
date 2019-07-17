package mark.one;

/**
 * 화이트 보드 마커를 정의하는 클래스
 * 
 * 멤버필드
 * String color : 색깔 저장
 * boolean isOpened : true 면 열림 / false 면 닫힘
 * boolean isNew : true 면 새거 / false 면 다 씀
 * -------------------------------------------------------
 * 생성자
 * (1) 기본 생성자
 * (2) 매개변수가 있는 생성자
 * -------------------------------------------------------
 * 메소드
 * use() : 무슨 색의 마커인지 출력과 동시에 사용하고 있다는 문장 출력
 * print() : 현재 마커의 상태 전체 출력
 * @author Administrator
 *
 */
public class Mark {
	// 필드
	/** 마커 잉크의 색상*/
	String color;
	
	/** 마커 뚜껑이 열려있는지 여부*/
	boolean isOpened;
	
	/** 새 마커인지 여부*/
	boolean isNew;
	
	// 생성자
	// (1) 기본 생성자
	Mark() {
		
	}
	
	// (2) 매개변수가 있는 생성자
	Mark(String color) {
		this();
		this.color = color;
	}
	
	Mark(String color, boolean isOpened) {
		this(color);
		this.isOpened = isOpened;
	}
	
	Mark(String color, boolean isOpened, boolean isNew) {
		this(color, isOpened);
		this.isNew = isNew;
	}
	
	// 메소드
	/**
	 * 현재 사용하고 있는 색상 출력
	 */
	public void use() {
		System.out.printf("%s 색의 마커를 사용하고 입니다.%n", color);
	}
	
	/**
	 * 현재 마커의 전체 상태에 대해 출력
	 */
	public void print() {
		System.out.println("현재 마커의 상태입니다.");
		
		// color 의 출력
		System.out.printf("color = %s%n", color);
		
		// isOpened 의 출력
		if (isOpened == true) {
			System.out.println("마커가 열렸습니다.");
		} else {
			System.out.println("마커가 닫쳤습니다.");
		}
		
		// isNew 의 출력
		if (isNew == true) {
			System.out.println("이 마커는 새거입니다.");
		} else {
			System.out.println("마커를 다 사용하였습니다.");
		}
	} // end print()
	
	/**
	 * 강사님의 방법
	 */
	public void print2() {
		String message = "마커 색상 : %s%n%s%n%s%n%n";
		String openStatus;
		String newStatus;
		
		// isOpened
		if (isOpened) {
			openStatus = "마커가 열렸습니다.";
		} else {
			openStatus = "마커가 닫쳤습니다.";
		}
		
		// isNew
		if (isNew) {
			newStatus = "이 마커는 새거입니다.";
		} else {
			newStatus = "마커를 다 사용하였습니다.";
		}
		
		System.out.printf(message, color, openStatus, newStatus);
	} // end print()
} // end class
