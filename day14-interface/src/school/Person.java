package school;

/**
 * 사람을 정의하는 클래스
 * 
 * 시스템에 저장될 학생, 선생, 직원의 정보 중 공통적인 내용을 추출한 상위클래스
 * 일반적인 사람의 정보를 추출한다.
 * @author Administrator
 *
 */
public abstract class Person {
	
	/** 사람이 가지고 있는 자신만의 id*/
	private String id;
	
	/** 사람의 나이를 나타내는 필드*/
	private String name;
	
	/** 사람의 나이를 나타내는 필드*/
	private int age;
	
	// 생성자 모두 public
	// 기본생성자 : 생성자 선언부를 완전히 생략하면 ㅂ자동으로 기본생성자 선언이 들어가짐
	// 				그러나 기본생성자가 아닌 생성자가 하나라도 선언되면 자공생성되지 않음
	public Person() {
		
	}
	
	// 매개 변수 생성자 : 매개변수를 받는 생성자가 선언된 상태에서 기본생성자 선언을 누락하는 경우
	// 					  기본 생성자는 자동으로 만들어지지 않음 주의
	
	/**
	 * id 필드만 초기화하는 생성자
	 * @param id
	 */
	public Person(String id) {
		this();
		this.id = id;
	}
	
	/**
	 * id, name 을 초기화하는 생성자
	 * @param id
	 * @param name
	 */
	public Person(String id, String name) {
		this(id);
		this.name = name;
	}
	
	/**
	 * 전체 필드를 초기화하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 */
	public Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}
	
	// 메소드
	//toString() 의 재정의
	/**
	 * toString() 메소드의 특별함
	 * ----------------------------------------------------------------------------
	 * 1. print 계열의 메소드레서 객체참조변수를 출력할 때 자동으로 작동하는 메소드
	 * 2. Object 클래스에서 상속받은 메소드
	 * 3. 객체를 대표하는 문자열을 만들어서 리턴
	 *    => 각 필드를 모두 출력할 수 있는 문자열
	 */
	@Override
	public String toString() {
//		return "아이디:" + id + "이름:" + name + "나이:" + age;     // => 이런 방법도 있다.
		return String.format("id : %s, 이름 : %s, 나이 : %d", id, name, age);    // => 이 방법을 익히자 (여기저기 쓰임)
	}
	
	// (2) print()
	/**
	 * 현재의 객체를 출력하는 메소드
	 */
	public void print() {
		System.out.println(this);
	}
	
	// getter, setter / 접근자, 수정자
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * id 필드 접근자
	 * @return
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * name 필드 접근자
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * age 필드 접근자
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
} // end class
