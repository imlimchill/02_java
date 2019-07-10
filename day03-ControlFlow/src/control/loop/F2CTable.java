package control.loop;

/**
 * 화씨 온도에서 섭씨 온도로 변환하는 클래스
 * 
 * @author Administrator
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		double fah;
		double cel;
		
		for (int idx = 0; idx <= 10; idx++) {
			fah = idx * 10;
			cel = (5 / 9.0) * (fah - 32);
			// 5 / 9는 나누면 정수가 되니까 하나를 double 로 바꿔서 계산해야 함
			System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}
	} //end main

}
