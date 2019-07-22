package school;

/**
 * Person 을 상속받아 선생님을 정의하는 클래스
 * 
 * @author Administrator
 *
 */
public class Teacher extends Person {

	// 멤버변수
	private String subject;

	// 생성자
	// 기본 생성자
	public Teacher() {

	}

	public Teacher(String subject) {
		this.subject = subject;
	}
	
	// toString() 재정의
	@Override
	public String toString() {
		return subject + super.toString();
	}
	
	// getter, setter
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
}
