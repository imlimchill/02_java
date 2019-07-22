package school;

/**
 * 사람을 정의하는 클래스
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
	// 기본생성자
	public Person() {
		
	}
	
	// 매개 변수 생성자
	public Person(String id) {
		this();
		this.id = id;
	}
	
	public Person(String id, String name) {
		this(id);
		this.name = name;
	}
	
	public Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}
	
	// 메소드
	public String toString() {
		return String.format("id : %s, 이름 : %s, 나이 : %d", id, name, age);
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
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
} // end class
