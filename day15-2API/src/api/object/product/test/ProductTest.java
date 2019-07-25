package api.object.product.test;

import api.object.product.Product;

/**
 * 
 * @author Administrator
 *
 */
public class ProductTest {

	public static void main(String[] args) {
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
		Product[] products = new Product[3];
		Product msMouse;
		Product ltMouse;
		Product airFrier;

		// 2. 초기화
		msMouse = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		ltMouse = new Product("P003", "로지텍코리아 G302 Daedalus Prime", 34900, 36);
		
		airFrier = new Product();
		airFrier.setPcode("P002");
		airFrier.setPname("[필립스] 에어프라이어 HD-9743");
		airFrier.setPrice(329000);
		airFrier.setQuantity(5);
		
		// products 배열에 원소 할당
		products[0] = msMouse;
		products[1] = airFrier;
		products[2] = ltMouse;
		
		
		// 3. 사용
		// (1) 초기상태 출력
		for (Product product: products) {
			product.print();
		}
		
		// (2) ms마우스의 가격을 변경
		Product msMouse2 = new Product("P001", "MS-아크 터치 마우스", 40000, 36);
		// 제품이 들어있는 배열 products 에서 msMouse 의 pcode 와 같은 제품번호를 갖는 인덱스의 원소를 
		// msMouse 로 변경
		for (int idx = 0; idx < products.length; idx++) {
//			if (products[idx].getPcode() == msMouse2.getPcode()) {
//			if (products[idx].getPcode().equals("msMouse2.getPcode()")) {
			// equals() 메소드 안에서 이미 pcode로 비교 중이니까 그냥 변수만 적자
			if (products[idx].equals("msMouse2")) {
				products[idx] = msMouse2;
			}
		}
		// 결과는 바뀌어서 나옴 / String 의 특징 String name = new String("P001"); 이라고 안적음
		// 그냥 ""로 초기화하면 힙이 아니라 리터럴 풀이라는 곳에 저장
		// 그 상태에서 새로운 객체로 같은 값을 저장하면 리터럴 풀에 있는 같은 값을 가리킴
		// 그래서 결국 바뀐 결과가 나옴(재활용) > 이런 방법으로 쓰다가 다른애들에게 쓰면 안됨
		// 결국 어느 코드로나 같은 결과가 나오게 하려면 정확한 방법을 사용해야 한다.

		
		// (1) 초기상태 출력
		for (Product product : products) {
			product.print();
		}

	} // end main

} // end class
