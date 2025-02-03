package hk.edu20250121.day11;

public class D1_human extends D1_Animal {

	@Override
	public void move() {
		System.out.println("사람은 두 발로 걷습니다.");
	}
	
	public void test() {
		System.out.println("나는 인간한테만 있는 메서드야");
	}
	
	public void babo() {
		System.out.println("윤지영은 인간이 아닙니다.");
	}
}
