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
public class WhileTest {

	public static void main(String[] args) {
		// 1 - 1 continue 없이
		int idx = 50;
		
		System.out.println("==== continue 없이 ====");
		while (idx != 0) {
			if (idx % 2 == 0) {
				System.out.printf("%d ", idx);
			}
			idx--;
		}
		System.out.println();
		System.out.println();
		
		// 1 - 2 continue 사용
		idx = 50;
		
		System.out.println("==== continue 사용 ====");
		while (idx != 0) {
			if (idx % 2 != 0) {
				//continue;
			} else {
				System.out.printf("%d ", idx);
			}
			idx--;
		}
		System.out.println();
		System.out.println();
		
		// 2. 제곱표
		idx = 1; 
		
		System.out.println("==== 1 ~ 10 까지의 제곱표 ====");
		while (idx < 10) {
			System.out.printf("%2d x %2d = %3d%n", idx, idx, idx * idx);
			idx++;
		}
	} // end main

} // end class
