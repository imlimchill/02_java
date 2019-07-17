package lecture;

/**
 * 마커와 칠판 지우개를 사용하여 
 * 마커를 쓰고 지우개로 지워보는 테스트 클래스
 * @author Administrator
 *
 */
public class LectureTest {

	public static void main(String[] args) {
		// 1. 선언 : 지우개 2개, 마커 4개
		Eraser leftEraser;
		Eraser rightEraser;

		// 2. 초기화
		// 기본 생성자로 생성
		leftEraser = new Eraser(3.5, 12.0, 5.5, 5, "검은색", "왼쪽");
		// 매개변수가 있는 생성자로 생성
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
		
		// 선언
		Mark redMarker;
		Mark blueMarker;
		Mark greenMarker;
		Mark blackMarker;

		// 초기화
		redMarker = new Mark("빨간색", true, false);
		blueMarker = new Mark("파란색", false, false);
		greenMarker = new Mark("초록색", true, true);
		blackMarker = new Mark("검은색", false, true);
		
		// 사용
		// (1) 네 개 마커 한 번씩 사용
		redMarker.use();
		blueMarker.use();
		greenMarker.use();
		blackMarker.use();
		
		// (2) 오른쪽, 왼쪽 지우개로 내용 지우기
		leftEraser.erase();
		rightEraser.erase();
		
		// (3) 오른쪽 지우개 한 겹 벗겨내기
		rightEraser.peel();
		
		// (4) 오른쪽, 왼쩍 지우개 상태 출력
		leftEraser.print();
		rightEraser.print();
	}

}
