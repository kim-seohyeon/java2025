package hk.edu20250120_day10;

public class ChildMain {

	public static void main(String[] args) {
		//부모의 타입으로 자식을 생성
		Parent p = new Child();
		p.parentMethod(); //부모의 설계도이기 때문에  
						  //부모의 메서드가 호출되어야 하는데 자식의 메서드가 호출됨 
						  // -> 다형성
		
		//자식의 타입으로 자식을 생성
		Child c = new Child(10);
		c.childMethod();
		
		//부모, 자식 클래스 간에 형 변환 가능
		Child cc = (Child)p; //int i =10; byte b = (byte)i;
		
		//toString() 오버라이딩
		System.out.println(cc);
		
	}
}
