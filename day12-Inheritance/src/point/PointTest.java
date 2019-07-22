package point;

/**
 * x, y 좌표를 가지고 있는 p, q의 거리를 구하는 메소드
 * @author Administrator
 *
 */
public class PointTest {

	public static void main(String[] args) {
		// 1. 변수 선언
		Point p;
		Point q;
		
		// 배열
		Point[] points = new Point[2];
		
		// 2. 초기화
		p = new Point(0, 0);
		q = new Point(3, 4);
		
		// 배열 초기화
		points[0] = new Point(0, 0);
		points[1] = new Point(3, 4);
		
		// 3. 사용
		// (1) 점 p 를 출력
//		System.out.println(p.toString()); // 아래와 같은 결과
		System.out.println(p);
		
		// (2) 점 q 를 출력
		System.out.println(q);
		
		// (3)  두 점 사이의 거리를 계산
		System.out.printf("두 점사이의 거리 : %5.2f%n", p.distanceFrom(q));
		
		// 배열 출력
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points); // 이상한 값
		
	}

}
