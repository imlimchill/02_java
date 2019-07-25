package api.object.product;

/**
 * 전자제품 매장에서 관리하는 대상인 "제품"을 정의하는 클래스
 * -----------------------------------------------------------------------------
 * 멤버변수 (private, .. 붙이지 말기)
 * 제품번호 : pcode    : String : <== "P001"
 * 제품명	: pname    : String : <== "삼성 지펠.. 상세하게"
 * 가격		: price	   : int 	 : 진짜 그 제품 가격
 * 재고수량	: quantity : int
 * --------------------------------------------------------------------------------
 * 기본생성자, 매개변수 생성자(필드 1개씩 늘려가며) , this, this() 사용
 * (public 선언)
 * -------------------------------------------------------------------------------
 * 메소드 (public 선언)
 * print() : void
 * 	==> 제품의 상태출력
 * 
 * toString() : String 
 *  ==> 이 제품을 대표하는 문자열 리턴 / String.format() 사용
 *  
 *  discount(double percentage) : int
 *   ==> 입력된 퍼센트만큼 할인된 가격을 리턴
 *   
 *  sell(int amount) : void
 *   ==> 매장에서 판매(출고)되어 재고수량이 amount 만큼 줄어들도록 반영
 *   ==> 재고수량이 0보다 작아질 수 없음
 *   ==> 판매하려는 수량은 재고보다 클 수 없도록 처리
 *   
 *  buy(int amount) : void 
 *   ==> 매장에 입고되어 재고수량이 amount 만큼 늘어나도록 반영
 * =================================================================================
 * 작성시 주의할 것
 * 각 필드를 선언할 때, 필드에 대한 설명을 문서주석으로 달 것
 * 각 생성자를 선언할 때, 문서주석으로 달 것
 * 각 메소드를 선언할 때, 메소드에 대한 설명을 문서주석으로 달 것  
 * 
 * @author Administrator
 *
 */
public class Product {
	// 1. 멤버변수
	/** 제품의 제품번호*/
	private String pcode;
	
	/** 제품의 이름*/
	private String pname;
	
	/** 제품의 가격*/
	private int price;
	
	/** 제품의 재고수량*/
	private int quantity;
	
	// 2. 생성자
	// (1) 기본생성자
	/**
	 * 기본 생성자
	 */
	public Product() {
		
	}
	
	// (2) 매개변수가 있는 생성자
	/**
	 * 제품의 제품번호만 초기화된 생성자
	 * @param pcode
	 */
	public Product(String pcode) {
		this();
		this.pcode = pcode;
	}
	
	/**
	 * 제품번호와 제품의 이름이 초기화된 생성자
	 * @param pcode
	 * @param pname
	 */
	public Product(String pcode, String pname) {
		this(pcode);
		this.pname = pname;
	}
	
	/**
	 * 제품번호, 제품명, 제품의 가격이 초기화된 생성자
	 * @param pcode
	 * @param pname
	 * @param price
	 */
	public Product(String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;
	}
	
	/**
	 * 제품번호, 제품명, 제품가격, 재고수량이 초기화된 생성자
	 * 모든 멤버변수가 초기화된 생성자
	 * @param pcode
	 * @param pname
	 * @param price
	 * @param quantity
	 */
	public Product(String pcode, String pname, int price, int quantity) {
		this(pcode, pname, price);
		this.quantity = quantity;
	}
	
	
	// 3. 메소드 선언부
	
	/**
	 * Product 의 멤버변수 정보 출력
	 */
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * Object 의 메소드 toString() 의 재정의
	 */
	public String toString() {
		return String.format("제품번호:%s, 제품명:%s, 가격:%d, 수량:%d", pcode, pname, price, quantity);
	}
	
	// alt + shift + s
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcode == null) ? 0 : pcode.hashCode());
		return result;
	}

	/**
	 * 들어온 객체의 pcode와 this의 pcode를 비교하여
	 * 같이 pcode 를 찾으면 true 반환
	 * 찾지 못하면 false를 반환 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pcode == null) {
			if (other.pcode != null)
				return false;
		} else if (!pcode.equals(other.pcode))
			return false;
		return true;
	}
	
	
	
	
//	// equals() : 객체 내용비교 메소드 작성
//	// => pcode 가 같으면 동일 객체로 판단
//	@Override
//	public boolean equals(Object object) {
//		// 1. 동일비교 연산 결과 저장할 변수 선언
//		// 2. 기본 false 로 초기화
//		boolean isEqual = false;
//		
//		// 3. 사용 : 동일한 객체인지 판단
//		// (1) 매개변수로 넘겨진 object 가 Product 타입인지 검사
//		if (object instanceof Product) {
//			// (2) 비교대상인 this 객체와 매개변수의 object 의 pcode 필드 값을 비교
//			Product product = (Product)object; // 비교를 위해 강제 형변환
//			
//			if (this.pcode.equals(product.pcode)) {
//				isEqual = true;
//			}
//		}
//		return isEqual;
//	} // end equals method
//	
//	@Override
//	public int hashCode() {
//		/*----------------------------------------------------------------------------------
//		 * hash 알고리즘 : 입력이 동일하면 출력도 동일함을 보장하는 수학 알고리즘
//		 * ==> 출력이 다르면 입력이 다르다는 결론을 보장한다.
//		 * ---------------------------------------------------------------------------------
//		 * 1. 비교하여는 필드가 찹조형이면 그 클래스가 재정의해둔 hashcode() 를 호출해서 비교
//		 * 2. 비교하여는 필드가 기본형이면 기본형 데이터를 참조형으로 변경하는 포장클래스 객체로 
//		 *    변환후에 hashcode() 를 적용
//		 *    
//		 * 3. 비교하여는 필드가 1개 이상이면 1, 2 를 각 필드의 타입에 맞추어 적용하고 모든 필드의 결과를 XOR(^)
//		 *    연산을 통과시켜 그 결과를 리턴한다.\
//		 * ---------------------------------------------------------------------------------
//		 */
//		
//		// pcode
//		return this.pcode.hashCode();
//		// 모든 필드 비교 ( 3번 )
////		return pcode.hashCode()^pname.hashCode()^new Integer(price).hashCode()^new Integer(quantity).hashCode();
//	}
	
	
	
	

	/**
	 * percentage 만큼 할인된 가격을 리턴하는 메소드
	 * @param percentage
	 * @return
	 */
	public int discount(double percentage) {
		return (int)(price * (1 - percentage));
	}
	
	/**
	 * 재고 수량에서 amount 만큼 줄어들도록 하는 메소드
	 * 단, amount 을 빼고 나서 재고 수량이 음수가 되어서는 안된다.
	 * @param amount
	 */
	public void sell(int amount) {
		if (quantity >= amount) {
			quantity -= amount;
		}
	}
	
	/**
	 * 재고 수량에서 amount 만큼 늘어나도록 하는 메소드
	 * @param amount
	 */
	public void buy(int amount) {
		quantity += amount;
	}
	
	/* ----------------------------------------------------------------------------------
	 * 캡슐화를 적용하여 멤버변수 필드의 가시성이 private 으로 조정되면 
	 * 다른 모든 클래스에서 접근에 불가능해진다.
	 * 따라서 숨겨진 필드에 접근할 수 있는 전용 메소드 쌍을 정의해야 한다.
	 * => 접근자 / 수정자 메소드
	 * ==================================================================================
	 * 접근자 메소드 : getter
	 * ----------------------------------------------------------------------------------
	 * 1. get 으로 시작
	 * 2. get 귀에 오는 이름은 접근하려는 멤버변수 이름의 첫 글자만 대분자로 하는
	 *    낙타표기법(camel-notation) 적용
	 * 3. 메소드 매개변수는 없어야 한다.
	 * 4. 메소드 리턴 타입은 접근하려는 멤버변수의 타입과 맞춘다.
	 * 5. 멤버변수 타입이  boolean 인 경우 get 이 아니라 is 로 시작하도록 작성
	 * 6. getXxx(), isXxx() 형태로 정의
	 * ==================================================================================
	 * 수정자 메소드 : set
	 * ----------------------------------------------------------------------------------
	 * 1. set 으로 시작
	 * 2. set 귀에 오는 이름은 접근하려는 멤버변수 이름의 첫 글자만 대분자로 하는
	 *    낙타표기법(camel-notation) 적용
	 * 3. 메소드 매개변ㅅ는 수정하려는 멤버변수 타입과 맞추고 보통 수정하려는 멤버변수 이름과 같게 설정
	 * 4. 리턴타입은 void 로한다.
	 * 5. 보통 안쪽 로직은 this.멤버변수 = 매개변수; 로 작성
	 * ---------------------------------------------------------------------------------- */
	// 수정자
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity (int quantity) {
		this.quantity = quantity;
	}
	
	
	public String getPcode() {
		return pcode;
	}
	
	public String getPname() {
		return pname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
} // end class
