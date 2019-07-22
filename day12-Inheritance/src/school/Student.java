package school;

/**
 * Person 을 상속받아 학생을 정의하는 클래스
 * @author Administrator
 *
 */
public class Student extends Person {
	
	// 멤버 변수 선언
	private String major;
	
	// 생성자 선언
	// 기본 생성자
	public Student() {
		
	}
	
	// 매개변수
	public Student(String major) {
		this.major = major;
	}
	
	
	// 메소드 선언
	// toString() 의 재정의
	@Override
	public String toString() {
		return major + super.toString();
	}
	
	// 접근자, 수정자
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
} // end class
