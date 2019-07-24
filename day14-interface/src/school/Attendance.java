package school;

/**
 * 학교 시스템에서 구성원들 모두의 출결을 나타내기 위해 정의하는 클래스
 * 
 * @author Administrator
 *
 */
public interface Attendance {

	/**
	 * 구성원의 출력을 나타내는 문자열을 리턴
	 * @return
	 */
	public abstract String attend();
}
