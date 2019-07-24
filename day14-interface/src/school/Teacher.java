package school;

/**
 * Person 을 상속받아 선생님을 정의하는 클래스
 * 
 * @author Administrator
 *
 */
public class Teacher extends Person implements Lesson, Attendance {

	// 멤버변수
	/** 담당하고 있는 과목을 나타내는 멤버변수*/
	private String subject;

	// 생성자
	// 기본 생성자
	/**
	 * 기본 생성자
	 */
	public Teacher() {

	}

	// 매개변수를 받는 중복 정의
	/**
	 * Teacher 만의 필드인 subject 를 초기화 하는 생성자
	 * @param subject
	 */
	public Teacher(String subject) {
		this.subject = subject;
	}
	
	/**
	 * 부모에게서 물려받은 필드 세 개를 부모의 생성자를 빌려 초기화하고
	 * 자신의 필드를 직접 초기화
	 * @param id
	 * @param name
	 * @param age
	 * @param subject
	 */
	public Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}
	
	// toString() 재정의
	@Override
	public String toString() {
		String tcStr = String.format(", 과목: %s", subject); 
		return String.format("교사 정보[%s%s]", super.toString(), tcStr);
	}
	
	// getter, setter
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	@Override
	public String attend() {
		// 교사[아이디] 이(가) 출근하였습니다.
		// 문자열 리턴
		return String.format("교사[%s] 이(가) 출근하였습니다.", getId());
	}

	@Override
	public String lesson() {
		// 교사[아이디] 이(가) 과목[과목명] 수업을 하고 있습니다.
		// 문자열 리턴
		return String.format("교사[%s] 이(가) 과목[%s] 수업을 하고 있습니다.", getId(), subject);
	}
	
}
