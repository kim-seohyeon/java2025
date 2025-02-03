package hk.edu20250122.day12;

public class D2_CalcMain {

	public static void main(String[] args) {
		
		//인터페이스 타입으로 객체 생성
		D2_Calc calc = new D2_CompleteCalc();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.divide(30, 2));
//		System.out.println(calc.showInfo()); //호출 안 됨 -> 왜? 하위 클래스에 만들어서. -> 호출하려면
		//하위클래스에 showInfor 사용하려면 하위클래스 타입으로 형 변환 해야함
		D2_CompleteCalc calc2 = (D2_CompleteCalc)calc; // 다운 캐스팅
		calc2.showInfo();
	}

}
