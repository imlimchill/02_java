package school;

/** 
 * 학교 사스템에서 학생의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * @author Administrator
 *
 */
public class Student extends Person {
	
	// 1. 멤버 변수 선언
	/** 학생의 전공을 저장하는 멤버변수*/
	private String major;
	
	// 생성자 선언
	// (1) 기본 생성자
	public Student() {

	}
	
	// (2) 매개변수받는 생성자
	/**
	 * Student 만의 major를 초기화하는 생성자
	 * @param major
	 */
	public Student(String major) {
		this.major = major;
	}
	
	/**
	 * Person 클래스의 생성자를 받아와 세 개의 필드와
	 * 학생만의 필자인 메이저를 모두 초기화하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 * @param major
	 */
	public Student(String id, String name, int age, String major) {
		super(id, name, age);
//		this(major);   
		// super(), this() 는 생성자 선언에 첫줄에 한번만 사용가능
		// 두개를 동시에 사용할 수 는 없음
		this.major = major;
	}
	
	
	// 메소드 선언
	// toString() 의 재정의 : 학생에 맞도록
	@Override
	public String toString() {
		String stdStr = String.format(", 전공:%s", major);
//		return "학생정보[" + super.toString() + stdStr + "]";
		return String.format("학생정보[%s%s]", super.toString(), stdStr);
	}
	
	// 접근자, 수정자
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
} // end class
