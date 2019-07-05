package type.primitive;

/** 논리타입인 boolean 타입을 선언하고
 * 테스트하는 클래스
 * 
 * 
 */
public class BooleanTest {

	public static void main(String[] args) {
		// 1. 선언
		boolean isLikeBaseball;
		boolean isExists;
		boolean isHave;
		boolean isEnd = false; // 선언과 동시에 초기화
		
		// 2. 초기화
		isLikeBaseball = false;
		isExists = true;
		isHave = true;
		
		System.out.println("isLikeBaseball = " + isLikeBaseball);
		System.out.println("isExists = " + isExists);
		System.out.println("isHave = " + isHave);
		System.out.println("isEnd = " + isEnd);
	}

}
