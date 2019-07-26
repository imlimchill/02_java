package book.resp;

import book.Book;

public class SingleResp implements Response {

	/**
	 * 입력된 한건의 데이터 (Object) 가 Book 한권의 정보일 때 그것을 출력
	 */
	@Override
	public void responde(Object object) {
		Book book = (Book)object;
		System.out.println();
	}

}
