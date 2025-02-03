package hk.edu20250122.day12;

public interface D1_InterfaceTest {

	//다중 상속을 흉내.. extends .. implements..
	//class A extends B implements Interface
	
	//인터페이스시리 다중 구현이 가능함 implements IA, IB, IC
	//인터페이스끼리 상속 가능 IA extends IB
	//클래스가 인터페이스를 구현할 때 class A implements IB
	
	//멤버필드 정의
	public int B = 10; //기본으로 작성해도 자동 상수 선엄됨. 초기값 정의 해야 함.
	public static final int A = 5; //상수는 대문자
	
	//추상 메서드
	public int test(); //기본으로 작성해도 자도 추상 메서드가 선언됨
	public abstract int test2();
	
	//default 메서드
	//중간에 추가해도 다른 구현 클래스들에서 오류 발생 안 함
	public default void test3() {
		System.out.println("인터페이스를 구현한 객체가 사용한다. : 바디가 있다.");
		test6();
	}
	
	//개발 중간에 test4()메서드를 추상메서드로 추가하게 되면 
	//기존에 구현하고 있던 클래스들이 모두 오류가 발생하게 됨
	//-> 기존 클래스에 override 해야 오류가 발생하지 않음.
//	public void test4();
	
	//static 메서드
	//D1_InterfaceTest.test5(); 호출 가능
	public static void test5() {
		System.out.println("인터페이스만으로 실행 가능하다.");
	}
	
	//private 메서드: 구현한 객체가 사용할 수 없다. 인터페이스 내부에서만 공통 기능으로 사용
	private void test6() {
		System.out.println("인터페이스 내부에서 사용 가능");
	}
	
	
	
	
	
	
	
	
	
	
}
