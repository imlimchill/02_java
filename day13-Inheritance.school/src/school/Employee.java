package school;

/**
 * Person 을 상속받은 직원을 정의하는 클래스
 * 
 * 학교 시스템에서 교직원의 정보를 저장하는 클래스
 * 
 * dept : String : 소속부서 이름
 * @author Administrator
 *
 */
public class Employee extends Person {

	// 멤버변수
	/** 직원의 소속 부서를 나타내는 멤버 변수*/
	private String dept;
	
	//기본 생성자
	/**
	 * 기본 생성자
	 */
	Employee() {
		
	}
	
	// 매개변수 생성자
	/**
	 * 직원의 dept 필드를 초기화하는 생성자
	 * @param dept : String : 소속 부서명
	 */
	Employee(String dept) {
		this.dept = dept;
	}
	
	/**
	 * Person에서 물려받은 세 가지 필드를 부모 생성자로 초기화한 후
	 * Employee 의 dept 를 직접 초기화한다.
	 * @param id
	 * @param name
	 * @param age
	 * @param dept
	 */
	public Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
	}
	
	// 메소드 재정의
	@Override
	public String toString() {
		String stdEmp = String.format(", 부서: %s", dept);
		return String.format("직원정보[%s%s]", super.toString(), stdEmp);
	}
	
	// 접근자, 수정자
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
}
