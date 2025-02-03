package hk.edu20250122.day12;

public class D2_CompleteCalc extends D2_Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		//5 / 0 오류
		if(num2 != 0) {
			return num1 / num2;	
		}else {
			return D2_Calc.ERROR;
		}
	}
	
	//하위 클래스에 새로운 메서드 추가
	public void showInfo() {
		System.out.println("하위클래스에서 새롭게 정의함");
	}
}
