package api.system;

import static java.lang.System.currentTimeMillis;

public class SystemTest {

	public static void main(String[] args) {
		
		// 변수 선언
		long start;
		long end;
		
		start =System.currentTimeMillis();
		
		System.out.println("반복 시작 전:" + start);
		for (int i = 0; i < 1000000; i++) {
			;
		}
		
		end = currentTimeMillis();
		System.out.println("반복 시작 후:" + end);
		System.out.println("반복 소요 시작:" + (end - start));
		

	}

}
