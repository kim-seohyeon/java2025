package hk.edu20250115.day07;

public class D2_CalculatorMain {

	public static void main(String[] args) {
		

//		D2_CalculatorA calcuA = new D2_CalculatorA(50, 20);
//		calcuA.a();
//		System.out.println(calcuA.getResult());
		
		int num1 = 20;
		int num2 = 10;
		String calcu ="*";
		
		D2_CalculatorCom cal = new D2_CalculatorCom();
		cal.calculator(num1, num2, calcu);
		System.out.printf("%d와 %d의 %s 계산결과: %d \n", num1, num2, calcu, cal.getResult());
	}
		
}
