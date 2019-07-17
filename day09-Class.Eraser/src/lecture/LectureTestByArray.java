package lecture;

/**
 * 지우개, 마커 선언해
 * 값을 배열에 집어넣어
 * 사용 : loop 돌려서 한번씩 사용
 *        지우개 돌려 loop
 *        양쪽 지우개 한장씩 제거 loop
 *        마커의 상태출력 loop
 *        지우개 상태출력 loop
 * @author Administrator
 *
 */
public class LectureTestByArray {

	public static void main(String[] args) {
		
		// 선언
		/** 지우개 선언*/
		Eraser[] erasers;
		
		/** 마커 선언*/
		Mark[] markers;
		
		// 초기화
		erasers = new Eraser[2];
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 5, "검은색", "왼쪽");
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
		
		markers = new Mark[4];
		markers[0] = new Mark("빨간색", true, false);
		markers[1] = new Mark("파란색", false, false);
		markers[2] = new Mark("초록색", true, true);
		markers[3] = new Mark("검은색", false, true);
		
		// 사용
		// 마커 한 번씩 사용
		for (Mark marker: markers) {
			marker.use();
		}
		System.out.println();
		
		// 지우개로 칠판 한 번씩 지우기
		for (Eraser eraser: erasers) {
			eraser.erase();
		}
		System.out.println();
		
		// 지우개 한 번씩 한 겹 벗겨내기
		for (Eraser eraser: erasers) {
			eraser.peel();
		}
		
		// 모든 지우개의 상태출력
		for (Eraser eraser: erasers) {
			eraser.print();
			System.out.println();
		}
		
		// 모든 마커의 상태출력
		for (Mark marker: markers) {
			marker.print();
			System.out.println();
		}
		
		
	}

}
