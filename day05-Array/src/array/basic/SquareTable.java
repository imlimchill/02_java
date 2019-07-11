package array.basic;

/**
 * 1.
 * 정수를 원소로 가지는 배열 numbers 를 선언한 후
 * 
 * 2.
 * for (index 사용하는 전통적인 for) 구문을 사용하여 1 ~ 10 까지 정수를 저장한다.
 * 
 * 3.
 * foreach 구문을 사용하여 1 에서 저장된 값의 제곱표를 저장한다.
 * 
 * @author Administrator
 *
 */
public class SquareTable {

	public static void main(String[] args) {
		// 배열 선언 + 초기화
		int[] numbers = new int[10];
		
		// for 를 사용해 값 저장
		for (int idx = 0; idx < 10 ; idx ++) {
			numbers[idx] = idx + 1;
		}
		
		// foreach 를 사용해 값의 제곱표 출력
		System.out.println("== 저장된 값의 제곱표 ==");
		System.out.println();
		for (int num : numbers) {
			System.out.printf("%2d x %2d = %3d%n", num, num, num * num);
		}
		
	} //end main

} // end class
