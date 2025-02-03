package hk.edu20250109.day03;

import java.util.Scanner;

public class D1_isLeapYear {
	
	public static void main(String[] args) {
		//올해가 윤년인지 아닌지 알아보기
		//윤년이 뭐지?? 365일(평년), 366일(윤년)
		//윤년을 판단하는 조건을 확인
		// - 년도가 4의 배수이면서 100으로 나누어 떨어지지 않는 수
		// - 또는 400으로 나누어 떨어지는 수
		// 2025년가 윤년인지 아닌지 확인해서 출력해보기: "2025년은 윤년이다." or "2025년은 윤년이 아니다."
		
		//코드 작성
		//이번년도 2025년도 확인
		
//		 int year = 2025; 
//		 if((year % 4 ==0 && year % 100 !=0) || year % 400 ==0) {
//		 System.out.println("2025년은 윤년이다");
//		 }
//		 else{ System.out.println("2025년은 윤년이 아니다."); 
//		 };
//		 
		
		//다른 년도 확인
		//Scanner 클래스 이용해서 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();
		
		if((year % 4 ==0 && year % 100 !=0) || year % 400 ==0) {
		System.out.println("2025년은 윤년이다");
		}else{ System.out.println("2025년은 윤년이 아니다."); };
		

		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("확인을 원하는 년도를 입력하세요>");
				
			int year1=scan.nextInt();
				
			if(year1==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
		//2000~2030년도 
//		for(int year=2000; year<=2030; year++) {
//			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println(year + "년은 윤년이다");
//			}else{ System.out.println(year + "은 윤년이 아니다."); };			
//		}	
	}
}
