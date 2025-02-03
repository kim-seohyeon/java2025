package hk.edu20250121.day11;

public abstract class D2_NoteBook extends D2_Computer{

	@Override
	public void display() {
		System.out.println("NoteBooke display!!");
	}

	//typing() 기능을 구현 못 하는 상황 --> 반드시 어디선가는 구현해야 함
	//							   --> 강제 상속을 통한 강제 구현
	@Override
	public abstract void typing(); //강제로 구현하게 하려면 추상메서드로 남겨놔야 함 -> 클래스 앞에도 추상 메서드

}
