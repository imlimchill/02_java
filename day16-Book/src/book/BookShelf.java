package book;

import java.util.Arrays;

/**
 * Book 여러 개가 꼽혀있는 책 객체 여러개를 한번에 저장하고 관리할 수 있는 클래스
 * 
 * 1. 캡슐화 적용 : 멤버변수는 private
 * 					생성자, 메소드 public 
 * 
 * 
 * @author Administrator
 *
 */
public class BookShelf {
	
	// 멤버변수 
	private Book[] books;
	
	// 생성자
	public BookShelf() {
		books = new Book[0];
	}

	public BookShelf(Book[] books) {
		this.books = books;
	}
	
	/**
	 * 책장에 책을 추가 : add : void : 매개변수로 BOOK 1개 받는다.
	 * 같은 책이 이미 있으면 추가를 하지 않고 새 책이 들어왔을 경우에만 책을 추가
	 *
	 * 1. 리턴을 int 타입으로 추가 성공한 건수를 리턴
	 * 
	 * 2. 매개변수로 입력된 book 객체가 이미 목록에 존재하는지 여부를 isExists(book) 메소드를 사용하여 판단하고
	 * 그 결과가 false 일때만 현재의 추가로직이 작동하도록 변경
	 * 
	 * @param book
	 * @return 0 : 이미 같은 seq 번호의 책이 있어서 추가 실패
	 * 		   1 : 새 책 정보 1건이 성공적으로 추가된 경우
	 */
	public int add(Book book) {
		// 리턴할 값이 저장되는 변수 선언
		int count = 0; 
		
		if (!isExists(book)) {
			Book[] newBooks = new Book[books.length + 1];
			for (int idx = 0; idx < books.length; idx++) {
				newBooks[idx] = books[idx];
			}
			newBooks[newBooks.length - 1] = book;
			this.books = newBooks;
			
			// 만약에 들어온 값이 배열일 경우에도 쓸 수 있도록 ++로 해두는게 좋다
			count++;
			
		} 
		
		return count;
	}
	
	// 강사님 버전
	public int add2(Book book) {
		// 1. 리턴할 값이 저장변수 선언, 초기화
		int addCount = 0; 
		
		// 3. 로직 전개
		if (!isExists(book)) {
			// 이미 존재하는 배열 + 1크기로 복사
			// 배열 복사해주는 API
			this.books = Arrays.copyOf(books, books.length + 1);
			
			// 1 늘어난 배열 마지막 자리에 새 book (매개변수로 넘어온거) 저장
			this.books[books.length -1 ] = book;
			
			// 만약에 들어온 값이 배열일 경우에도 쓸 수 있도록 ++로 해두는게 좋다
			addCount++;
			
		} 
		
		// 2. 리턴 값 저장 볌수 리턴 구문
		return addCount;
	}
	
	
	
	
	
	/**
	 * 책장에서 책을 제거 : void remove(Book book)
	 * 입력된 book 객체의 sequence 가 같으면 같은 책으로 판단, 삭제 
	 * 
	 * 삭제하기 전에 목록에 book 객체가 존재하는지 먼저 isExists(book) 으로 판단
	 * 
	 * 결과가 참일때만 삭제로직 진행  1 리턴
	 * 결과가 거직이면 삭제로직 진행 안함 0 리턴
	 * @param book
	 * @return 0 or 1
	 */
	public int remove(Book book) {
		Book[] newBooks = null;
		
		// 리턴할 값을 저장할 변수 선언
		int result = 0;
		
		int index = findBookIndex(book);
		
		// isExists(book) 가 참일때 삭제로직 진행 후 1 리턴
		if (isExists(book)) {
			newBooks = new Book[books.length - 1];
			
			if (index < books.length - 1) {
				for (int idx = 0; idx < newBooks.length; idx++) {
					newBooks[idx] = books[idx];
				}
			} else {
				for (int idx = 0; idx < index; idx++) {
					newBooks[idx] = books[idx];
				}
				for (int idx = index; idx < newBooks.length; idx++) {
					newBooks[idx] = books[idx + 1];
				}
			}
			this.books = newBooks;
			// 리턴할 값 저장
			result++;
		} 
		
		return result;
	}
	
	
	/**
	 * 책 정보 수정 : void : set(Book book)
	 * 입력된 book 와 같은 시퀸스가 존재하면 입력된 book로 바뀌는(수정) 메소드
	 * 
	 * 수정하기 전에 수정할 book 객체가 목록에 이미 존재하는지 여부를 isExists(book) 수행결과로 판단
	 * 
	 * 참이면 수정 1 리턴
	 * 거짓이면 수정안하고 0 리턴
	 * @param book
	 * @return 0 or 1
	 */
	public int set(Book book) {
		// 수정 결과를 리턴할 변수 선언
		int result = 0;
		
		if (isExists(book)) {
			// 수정할 book 이 books 배열 몇번째 인덱스에 있는지 찾는 메소드 호출
			int index = findBookIndex(book);

			if (index > -1) {
				books[index] = book;
			}
			result++;
		}
		
		return result;
	}
	
	
	/**
	 * 전체 책 목록을 얻기 : getAllBooks()
	 * @return books의 배열 전체 리턴
	 */
	public Book[] getAllBooks() {
		return this.books;
	}
	
	
	/**
	 * 입력된 book 과 같은 책 한권을 꺼내는 메소드
	 * 
	 * @param book
	 * @return 입력된 book 와 같은 seq 가 같은 Book 객체를 찾아서 리턴
	 */
	public Book get(Book book) {
		// 입력된 book의 sequence 값과 배열에 저장된 책들 중 
		// 일치하는 sequence 를 가진 책 1권의 정보 리턴
		return findBook(book);
	}
	
	
	
	
	
	/**
	 * Book[] 타입의 books 의 접근자, getter
	 * @return books
	 */
	public Book[] getBooks() {
		return books;
	}
	
	/**
	 * Book[] 타입의 books 의 수정자, setter
	 * @param books
	 */
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	// --------------------------------------------------------------------------------------------
	
	/**
	 * 매개변수 전달된 책 정보와 일치하는 일련번호를 가진 책(책 배열 books에 있는) 을
	 * 찾아서 배열안에 있는 책을 리턴
	 * 
	 * return 을 중간에서 하는건 자바스크립트나 씨에서 하는 방식이고 자바에서는 아래에 하자
	 * 
	 * 같은 책을 찾는 로직을 Sequence 값 직접 비교에서 book 객체 비교로 변경
	 * @param book
	 * @return 입력된 book 와 같은 seq 를 가진 Book 객체를 리턴
	 */
	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].equals(book)) {
				// 같은 책 찾음
				findBook = books[idx];
				break;
				
			}
		}
		return findBook;
	}
	
	/**
	 * 찾으려고 하는 책의 인덱스 (책 자체가 아니라 책의 위치)
	 * @param book
	 * @return 입력된 book 와 같은 seq 를 가진 Book 객체의 인덱스를 리턴
	 */
	private int findBookIndex(Book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].equals(book)) {
				// 같은 책 찾음
				index = idx;
				break;
				
			}
		}
		return index;
	}
	
	/**
	 * 매개변수로 전달된 book(책) 이 목록(배열) 에 존재하는지 여부를 검색해ㅛㅓ
	 * 존재하면 true / 존재하지 않으면 false 를 리턴하는 private 메소드
	 * 
	 * @param book
	 * @return true  : 찾는 책이 목록에 존재할 때
	 * 		   false : 책는 책이 목록에 존재하지 않을 때
	 */
	private boolean isExists(Book book) {
		// 리턴 값이 있는 메소드의 경우
		// 리턴 값을 저장할 변수를 선언, 초기화
		// exists = 강사님이 선언한 변수이름
		boolean isResult = false;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].equals(book)) {
				// 같은 책을 찾으면 true 를 저장
				isResult = true;
				break;
			}
		}
		
		// 강사님 버전 foreach
//		for (Book findBook : books) {
//			if(findBook.equals(book)) {
//				// 메소드 로직 중간에서는 리턴 값을 저장하는 변수의 값을 결정만 진행
//				isResult = true;
//				break;
//			}
//		}
		
		/// 리턴 구문은 메소드 종료 직전 1번만 하는 습관이 필요
		return isResult;
	}
	
}
