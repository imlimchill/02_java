package book;

/**
 * Book 여러 개가 꼽혀있는 책 객체 여러개를 한번에 저장하고 관리할 수 있는 클래스
 * 
 * 
 * @author Administrator
 *
 */
public class BookShelf {
	
	// 멤버변수 
	Book[] books;
	
	// 생성자
	BookShelf() {
		books = new Book[0];
	}

	BookShelf(Book[] books) {
		this.books = books;
	}
	
	// 책장에 책을 추가 : add : void : 매개변수로 BOOK 1개 받는다.
	public void add(Book book) {
		// 현재 books 보다 길이가 1큰 배열을 새로 만든다.
		Book[] newBooks = new Book[books.length + 1];
				 
		// books 의 모든 책 내용을 새로 생성한 1칸 큰 배열에 앞쪽부터 복사
		for (int idx = 0; idx < books.length; idx++) {
			newBooks[idx] = books[idx];
		}
		
		// 매개변수로 넘겨짐 book 은 마지막 새로 생긴 칸에 저장
		newBooks[newBooks.length - 1] = book;
		
		// 이 클래스의 books 매개 변수에 새로 만든 newBooks 저장
		this.books = newBooks;
	}
	
	// 책장에서 책을 제거 : void remove(Book book)
	// book 객체의 sequence 가 같으면 같은 책으로 판단, 삭제
	public void remove(Book book) {
		// 폐기 안하고 남는 책을 유지할 새 배열 
		Book[] newBooks = null;
		
		// 1. 폐기할 책이 위치하는 인덱스 찾기
		int index = findBookIndex(book);
		
		// 2. 폐기 할 책의 인덱스가 -1 보다 크면 폐기할 책 있다는 의미로 삭제로직 진입
		if (index > -1) {
			// 3. 폐기안할 책을 유지할 채 배열을 지금 배열 -1 크기로 생성
			newBooks = new Book[books.length - 1];
			
			// 5. 폐기할 인덱스가 배열 끝일 때 폐기할 인덱스 앞쪽까지만 새 배열 복사
			if (index == books.length) {
				for (int idx = 0; idx < newBooks.length; idx++) {
					newBooks[idx] = books[idx];
				}
			} else {
				// 4. 폐기할 인덱스가 배열 중간일 때 삭제
				// (1) 삭제할 책 앞쪽의 책 정보는 같은 인덱스로 복사
				for (int idx = 0; idx < index - 1; idx++) {
					newBooks[idx] = books[idx];
				}
				// (2) 삭제할 책 뒤쪽의 남는 책 정보는 현재인덱스 -1 으로 복사하기
				for (int idx = index +1; idx < newBooks.length; idx++) {
					newBooks[idx] = books[idx];
				}
			}
		}
		
		
		// 6. 남는 책이 복사된 새배열을 this.books 에 저장
		this.books = newBooks;
		
	}
	
	
	// 책 정보 수정 : void : set(Book book)
	public void set(Book book) {
		// 수정할 book 이 books 배열 몇번째 인덱스에 있는지 찾는 메소드 호출
		int index = findBookIndex(book);
		
		if (index > -1) {
			books[index] = book;
		}
	}
	
	
	// 전체 책 목록을 얻기 
	
	// 찾아서 책 리턴
	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾음
				findBook = books[idx];
				break;
				
			}
		}
		return findBook;
	}
	
	// 찾아서 책의 인덱스 리턴
	private int findBookIndex(Book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾음
				index = idx;
				break;
				
			}
		}
		return index;
	}
	
	// 책 한 권 꺼내기 : Book : get(Book book)
	public Book get(Book book) {
		// 입력된 book의 sequence 값과 배열에 저장된 책들 중 
		// 일치하는 sequence 를 가진 책 1권의 정보 리턴
		return findBook(book);
	}
	
	
	
	
	
	// 접근자
	public Book[] getBooks() {
		return books;
	}
	
	// 수정자
	public void setBooks(Book[] books) {
		this.books = books;
	}
}
