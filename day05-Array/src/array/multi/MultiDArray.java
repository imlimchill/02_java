package array.multi;

public class MultiDArray {

	public static void main(String[] args) {
		// 선언
		char[][] stars;
		
		// 초기화
		stars = new char[6][];
		
		// 별 입력
		for (int idx = 0; idx < stars.length; idx++) {
			stars[idx] = new char[idx + 1];
			for (int ind = 0; ind < stars[idx].length; ind++) {
				stars[idx][ind] = '☆';
			}
		}
		
		// 별 출력
		for (int idx = 0; idx < stars.length; idx++) {
			for (int ind = 0; ind < stars[idx].length; ind++) {
				System.out.printf("%c\t", stars[idx][ind]);
			}
			System.out.println();
		}
		
		
//		for (char[] star: stars) {
//			for(char st: star) {
//				System.out.println(st);
//			}
//		}
		
	} // end main

} // end class
