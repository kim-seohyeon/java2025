package hk.edu20250121.day11;

public abstract class D2_Computer {
	
	//추상메서드: body{}가 없는 메서드 --> 미완성 메서드
	//추상메서드를 포함하면 반드시 class 앞에 abstract를 작성
	//display방식이 컴퓨터 유형별로 다를 수 있다. -> 그래서 정의를 못 함
	public abstract void display();

	//typing 방식이 컴퓨터 유형별로 다를 수 있다. -> 그래서 정의를 못 함
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
