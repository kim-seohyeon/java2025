package hk.edu20250120_day10;

public class Parent {

	public int a; //멤버필드
	
	public Parent() {
		System.out.println("부모의 생성자입니다. (default)");
	}
	
	public Parent(int a) {
		System.out.println("부모의 생성자입니다. (오버로딩)");
	}
	
	public void parentMethod() {
		System.out.println("부모의 메서드입니다.");
	}
	
	
}
