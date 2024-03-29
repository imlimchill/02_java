package type.primitive;

/**
 * byte : 1byte(8bit) 에 해당하는 범위만큼 정수를 저장하는 타입
 * ---------------------------------------------------------------------
 * 8bit = 2의 8제곱
 * 		= 256
 * 		= 256개의 숫자를 표현가능
 * 		= -128 ~ 0 ~ 127 까지 표현가능
 * ---------------------------------------------------------------------
 * 
 * @author Administrator
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		// 1. 선언
		byte buffer;
		
		// 2. 초기화
		buffer = 0;
		
		// 3. 사용 : 출력
		System.out.println("buffer = " + buffer);
		
		// 4. 값을 변경
		buffer = 127;
		System.out.println("buffer = " + buffer);
		
		buffer = -128;
		System.out.println("buffer = " + buffer);
		
		// 5. 범위를 벗어나는 값을 저장하려는 시도
		//buffer = 128;
		// Type mismatch: cannot convert from int to byte > -128 ~ 127 은 byte 라고 생각하는게 그 범위를 넘으면 byte 타입이 아니라고 인식
		// byte가 아닌 것을 byte에 넣으려고 하니까 생기는 오류
	}

}
