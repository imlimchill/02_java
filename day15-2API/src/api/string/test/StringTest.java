package api.string.test;

/**
 * 변경되지 않는 문자열을 제공하는 String 클래스 객체를 테스트 하는 클래스
 * -------------------------------------------------------------------------
 * new String(...) 으로 생성하지 않고 "..." 로 직접 할당하는 String 인스텐스는
 * literal pool 이라고 불리는 영역에 따로 생성된다.
 * 
 * literal pool 의 특징은 이 곳에 저장된 문자열은 재사용된다는 것이다.
 * @author Administrator
 *
 */
public class StringTest {

	public static void main(String[] args) {
		
		// String 변수 선언
		String str1 = new String("안녕하세요.");
		String str2 = new String("안녕하세요.");
		String str3 = "안녕하세요.";
		String str4 = "안녕하세요.";
		
		System.out.println("=== 객체 비교 ===");
		System.out.printf("str1 == str2 ? %b%n", str1 == str2);
		System.out.printf("str2 == str3 ? %b%n", str2 == str3);
		System.out.printf("str3 == str4 ? %b%n", str3 == str4);
		
		System.out.println("=== 객체 내용 비교 ===");
		System.out.printf("str1.equals(str2) ? %b%n", str1.equals(str2));
		System.out.printf("str2.equals(str3) ? %b%n", str2.equals(str3));
		System.out.printf("str3.equals(str4) ? %b%n", str3.equals(str4));
		
		// https://docs.oracle.com/javase/8/docs/api/
		// api 정리 되어있는 주소
		// https://changki.com/APIs/J2SE_1.8_API_Korean/index.html
		// 한국어 번역투 주소
			
		
	}

}
