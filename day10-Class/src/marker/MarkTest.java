package marker;

/**
 * 화이트 보드 마커를 사용하는 클래스
 * @author Administrator
 *
 */
public class MarkTest {

	public static void main(String[] args) {
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
		// 상태 출력
		redMarker.print2();
		blueMarker.print2();
		greenMarker.print2();
		blackMarker.print2();
		
		// 마커 사용하는 메소드 출력
		redMarker.use();
		blueMarker.use();
		greenMarker.use();
		blackMarker.use();
	}

}
