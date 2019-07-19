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
	
	public void add(Oreo oreo) {
		// 새로운 배열 (박스) 선언
		Oreo[] newOreos = new Oreo[oreos.length + 1];
		
		for (int idx = 0; idx < oreos.length; idx++) {
			newOreos[idx] = oreos[idx];
		}
		newOreos[oreos.length] = oreo;
		
		this.oreos = newOreos;
	}
	
	public void remove(Oreo oreo) {
		// 삭제할 오레오가 있는지 확인
		int index = findOreoIndex(oreo);
		Oreo[] newOreos;
		
		if (index > -1) {
			// 새롭게 오레오 저장할 -1 배열 선언
			newOreos = new Oreo[oreos.length - 1];
			if (index == oreos.length - 1) {
				// 마지막 인덱스인경우
				for (int idx = 0; idx < newOreos.length; idx++) {
					newOreos[idx] = oreos[idx];
				}
			} else {
				// 중간인 경우
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
	
	public Oreo get(Oreo oreo) {
		return findOreo(oreo);
	}
	
	public Oreo[] getAllOreos() {
		return this.oreos;
	}
	
	public void set(Oreo oreo) {
		int index = findOreoIndex(oreo);
		
		if (index > -1) {
			this.oreos[index] = oreo;
		}
	}
	
	// 오레오 찾기
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
	// 오레오의 인덱스 찾기
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
