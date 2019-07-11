package array.init;

/**
 * 참조현 타입인 String 타입의 배열 students 를 초기화 목록을 사용하여 초기화하고
 * 내용을 출력해조는 테스트 클래스
 * @author Administrator
 *
 */
public class StringArrayInitList {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		String[] students = {"정하은", "최현정", "김지후", "정현수"};
		
		// 3. 출력 foreach
		for (String name : students) {
			System.out.println("학생의 이름 = " + name);
		}
		System.out.println();
		
		// 4. 출력 for
		for (int idx = 0; idx < students.length; idx++) {
			System.out.printf("student[%d] = %s%n", idx, students[idx]);
		}
		
	} // end main

} //end class
