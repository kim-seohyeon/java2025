package hk.edu20250122.day12;

public abstract class D2_Calculator implements D2_Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	//나머지 2개의 메서드는 현재 클래스에서 기능 구현을 하기 힘든 상황이라고 한다면...
	//하위의 클래스에서는 반드시 구현을 해야 사용할 수 있다. 상속 강요
	public abstract int times(int num1, int num2);
	public abstract int divide(int num1, int num2);
	
}
