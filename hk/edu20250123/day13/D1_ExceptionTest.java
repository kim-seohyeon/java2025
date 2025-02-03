package hk.edu20250123.day13;

public class D1_ExceptionTest {

	public static void main(String[] args) {
		exTest();
		
		try {
			userExceptionTest(15);
		} catch (D1_UserException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void exTest() {
		int i = 0;
		String ss = "10"; // <-- 숫자형식의 문자열이 저장되어야 함
		int [] array = {1, 2, 3, 4, 5};
		
		try { //try블럭: 예외가 발생할 가능성이 있는 코드
			i = Integer.parseInt(ss); //i에 정수 10 저장
			String ss2 = ss.substring(0, 1);
			int a = array[5];
		} 
		
		catch (NumberFormatException | NullPointerException ee) {
			//예외가 발생하면 실행되는 코드
			ee.printStackTrace(); //콘솔창 빨간 글씨
			System.out.println("숫자형태인지 확인하세요");
		} 
		
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("문자열의 길이를 확인하세요");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스를 확인하세요");
		}
		
		catch (Exception e) {
			//multi catch를 할 경우
			//작은 범위의 클래스들을 먼저 처리하고, 마지막에 Exception으로 처리
			System.out.println("Exception클래스로 처리");
			System.out.println("다른 유형의 예외도 처리하려면.. 마무리로 Exception e로 처리 해야 함");
		}
			
		finally{
			System.out.println("반드시 처리해야 할 코드");			
		}
		
		System.out.println(i);
	}
	
	//예외 던지기: 바로 직접 처리하지 않고 다른 곳에서 처리하도록 넘긴다.
	public void test01() throws Exception {
		System.out.println("예외처리할 코드가 있음");
	}
	
	//throws한 test01() 메서드를 실행하려면 예외처리를 반드시 해야 한다.
	public void test02() {
		try {
			test01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//사용자 예외처리: throws로 구현
	public static void userExceptionTest(int a) throws D1_UserException {
		//a는 1~10까지의 숫자만 전달받을 수 있게 하자.
		if(!(a > 0 && a < 11)) { //1~10의 범위의 숫자라면 true
			throw new D1_UserException("1~10사이의 숫자만 입력하세요");
		}	
	}
}




