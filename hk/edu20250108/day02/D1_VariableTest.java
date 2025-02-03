package hk.edu20250108.day02;

import java.util.Scanner;

//명명법, 식별자:
//클래스명: 파스칼방식 - 첫글자는 대문자로.. 의마가 바뀔 때 대문자.. 나머지는 소문자
//자바는 클래스 단위로 작성한다.
public class D1_VariableTest {
	
	//main 메서드: 자바코드 실행 //static 정적. 메모리에 올려져 있음. 바로 사용할 수 있게 준비됨
	public static void main(String[] args){
		//i=20; //블럭 변수는 불러올 수 없음
		test01();
	}
	
	//메서드 선언: 카멜 방식으로 이름 정의 - 소문자로 시작
	public static void test01() {
		int i = 10; //블럭 변수
		byte b = (byte)i;
	
		//1. 정수형 기본형 int
		//byte 표현 범위: -128 ~ 127
		b = 127; //128이상 할당하면 범위 벗어남.. 오류 발생
		long l = 50000000000L; //java에서는 리터럴값을 int로 보기 때문에 값의 범위를 벗어나면 오류
		
		//2. 실수형
		//기본형: double
		double d = 16.4;
		float f = 16.7f; //f를 붙이던지..
		float ff = (float)16.7; //강제형 변환 문법을 사용하던지..
		
		//3. 다른 타입끼리 연산
		// 10.0+16.4=26.4 ---> (int)26
		int ii = (int)(i+d); //int + double -> (double)int + double =double
		System.out.println("int ii = (int)(i+d);" + ii);
		
		//리터럴끼리 연산, 변수에 할당해서 연산할 경우
		byte bb = 5+10; //리터럴 연산할 때는 할당하는 변수 타입에 맞게 변환해서 저장
		byte b2=5;
		byte b3=10;
		byte b4=(byte)(b2+b3); //변수끼리 연산할 때는 강제형변환시켜줘야 함
		System.out.println(b4);
		
		//문자열(숫자형태) ---> 숫자형으로 형변환
		//웹페이지 텍스트 형태 "4" ---> 자바 "4"+5 = 9(X) , "45" (O)	
		//String -> byte
		//String -> int...
		String s = "100";
		// "100" 숫자형태의 문자열을 정말 int(정수형)으로 변환시켜주는 기능
		System.out.println(Integer.parseInt(s)+10); //Integer 참조타입
		
		//---- Scanner 클래스 사용하기
		Scanner scan = new Scanner(System.in); //System.in: 키보드로 입력받는 값
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt(); //입력 받기 위해 대기하다가 입력이 완료되면 읽어들임
		System.out.printf("입력값:%d, 연산결과:%d", num, num+10);
		//new 사용하면 Heap 메모리에 저장
		//static 사용하면 static 메모리에 저장
		
		System.out.println("문자를 입력하세요");
		String ss = scan.next();
		System.out.printf("입력값:%s", ss);
		
		
		
		
	}
}
