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
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class Book {
	// 멤버 변수
	int sequence;
	String isbn;
	String title;
	String author;
	String company;
	int totalPage;
	int price;
	int quantity;
	
	// 생성자
	Book() {
		
	}
	
	Book(int sequence) {
		this();
		setSequence(sequence);
	}
	
	Book(int sequence, String isbn) {
		this(sequence);
		setIsbn(isbn);
	}
	
	Book(int sequence, String isbn, String title) {
		this(sequence, isbn);
		setTitle(title);
	}
	
	Book(int sequence, String isbn, String title, String author) {
		this(sequence, isbn, title);
		setAuthor(author);
	}
	
	Book(int sequence, String isbn, String title, String author, String company) {
		this(sequence, isbn, title, author);
		this.company = company;
	}
	
	Book(int sequence, String isbn, String title, String author, String company, int totalPage) {
		this(sequence, isbn, title, author, company);
		this.totalPage = totalPage;
	}
	
	Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price) {
		this(sequence, isbn, title, author, company, totalPage);
		this.price = price;
	}
	
	Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price, int quantity) {
		this(sequence, isbn, title, author, company, totalPage, price);
		this.quantity = quantity;
	}
	
	
	// 메소드
	
	// 멤버변수의 getter
	public int getSequence() {
		return sequence;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// 멤버변수의 setter
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// void print() : 책의 정보를 출력하는 메소드
	public void print() {
		System.out.printf("일련번호 %d 책의 상태%n", sequence);
		System.out.printf("ISBN : %s %n", isbn);
		System.out.printf("제목 : %s %n", title);
		System.out.printf("저자 : %s %n", author);
		System.out.printf("출판사 : %s %n", company);
		System.out.printf("페이지 수 : %d %n", totalPage);
		System.out.printf("가격 : %d %n", price);
		System.out.printf("재고수량 : %d %n%n", quantity);
	}
	
	// 강사님의 정보출력 메소드
	public void print2() {
		String message = "책정보[일련번호:%s ISBN:%s 제목 :%s 저자:%s 출판사:%s 페이지:%d 가격:%d 재고:%d]%n";
		
		System.out.printf(message, sequence, isbn, title, author, company, totalPage, price, quantity);
				
	}
	
	// void buy(int amount) : amount 만큼 책의 재고를 늘리는 메소드
	void buy(int amount) {
		quantity += amount;
	}
	
	// void sell(int amount) : amount 만큼 재고를 줄이는 메소드
	void sell(int amount) {
		quantity -= amount;
	}
	
}
