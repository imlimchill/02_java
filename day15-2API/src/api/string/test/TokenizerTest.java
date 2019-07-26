package api.string.test;

import java.util.StringTokenizer;

/**
 * StringTokenizer 클래스를 테스트
 * 
 * StringTokenizer 는 java.util 페키지에 있으므로 
 * java.lang 에 있는 다른 클래스처럼 기본으로 사용할 수 없고 
 * 반드시 명시적으로 import 구문이 들어가야 사용가능
 * @author Administrator
 *
 */
public class TokenizerTest {

	public static void main(String[] args) {
		
		// 1. 선언
		StringTokenizer token;
		
		// 2. 초기화
		token = new StringTokenizer("안녕하세요, 자바! 재미있게 배워볼까요?");
				
		// 3. StringTokenizer 메소드 테스트
		// (1) hasMoreTokens(), nextToken()
		// 사실 while 루프에 쓰는게 더 까끔함 / 이건 쓰지말고 알려주기만!
		for (; token.hasMoreTokens();) {
			System.out.println(token.nextToken());
		}
		
		// 위의 조건식만 사용한 for 반복과 같은 구문
//		while (token.hasMoreTokens()) {
//			System.out.println(token.nextToken());
//		}
		
		token = new StringTokenizer("안녕하세요, 자바! 재미있게 배워볼까요?", "!");
		
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
	} // end main

} // end class
