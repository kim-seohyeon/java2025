package hk.edu20250113.day05;

public class D2_MethodTest {
	
	//defult 생성자
	public D2_MethodTest() {
		//생략이 가능하다. (상황에 따라 생략을 할 수 없는 경우도 있음)
	}

	//java.exe 실행되면 JVM이 실행되면서 main 메서드를 찾아서 실행..
	public static void main(String[] args) {
		//static 메모리에 올라가 있는 상태 -> 완제품 -> 바로 사용할 수 있음
		test01(); //메서드를 실행하려면.. 또는 자바코드를 실행하려며 main메서드에서 실행 
		
		//non-static 메모리에 올라가 있지 않고 설계만 되어있는 상태
		//				--> static을 붙이던지 / 객체 생성 --> new 사용 --> 다른 메모리(Heap)에 넣던지
		
		//객체 생성(인스턴스화) new를 사용: Heap 매모리에 생성
		D2_MethodTest d2_test = new D2_MethodTest(); //D2_MethodTest 참조 타입: 클래스로 존재 / D2_MethodTest 생성자 호출
		d2_test.test02();//객체명.메서드()로 호출할 수 있다.
		// test02(); //non-static ---> static에서 호출 못 함
		
		//test05(10, (byte)5); //파라미터를 통해 메서드에 값을 전달하고
		int result = test05(10, (byte)5); //return에 의해 값을 반환해서 받을수도 있다.
		
	}
	
	//메서드의 유형
	//1. static과 non-static
	// static 메서드
	public static void test01() {
		System.out.println("static 메서드");
	}
	//non-static 메서드
	public void test02() {
		System.out.println("non-static 메서드");
	}
	
	//2. 반환타입 O / 반환타입 X
	public int test03() { //메서드 이름 앞에 반환 타입 선언해야 함
		return 0; //반드시 리턴에 값을 정의해야 컴파일 됨
		
	}
	
	public void test04() { //반환 타입이 없다면 void로 정의해야 함
		//코드를 실행하고 그냥 끝나는 작업.. 반환값 X
		//void 예약어: 그 함수가 아무것도 반화하지 않은 것
	}
	
	//3. 파라미터 O/X: 메서드의 외부로부터 값을 전달 받아서 처리할 경우
	public static int test05(int a, byte b) {
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	
	
}
