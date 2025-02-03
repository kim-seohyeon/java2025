package hk.edu20250110.day04;

import java.util.Scanner;

public class D1_GugudanTest {
	
	public static void main(String[] args) {
		
		//구구단 출력하기
		//2단 출력하기
		
//		int i, result=0;
//		for(i=1; i<10; i++) {
//			result = 2*i;
//			System.out.println("2 * "+ i + " = " + result);
//		}
//		
		//2단 ~ 9단 출력하기
//		int i, j, result =0;
//		for(i=2; i<10; i++) {
//			for(j=1; j<10; j++) {
//			result = i*j;	
//			System.out.println(i + " * " + j + " = " + result);
//			}		
//		}
		
		//2단 ~ 9단까지 출력하는데 홀수단만 출력하기
//		int i, j, result =0;
//
//		for(i=2; i<10; i++) { //단을 나타내는 for문
//			if(i % 2 == 1) { //홀수 조건
//				System.out.println();
//				for(j=1; j<10; j++) { //단을 출력해주는 for문
//				result = i*j;	
//				System.out.println(i + " X " + j + " = " + result);
//				}		
//			}
//		}
		
		//1~100까지 정수의 총합을 출력하기
		
//		int x, hap =0;
//		for(x=1; x<=100; x++) {
//			hap += x;
//		}
//		System.out.println("1부터 100까지의 합은: " + hap);
		
		
		//1~100까지 정수 중 3의 배수의 총합을 출력하기
//		int hap =0;
//		for(int x=1; x<=100; x++) {
//			if(x % 3 == 0) {
//			hap += x;
//			}
//		}
//		System.out.println("1부터 100까지 정수 중 3의 배수의 합은: "+hap);

		//교재 140p 4번
//		while(true) {
//			
//			int dice1 = (int) (Math.random()*6)+1;
//			int dice2 = (int) (Math.random()*6)+1;
//
//			System.out.println("(" + dice1 + "," + dice2 + ")");
//			
//			if(dice1 + dice2 == 5) {
//				System.out.println("합이 5가 되어 종료합니다");
//				break;
//			}
//		}
		
//		int dice1 = (int) (Math.random()*6)+1;
//		int dice2 = (int) (Math.random()*6)+1;
//		
//		while(dice1 + dice2 == 5) {
//			System.out.println("(" + dice1 + "," + dice2 + ")");			
//			System.out.println("합이 5가 되어 종료합니다");
//
//			break;
//		}
//		System.out.println("(" + dice1 + "," + dice2 + ")");
		
		
		//교재 140p 5번
		//4x+5y=60 (x,y) 형태로 출력, x와 y는 10이하의 자연수
		
//		for(int x=1; x<=10; x++) {
//			for(int y=1; y<=10; y++) {
//				if(4*x+5*y==60) {
//					System.out.println("("+x+","+y+")");
//				}
//			}
//		}
		
		//교재 140p 6번
//		for(int i=1; i<=5; i++) {
//			for(int j=0; j<i-1; j++) {
//				System.out.print("*");
//				//System.out.print("");
//			}
//			System.out.println();
//		}
		
		//피라미드 * 출력
		//첫번째 공백공백공백공백*
		//두번째 공백공백공백 * * *
		//세번째 공백공백  * * * * *
//		for (int i = 1; i <= 5; i++) {
//		    for (int j = 1; j <= 5 - i; j++) {
//		        System.out.print(" ");
//		    }
//		    for (int j = 1; j <= 2 * i - 1; j++) {
//		        System.out.print("*");
//		    }
//		    System.out.println();
//		}
		
		//140p 7번
		Scanner scan = new Scanner(System.in);
		
		int balance = 0; //계좌
		while(true) {
			System.out.println("------------------------");
			System.out.println(" 1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.print("선택>");
			
			String num = "";
			if(scan.hasNextInt()) { //입력값이 숫자라면...
				num = scan.nextLine();
			}else {
				System.out.println("숫자만 입력하세요");
				scan = new Scanner(System.in); //새로 입력받기 위해 생성
				continue; //가까운 반복문으로 이동
			}
			
			if(num.equals("1")) {
				System.out.print("예금액>");
				balance += Integer.parseInt(scan.nextLine()); //문자열을 정수형으로 변환
			}else if(num.equals("2")) {
				System.out.print("출금액>");
				balance -= Integer.parseInt(scan.nextLine());
			}else if(num.equals("3")) {
				System.out.print("잔고>" + balance + "\n");
			}else if(num.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("1~4까지의 숫자만 입력하세요");
			}	
		}
	}

}
