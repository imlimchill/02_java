package book.resp;

public class MessageResp implements Response {

	/**
	 * 데이터를 입력, 수정, 삭제 들의 작업 후 성공 여부에 대한 메시지가 발생했을 때 그 메시지를 출력
	 */
	@Override
	public void responde(Object object) {
		
		String message = (String)object;
		System.out.println(message);
	}

}