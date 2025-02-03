package hk.edu20250114.day06;

public class D1_ClassTestMain {

	public static void main(String[] args) {
		
		//Heap메모리에 생성
		D1_ClassTest classTest = new D1_ClassTest();
		//non-static메서드를 호출하는 경우
		classTest.methodeTest();
		
		//멤버필드에 저장된 값 가져오기
		int number = classTest.number; 
		
		//static메서드 호출하는 경우
		D1_ClassTest.staticMethodeTest();
		
		//static필드에 저장된 값 가져오기
		int staticNumber = D1_ClassTest.staticNumber;
		
		//인스턴스 객체 하나 더 생성
		D1_ClassTest classTest2 = new D1_ClassTest();
		classTest.staticNumber = 30;
		
		
		System.out.println(classTest2.staticNumber);
		
		//인스턴스 변수: 객체 각각에 대해 관리가 되기 때문에 서로 영향이 없다.
		classTest.number = 10;
		classTest2.number = 50;
		
		System.out.println(classTest.number+ ", "+classTest2.number);
		
	}

}
