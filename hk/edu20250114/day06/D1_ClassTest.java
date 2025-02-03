package hk.edu20250114.day06;

public class D1_ClassTest {

	//멤버필드: 클래스 안에서 값을 저장해서 사용되는 변수
	public int number; //인스턴스 변수: new를 통해서 heap 메모리에 올라가 있을 때 사용 가능
	//private int number; 	//private으로 선언하면 다른 클래스에서 접근 불가
	public static int staticNumber; //클래스 변수: 메모리에 올라간 상태 바로 사용 가능
	
	//기본 생성자 (default 생성자)
	// -> 파라미터 X, 혼자 쓰이는 생략 O, 클래스의 초기화 작업을 수행
	public D1_ClassTest() {
		//super라는 용어는 부모 클래스를 의미 -> 여기서 super는 Object클래스의 default 생성자
		super(); //()는 생성자?
		this.number = 5; //this는 자기자신 클래스 뜻함
	}
	
	//생성자 오버로딩: 생성자 이름은 같고 파라미터 갯수나 타입을 다르게 작성
	public D1_ClassTest(int number) {
		this.number = number; 
	}
	
	//메서드: 기능 구현
	//non-static 메서드는 호출할 때 객체 생성 후 -> 객체명.메서드();
	public void methodeTest() {
		System.out.println("클래스 내부에 기능을 정의한다.");
	}
	//static메서드는 호출할 때 객체 생성 X -> 클래스명.메서드();
	public static void staticMethodeTest() {
		System.out.println("static메모리에 생성되는 메서드");
	}
	
	
	
	
}
