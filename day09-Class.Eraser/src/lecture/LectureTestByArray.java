package lecture;

/**
 * 2개의 지우개와 4개의 마커를 
 * 배열을 사용하여 사용/관리 하는 테스트 클래스
 * --------------------------------------------
 * 1. 마커(Marker) 배열 markers 를 선언
 *    지우개(Eraser) 배열 erasers 를 선언
 *    
 * 2. markers 는 길이 4로 생성
 *    eraser 는 길이 2로 생성
 *  
 *  markers[0] <== 에는 순서대로 
 *  ~ 
 *  markers[3] red, green, blue, black 마커를 저장 
 *  
 *  erasers[0], [1] 에는 순서대로
 *            leftEraser, rightEraser 를 저장
 *            
 * 3. foreach 를 사용하여
 *   (1) 모든 마커를 한번씩 사용(use())
 *   (2) 모든 지우개를 한번씩 사용(erase())
 *   (3) 모든 지우개를 한번씩 한 겹 벗겨내기(peel())
 *   (4) 모든 지우개의 상태 출력
 *   (5) 모든 마커의 상태 출력          
 *  
 * @author 
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
