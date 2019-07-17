package eraser.three;

/**
 * 칠판 지우개를 만들고 사용해보는 클래스
 * @author Administrator
 *
 */
public class EraserTest {

	public static void main(String[] args) {
		// 1. 선언 : 칠판지우개 객체 참조변수
		Eraser leftEraser;
		Eraser rightEraser;
		
		// 2. 초기화
		// 기본 생성자로 생성
		leftEraser = new Eraser();
		// 매개변수가 있는 생성자로 생성
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색");
		
		// 3. 사용
		// (1) 초기상태
		leftEraser.print();
		rightEraser.print();
		
		// (2) 오른쪽 한겹 제거
		rightEraser.peel();
		
		// (3) 두 지우개 상태 출력
		leftEraser.print();
		rightEraser.print();
		
		// (4) 둘 다 한겹 제거
		leftEraser.peel();
		rightEraser.peel();
		
		// (5) 왼쪽 칠판지우기
		leftEraser.erase();
		
		// (6) 두 지우개 상태 출력
		leftEraser.print();
		rightEraser.print();
		
		// ctrl + 클릭 => 해당 메소드, 생성자로 이동
	}

}
