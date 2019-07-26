package book;

/**
 * 책 한권의 정보를 담는 클래스

 * =========================================
 * 일련번호  : sequence  : int
 * ISBN  	 : isbn		 : String
 * 제목 	 : title 	 : String
 * 저자 	 : author 	 : String
 * 출판사 	 : company 	 : String
 * 페이지 수 : totalPage : int
 * 가격 	 : price 	 : int
 * 재고수량  : quantity  : int
 * -----------------------------------------
 * 생성자 중복정의 (기본생성자 명시, 매개변수 생성자 중복정의)
 * -----------------------------------------
 * 매소드:
 * void print() : 책의 정보를 출력하는 메소드
 * void buy(int amount) : amount 만큼 책의 재고를 늘리는 메소드
 * void sell(int amount) : amount 만큼 재고를 줄이는 메소드
 * 
 * -- 각 필드를 설정하는 메소드
 * -- 자바 빈즈(Java Beans) 규격에 의한 접근자/수정자 메소드
 * -- getter/ setter
 * 
 * getter 작성시 메소드 이름 규격
 * ==> get으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 * 	   매개 변수 없음.
 * 	   리턴 타입이 해당 멤버변수 필드의 타입과 맞춤
 * 
 * 예) sequence 필드의 getter 는 다음의 규격을 갖는다.
 * int getSequence() {
 * 		return this.requence
 * }
 * 
 * setter 작성시 메소드 이름 규격
 * ==> set으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 *     매개변수는 해당 멤버변수와 같은 타입과 변수로 받는다.
 *     리턴값 없이 작성
 * void setSequence(int sequence) {
 * 		this.sequence = sequence;
 * }
 * 
 * 만약 멤버변수 필드가 boolean 타입이라면 getter의 이름은 get이 아니라 is로 시작합니다.
 * 
 * ===========================================================================
 * 1. 캡슐화 적용 : 멤버변수는 private
 * 					생성자, 메소드 public 
 * 2. 메소드 재정의 : toString
 * 					  equals() & hashCode() 재정의
 * 					  sequence 필드 기준 재정의
 * 3. 메소드 수정 : print() 메소드는 this 객체 출력코드로 변경		
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */

public class Book {
	// 멤버 변수
	/** 책의 일련번호*/
	private int sequence;
	
	/** 책의 ISBN 번호*/
	private String isbn;
	
	/** 책의 이름*/
	private String title;
	
	/** 책의 저자*/
	private String author;
	
	/** 책을 출판한 출판사*/
	private String company;
	
	/** 책의 총 페이지 수*/
	private int totalPage;
	
	/** 책의 가격*/
	private int price;
	
	/** 서점에 있는 책의 재고*/
	private int quantity;

	// 생성자
	/**
	 * Book 의 기본 생성자
	 */
	public Book() {

	}

	/**
	 * sequence 만 초기화 하는 생성자
	 * @param sequence
	 */
	public Book(int sequence) {
		this();
		setSequence(sequence);
	}

	/**
	 * sequence 와 isbn 를 초기화하는 생성자
	 * @param sequence
	 * @param isbn
	 */
	public Book(int sequence, String isbn) {
		this(sequence);
		setIsbn(isbn);
	}

	/**
	 * 일련번호 와 isbn번호, 책의 이름을 초기화하는 생성자
	 * @param sequence
	 * @param isbn
	 * @param title
	 */
	public Book(int sequence, String isbn, String title) {
		this(sequence, isbn);
		setTitle(title);
	}

	/**
	 * 일련번호 와 isbn번호, 책의 이름, 저자를 초기화하는 생성자
	 * @param sequence
	 * @param isbn
	 * @param title
	 * @param author
	 */
	public Book(int sequence, String isbn, String title, String author) {
		this(sequence, isbn, title);
		setAuthor(author);
	}

	/**
	 * 일련번호 와 isbn번호, 책의 이름, 저자, 출판사를 초기화하는 생성자
	 * @param sequence
	 * @param isbn
	 * @param title
	 * @param author
	 * @param company
	 */
	public Book(int sequence, String isbn, String title, String author, String company) {
		this(sequence, isbn, title, author);
		this.company = company;
	}

	/**
	 * 일련번호 와 isbn번호, 책의 이름, 저자, 출판사, 책의 페이지 수를 초기화하는 생성자
	 * @param sequence
	 * @param isbn
	 * @param title
	 * @param author
	 * @param company
	 * @param totalPage
	 */
	public Book(int sequence, String isbn, String title, String author, String company, int totalPage) {
		this(sequence, isbn, title, author, company);
		this.totalPage = totalPage;
	}

	/**
	 * 일련번호 와 isbn번호, 책의 이름, 저자, 출판사, 책의 페이지 수, 가격을 초기화하는 생성자
	 * @param sequence
	 * @param isbn
	 * @param title
	 * @param author
	 * @param company
	 * @param totalPage
	 * @param price
	 */
	public Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price) {
		this(sequence, isbn, title, author, company, totalPage);
		this.price = price;
	}

	/**
	 * 일련번호 와 isbn번호, 책의 이름, 저자, 출판사, 책의 페이지 수, 가격, 남은 재고를 초기화하는 생성자
	 * Book 객체의 모든 멤버변수를 초기화하는 생성자
	 * @param sequence
	 * @param isbn
	 * @param title
	 * @param author
	 * @param company
	 * @param totalPage
	 * @param price
	 * @param quantity
	 */
	public Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price, int quantity) {
		this(sequence, isbn, title, author, company, totalPage, price);
		this.quantity = quantity;
	}

	// 메소드

	// 메소드 재정의 하기
	/**
	 * toString 메소드의 재정의
	 * 책 정보 출력
	 */
	@Override
	public String toString() {
		String message = "책정보[일련번호:%s ISBN:%s 제목 :%s 저자:%s 출판사:%s 페이지:%d 가격:%d 재고:%d]%n";

		return String.format(message, sequence, isbn, title, author, company, totalPage, price, quantity);
	}
	
	/**
	 * hashCode 의 재정의
	 * sequence 필드를 기준으로 재정의
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sequence;
		return result;
	}

	/**
	 * equals() 메소드의 재정의
	 * sequence 필드를 기준으로 재정의
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (sequence != other.sequence)
			return false;
		return true;
	}

	
	// 멤버변수의 getter
	/**
	 * sequence의 접근자, getter
	 * @return sequence
	 */
	public int getSequence() {
		return sequence;
	}

	/**
	 * isbn 의 접근자, getter
	 * @return isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * title 의 접근자, getter
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * author 의 접근자, getter
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * company 의 접근자, getter
	 * @return company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * totalPage 의 접근자, getter
	 * @return totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * price 의 접근자, getter
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * quantity 의 접근자, getter
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * sequence 의 수정자, setter
	 * @param sequence
	 */
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	/**
	 * isbn 의 수정자, setter
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * title 의 수정자, setter
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * author 의 수정자, setter
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * company 의 수정자, setter
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * totalPage 의 수정자, setter
	 * @param totalPage
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * price 의 수정자, setter
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * quantity 의 수정자, setter
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 책의 정보를 출력하는 메소드
	 */
	public void print() {
		System.out.println(this);
	}

	/**
	 * amount 만큼 책의 재고를 늘리는 메소드
	 * @param amount
	 */
	void buy(int amount) {
		quantity += amount;
	}

	/**
	 * amount 만큼 재고를 줄이는 메소드
	 * 단, amount 가 재고 만큼 많을 시 실행하지 않음
	 * @param amount
	 */
	void sell(int amount) {
		if (quantity > amount) {
			quantity -= amount;
		}
	}

}
