package hk.edu20250113.day05;

import java.util.Scanner;

public class D3_Divisor {

	public static void main(String[] args) {
		divisor(6);
		System.out.println();

		MaxDivisor(20, 60);
		System.out.println();

		MinDivisor(2, 4);
		System.out.println();

		amicable(1,5000);
		System.out.println();

		perfectNum(1, 100);
	}

	//메서드 단위로 구현해보기

	//약수 구하기
	//약수란? 어떤 수를 나누어 떨어지게 하는 수를 그 수의 약수라고 함
	//12의 약수: 1,2,3,4,6,12
	//구하는방법: 12의 범위 안에서 1~12까지의 숫자로 12를 나눠서 나머지가 0이 되는 수를 콘솔에 출력
	
//	public static void Divisor() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("구하고자 하는 약수를 입력하세요: ");
//		int num = scan.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) {
//				//System.out.print(i+", "); //1, 2, 3, 6,
//				System.out.print((i==num)?i:+i+", "); //삼항연산자 활용 --> 1, 2, 3, 6
//
//			}
//		}
//	}

	public static void divisor(int num) {
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
//				System.out.print(i+",");
				System.out.print((i==num)?i:i+",");//삼항연산자 활용
			}
		}
	}
	
	//최대공약수 구하기
	//최대공약수란? 두 수의 약수들 중에 공통된 약수 중 가장 큰 수
	//구하는 방법: 1. 소인수분해 2. 두 수가 같아질 때까지 큰 수에서 작은 수를 뺀다.
	public static int MaxDivisor(int a, int b) { 
		int minA = a; // 원본값 저장해두기: a --> minA로 값을 전달(값을 전달하는 건 기본타입에서 가능)
		int minB = b;
		
		//비교->뺌->저장 while
		while(a != b) {
			if(a > b) {
				a = a- b;
			}else {
				b = b - a;
			}
			break;
		}
		System.out.printf("%d와 %d의 최대공약수: %d \n", minA, minB, a);
		return a;
	}
	
	//최소공배수 구하기
	//최소공배수란? 두 수의 공통 배수 중에 가장 작은 수
	//구하는 방법: 두 수를 곱한 뒤 두 수의 최대공약수로 나눈다.
	public static void MinDivisor(int a, int b) {
		
		int val = MaxDivisor(a, b); //반환값이 없는 메서드 --> void-> int --> 반환값이 필요함 
		
		//최소공배수 계산
		int min = (a*b) / val;
		System.out.println(a+"와" + b + "의 최소공배수는: " + min);
	}
	
	//친화수 구하기
	//친화수란? 두 수 각각의 약수의 합이 같은 수
	//구하는 방법: 
	//220의 약수(1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110, 220) 중 자신을 제외한 합 = 284
	//284의 약수(1, 2, 4, 71, 142,284) 중 자기 자신을 제외한 합 = 220
	//즉, 220의 진약수(자기 자신을 제외한 약수)의 합 = 284의 진약수의 합 = 220
	
	// 220 == 284의 진약수의 합(220의 진약수의 합: 284)
	//필요한 기능: 진약수의 합을 구하는 메서드
	public static void amicable(int start, int end) { //결과값만 보여주고 끝내기 때문에 void, 범위: int start ~ int end
		for (int i = start; i < end; i++) {
			if(i != sumDivisor(i) && i == sumDivisor(sumDivisor(i))) {
				System.out.println(i+"와 "+(sumDivisor(i))+"는 친화수 관계입니다.");
			}			
		}
	}
	
	//진약수의 합을 구하는 메서드: 합을 반환해야 되므로, 반환타입은 int형
	public static int sumDivisor(int a) {
		int sum = 0; //합계를 저장할 변수
		for (int i = 1; i < a; i++) {
			if(a % i == 0) {
				sum += i;
			}
		}
		return sum;	
	}
	
	//완전수 구하기: 
	//완전수란? 진약수(자기자신을 제외한 약수들)의 합이 자신의 수와 같은 수
	//6의 약수: 1, 2, 3, 6 -> 1+2+3 = 6
	public static void perfectNum(int s, int e) {
		for (int i = s; i < e; i++) {
			if(i == sumDivisor(i)) {
				System.out.println(i+"는 완전수이다.");
			}
		}
	}
}
