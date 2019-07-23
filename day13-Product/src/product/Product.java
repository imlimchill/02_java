package product;

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
	String pcode;
	
	/** 제품의 이름*/
	String pname;
	
	/** 제품의 가격*/
	int price;
	
	/** 제품의 재고수량*/
	int quantity;
	
	// 2. 생성자
	// (1) 기본생성자
	/**
	 * 기본 생성자
	 */
	Product() {
		
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
	
	
	// 3. 메소드
	
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
	 * @param amount
	 */
	public void sell(int amount) {
		quantity -= amount;
	}
	
	/**
	 * 재고 수량에서 amount 만큼 늘어나도록 하는 메소드
	 * @param amount
	 */
	public void buy(int amount) {
		quantity += amount;
	}
	
} // end class
