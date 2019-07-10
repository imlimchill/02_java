package control.loop;

/**
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 * 		(1) continue 없이
 * 		(2) continue 사용
 * 
 * 2. 1 ~ 10 까지 제곱표를 출력
 * 		 1 x  1=    1
 * 		 2 x  2 =   4
 * 		10 x 10 = 100
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		// 1 - 1 continue 없이
		
		System.out.println("==== continue 없이 ====");
		for (int idx = 50; idx > 0; idx--) {
			if (idx % 2 == 0) {
				System.out.printf("%d ", idx);
			}
		}
		System.out.println();
		System.out.println();
		
		// 1 - 2 continue 사용
		
		System.out.println("==== continue 사용 ====");
		for (int idx = 50; idx > 0; idx--) {
			if(idx % 2 != 0) {
				continue;
			}
			System.out.printf("%d ", idx);
		}
		System.out.println();
		System.out.println();
		
		// 2 제곱표 출력
		
		System.out.println("==== 1 ~ 10 의 제곱표 ====");
		for (int stage = 1; stage <= 10; stage++) {
			System.out.printf("%2d x %2d = %3d%n", stage, stage, stage * stage);
		}
		
	} // end main

} // end class
