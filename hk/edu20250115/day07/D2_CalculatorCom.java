package hk.edu20250115.day07;

//어떤 요청을 했는지 확인해서 해당 기능을 실행
public class D2_CalculatorCom {

	private int result; //연산 결과
	
	//요청에 해당하는 객체를 생성해서 서비스하는 메서드
	//파라미터에 cal변수는 String cal ="+", "-", ... 사칙연산을 받음
	public void calculator(int num1, int num2, String cal) {
		//분기형태로 실행: if문을 통해서 구현
		if(cal.equals("+")) { //문자열 비교 equals()로 하자 ==(x)
			D2_CalculatorA calA = new D2_CalculatorA(num1, num2);
			calA.a(); //덧셈 연산 실행
			this.result = calA.getResult();
		}else if(cal.equals("-")){
			D2_CalculatorB calB = new D2_CalculatorB(num1, num2);
			calB.a();
			this.result = calB.getResult();
		}else if(cal.equals("/")) {
			D2_CalculatorC calC = new D2_CalculatorC(num1, num2);
			calC.a();
			this.result = calC.getResult();
		}else if(cal.equals("*")) {
			D2_CalculatorD calD = new D2_CalculatorD(num1, num2);
			calD.a();
			this.result = calD.getResult();
		}else {
			System.out.println("입력된 연산자는 지원하지 않습니다.");
		}
	}
	
	//캡슐화(은닉화)된 멤버필드의 값을 가져온다.
	public int getResult() {
		return this.result;
	}
}
