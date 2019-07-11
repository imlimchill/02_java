package array.multi;

/**
 * 수학의 행렬을 나타앨 수 있는 2차원 배열을 선언하고 초기화 후
 * 출력해보는 클래스
 * @author Administrator
 *
 */
public class Matrix {

	public static void main(String[] args) {
		// 1. 선언 2. 배열 초기화 목록으로 초기화
		int[][] matrix  = {{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};
		// int[][] matrix  = {{0, 1, 0}, {}, {}};  일 때 matrix[2]의 길이는 0이다.
		// int[][] matrix  = {{0, 1, 0}, {}, {0, 0}}; 처럼 배열의 길이가 일정할 필요는 없다.
		// int[]   matrix[0] = {0, 1, ,2};
		// int[]   numbers = {10, 20, 30};
		
		// 3. 출력
		for (int idx = 0; idx < matrix.length; idx++) {
			for (int ind = 0; ind < matrix[idx].length ; ind++) {
				// matrix[0].length
				// matrix[1].length ===> matrix[idx].length 
				// matrix[2].length
				System.out.printf("[%d][%d] = %d\t", idx, ind, matrix[idx][ind]);
			}
		System.out.println(); // new line(Enter key)
		}
		
		// 4. 출력 foreach
		for (int[] numbers : matrix) {
			for (int num : numbers) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
		
	} // end main

} // end class
