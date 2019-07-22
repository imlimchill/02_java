package snack;

/**
 * 오레오 크기가 여러개 들어가있는 박스 클래스
 * 
 * @author Administrator
 *
 */
public class OreoBox {
	
	// TODO Oreo 를 여러개 저장할 수 있는 Oreo[] oreos를 멤버변수로 갖돌고 선언
	Oreo[] oreos;
	// TODO 생성자 기본, 중복정의
	OreoBox() {
		oreos = new Oreo[0];
	}
	
	OreoBox(Oreo[] oreos) {
		this.oreos = oreos;
	}
	// TODO 오레오 박스에 오레오 1개씩 추가, 삭제, 수정, 꺼내(확인)
	
	/**
	 * 오레오 배열에 새로운 오레오를 추가하는 메소드
	 * @param oreo
	 */
	public void add(Oreo oreo) {
		// 새로운 배열 (박스) 선언
		Oreo[] newOreos = new Oreo[oreos.length + 1];
		
		for (int idx = 0; idx < oreos.length; idx++) {
			newOreos[idx] = oreos[idx];
		}
		newOreos[oreos.length] = oreo;
		
		this.oreos = newOreos;
	}
	
	/**
	 * 배열에서 오레오를 삭제할 때 쓰는 메소드
	 * @param oreo
	 */
	public void remove(Oreo oreo) {
		// 삭제할 오레오가 있는지 확인
		int index = findOreoIndex(oreo);
		Oreo[] newOreos;
		
		if (index > -1) {
			// 새롭게 오레오 저장할 -1 배열 선언
			newOreos = new Oreo[oreos.length - 1];
			if (index == oreos.length - 1) {
				// 삭제해야 할 오레오의 위치가 마지막 인덱스인경우
				for (int idx = 0; idx < newOreos.length; idx++) {
					newOreos[idx] = oreos[idx];
				}
			} else {
				// 삭제해야 할 오레오의 위치가 중간인 경우
				for (int idx = 0; idx < index; idx++) {
					newOreos[idx] = oreos[idx];
				}
				for (int idx = index; idx < newOreos.length; idx++) {
					newOreos[idx] = oreos[idx + 1];
				}
			}
			this.oreos = newOreos;
		}
	}
	
	/**
	 * 오레오의 배열 중 하나만 리턴 받는 메소드
	 * @param oreo
	 * @return
	 */
	public Oreo get(Oreo oreo) {
		return findOreo(oreo);
	}
	
	/**
	 * 오레오의 모든 배열을 리턴 받는 메소드
	 * @return
	 */
	public Oreo[] getAllOreos() {
		return this.oreos;
	}
	
	/**
	 * 오레오의 정보를 수정하기 위한 메소드
	 * @param oreo
	 */
	public void set(Oreo oreo) {
		int index = findOreoIndex(oreo);
		
		if (index > -1) {
			this.oreos[index] = oreo;
		}
	}
	
	/**
	 * 입력되어진 오레오와 같은 seq를 가진 오레오를 찾아 리턴 시키는 메소드
	 * @param oreo
	 * @return
	 */
	public Oreo findOreo(Oreo oreo) {
		Oreo findOreo = null;
		
		for (int idx = 0; idx < oreos.length; idx++) {
			if (oreos[idx].seq == oreo.seq) {
				findOreo = oreos[idx];
				break;
			}
		}
		return findOreo;
	}


	/**
	 * 입력되어진 오레오와 같은 seq를 가진 오레오를 찾아 그 배열의 인덱스를 리턴 시키는 메소드
	 * @param oreo
	 * @return
	 */
	public int findOreoIndex(Oreo oreo) {
		int index = -1;
		
		for (int idx = 0; idx < oreos.length; idx++) {
			if (oreos[idx].seq == oreo.seq) {
				index = idx;
				break;
			}
		}
		return index; 
	}
} // end class
