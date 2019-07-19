package book;

/**
 * 책을 판매하는 서점을 정의하는 클래스
 * 서점에서 도서 판매를 위해서 최소 한 명의 매니저는 있어야 한다.
 * 
 * @author Administrator
 *
 */
public class BookStore {
	
	// 1. 멤버변수 : 북 매니저
	BookManager manager;
	
	// 2. 생성자
	// (1) 기본
	BookStore() {
		manager = new BookManager();
	}
	
	// (2) 매개변수
	BookStore(BookManager manager) {
		this.manager = manager;
	}//휠씬 더 객체지향적
	
	// 3. 메소드 생성부
	// (1) 서점에 신간이 들어왔을 때 매니저에게 신간정리(책장에 꼽는 것 들을 부탁)
	public void add(Book book) {
		manager.add(book);
	}
	
	// (2) 서점에 폐기할 도서가 생겼을 때 매니저에게 폐기부탁
	public void remove(Book book) {
		manager.remove(book);
	}
	
	// (3) 서점에서 판매도서의 가격 등 변동이 있을 때 매너저에게 가격 태그 등 책 정보 수정 부탁
	public void set(Book book) {
		manager.set(book);
	}
	
	// (4) 서점에 온 고객이 책을 찾을 때 매내저에게 찾아달라고 부탁
	public Book get(Book book) {
		return manager.get(book);
	}
	
	// (5) 우리 서점에서 판매하는 모든 책의 목록을 매니저에게 조회해달라고 부탁
	public Book[] getAllBooks() {
		return manager.getAllBooks();
	}
	
}
