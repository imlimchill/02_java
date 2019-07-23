package school;

/**
 * Person 을 상속받은 직원을 정의하는 클래스
 * @author Administrator
 *
 */
public class Employee extends Person {

	// 멤버변수
	private String dept;
	
	//기본 생성자
	Employee() {
		super();
	}
	
	// 매개변수 생성자
	Employee(String dept) {
		this.dept = dept;
	}
	
	// 메소드 재정의
	@Override
	public String toString() {
		return dept + super.toString();
	}
	
	// 접근자, 수정자
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
}
