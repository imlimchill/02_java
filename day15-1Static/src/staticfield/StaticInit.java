package staticfield;

/**
 * static 멤버 (필드, 메소드) 와
 * non-static 멤버(필드, 메소드) 의
 * 
 * 초기화 시점에 따른 참조를 구성하는 클래스
 * 
 * @author Administrator
 *
 */
public class StaticInit {
	
	// 1. 변수선언
	// (1) 스태틱 변수 선언(클래스 변수 선언) => 순서상 멤버변수보다 먼저
	// static 변수는 생성자가 초기화하는 영역이 아니므로 선언하면서 필요한 초기값을 바로 할당한다.
	static int count = 0; 
	
	// (2) 인스턴스 변수 선언
	int munberCnt;

	private String memberCnt;
	
	// 2. 생성자 선언 생략 => 기본 생선자 자동제공
	
	// 3. 메소드 선언
	// (1) 접근자, 수정자 ==> 멤버 변수에 대해서 제공
	
	public void setMumberCnt(int mumberCnt) {
		this.munberCnt = mumberCnt;
	}
	
	public int getMumberCnt() {
		return this.munberCnt;
	}
	
	// (2) 그 외 기타 기능 메소드
	
	/**
	 * static 핃드의 count 변수의 getter (접근자)
	 * @return count : int
	 */
	public static int getCount() {
		return count;
	}
	
	/**
	 * static 필드인count 필드를 하나씩 증가시키는 메소드
	 */
	public static void increaseCount() {
		count++;
	}
	
	/**
	 * static 필드인 count 변수와 
	 * non-static 필드인 memberCnt 변수의 값을 모두 출력하는 메소드
	 */
	public static void print() {
		// 1. count 출력
		System.out.println("count= " + count);
		// 2. memberCnt 출력
//		System.out.println("memberCnt= " + memberCnt);
		/* ----------------------------------------------------------------------------
		 * 윗줄의 오류이유 : print() 메소드는 static 
		 * 					 memberCnt 변수는 non-static
		 * static 필드에서 non-static 필드를 참조(사용)하려면 바로 사용할 수 없고
		 * 그 non-static 필드를 가지고 있는 클래스의 인스턴스를 생성한 후(new...)
		 * 생성한 인스턴스.non-static 필드이름으로 접근하는 것만 가능하다.
		 * ----------------------------------------------------------------------------
		 */
		StaticInit init = new StaticInit();
		System.out.println("memberCnt= " + init.memberCnt);
		System.out.println("memberCnt= " + init.getMumberCnt()); // 이것도 선언 후 사용가능
	}
	
	/**
	 * 이 클래스의 count 값과 입력된 StaticInit 객체로 부터
	 * 각가의 값과 그 값을 합친 값 출력
	 * @param init
	 */
	public static void print(StaticInit init) {
		System.out.println("count=" + count);
		System.out.println("memberCnt=" + init.getMumberCnt());
		System.out.println("count + memberCnt=" + init.addCount());
	}
	
	/**
	 * 이 클래스의 클래스 변수인 count 와 인스턴스 변수인 memberCnt를 더한 값을 리턴하는 메소드
	 * @return count + memberCnt : int
	 */
	public int addCount() {
		return this.munberCnt + count;
	}
	
} // end class
