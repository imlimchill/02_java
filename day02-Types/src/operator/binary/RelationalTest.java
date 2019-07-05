package operator.binary;

/**
 * <, >, <=, >=, ==, !=
 * 
 * 두 변수의 값을 비교하는 비교연산자를 테스트하는 클래스
 * 
 * 관계연산의 결과는 bollean 타입으로 얻어짐
 * @author Administrator
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int a = 1;
		int b = -5;
		
		// 3. 비교연신자 시용
		System.out.println("등가 비교 연산자");
		System.out.println("======================================");
		
		System.out.printf("(%d == %d) : %b%n", a, b, (a == b));
		System.out.printf("(%d != %d) : %b%n", a, b, (a != b));
		
		System.out.println("대소 비교 연산자");
		System.out.println("======================================");
		
		System.out.printf("(%d > %d) : %b%n", a, b, (a > b));
		System.out.printf("(%d < %d) : %b%n", a, b, (a < b));
		System.out.printf("(%d >= %d) : %b%n", a, b, (a >= b));
		System.out.printf("(%d <= %d) : %b%n", a, b, (a <= b));
		
		// 이클립스 IDE 의 단축기
		// ctri + d : 커서가 있는 행 전체 삭제
		// alt + shift + a : 세로줄 편집 기능 토글
		// alt + up/down : 행 전체 상하 이동
		// ctrl + shift + L : 단축기 모음 안내창 오픈 > 여기에서 필요하다고 생각하는 단축기 외우기 중요
		// ctrl + F6 : 열려있는 파일 사이에 이동
		
	}

}
