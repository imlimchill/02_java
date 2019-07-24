package product;

/**
 * 
 * @author Administrator
 *
 */
public class ProductTest {

	public static void main(String[] args) {
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
		Product mouse;
		Product airFrier;

		// 2. 초기화
		mouse = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		
		// 원래는 좋지 않은 방법 / 쓰지는 말자
		// 객체생성은 기본생성자
		airFrier = new Product();
		// 각 필드는 .(도트연산자)로 직접 접근해서 저장
		// Prodicu 의 각 필드에  access modifier 생략시 가능
//		airFrier.pcode = "P002";
//		airFrier.pname = "[필립스] 에어프라이어 HD-9743";
//		airFrier.price = 329000;
//		airFrier.quantity = 5;
		
//		System.out.println(airFrier.pcode);
//		System.out.println(airFrier.pname);
//		System.out.println(airFrier.price);
//		System.out.println(airFrier.quantity);
		
		
		// 수정자 메소드로 저장하기
		// Product 의 각 필드에  access modifier private 인 경우
		// 반드시 수정자에 의해서만 접근 가능하다.
		airFrier.setPcode("P002");
		airFrier.setPname("[필립스] 에어프라이어 HD-9743");
		airFrier.setPrice(329000);
		airFrier.setQuantity(5);
		// 필드의 값을 가져올 때는 접근자 메소드로만 작업하도록한다.
		System.out.println(airFrier.getPcode());
		System.out.println(airFrier.getPname());
		System.out.println(airFrier.getPrice());
		System.out.println(airFrier.getQuantity());
		

		// 3. 사용
		// (1) 제품 상태 출력
		mouse.print();
		airFrier.print();
		System.out.println("==============================================================");

		// (2) 20% 할인가는 어떻게 되나?
		int dcPrice = mouse.discount(0.2);
		System.out.printf("제품 가격 : %d,  20%% 할인가 : %d%n", 51330, dcPrice);

		// (3) 2개 판매(sell)
		mouse.sell(2);

		// (4) 상태 출력
		mouse.print();

		// (5) 10개 입고(buy)
		mouse.buy(10);

		// (6) 상태 출력
		mouse.print();

		System.out.println("==============================");
		System.out.println(mouse);
		System.out.println("==============================");		

	} // end main

} // end class
