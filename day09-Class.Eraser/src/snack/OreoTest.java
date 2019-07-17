package snack;

/**
 * 오레오 쿠키가 3개 들어있는 oreoBox 라는 변수를 배열타입으로 선언
 * 
 * oreoBox[0] ~ [2] Oreo 쿠키를 입력
 * 크림의 종류는 바닐라, 초코, 딸기, 말차 중 하나로 입력할 것
 * 
 * OreoBox 에서 (foreach 사용해서) 모든 쿠키의 상태 출력
 * 
 * for를 사용하여 모든 쿠기의 크림을 바닐라로 변경
 * 
 * foreach를 사용해 모든 쿠키의 크림 변경 상태 확인을 출력
 * 
 * @author Administrator
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		// 선언
		Oreo[] oreoBox;
		
		// 초기화
		oreoBox = new Oreo[3];
		oreoBox[0] = new Oreo("초코", 5.0, 1.5);
		oreoBox[1] = new Oreo("말차", 5.0, 1.5);
		oreoBox[2] = new Oreo("딸기", 5.0, 1.5);
		
		// 사용
		// 초기화 후 오레오의 상태 출력
		for (Oreo oreo: oreoBox) {
			oreo.print();
		}
		
		// 모든 오레오의 크림을 바닐라로 변경
		for (int idx = 0; idx < oreoBox.length; idx++) {
			oreoBox[idx].changeCream("바닐라");
		}
		
		// 크림 변경 후 모든 오레오의 상태 출력
		for (Oreo oreo: oreoBox) {
			oreo.print();
		}
	}

}
