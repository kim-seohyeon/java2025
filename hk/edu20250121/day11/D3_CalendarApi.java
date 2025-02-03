package hk.edu20250121.day11;

import java.util.Calendar;
import java.util.Iterator;

public class D3_CalendarApi {

	public static void main(String[] args) {
		int year = 2025;
		int month = 1;
		
//		Calendar cal = new Calendar; //추상 클래스라서 객체 생성 안 됨
		Calendar cal = Calendar.getInstance(); //메서드를 통해 객체 얻어 옴
		cal.set(year, month-1, 1); //특정일로 설정
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //1~31중 가장 큰 값, 해당 달의 일의 최대값
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일: 1~7
		
		System.out.println(year+"년 "+month+"월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int i = 0; i < dayOfWeek-1; i++) {
			System.out.print("\t");
		}
        for (int i = 1; i <= lastDay; i++) {
			System.out.print(i+"\t");
			if((i+dayOfWeek-1)%7==0) {
				System.out.println();
			}
		}
        
        for (int i = 1; i < args.length; i++) {
			calPrint(2025, i);
		}
	}
	
	public static void calPrint(int year, int month) {
		Calendar cal = Calendar.getInstance(); //메서드를 통해 객체 얻어 옴
		cal.set(year, month-1, 1); //특정일로 설정
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //1~31중 가장 큰 값, 해당 달의 일의 최대값
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일: 1~7
		
		System.out.println(year+"년 "+month+"월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int i = 0; i < dayOfWeek-1; i++) {
			System.out.print("\t");
		}
        for (int i = 1; i <= lastDay; i++) {
			System.out.print(i+"\t");
			if((i+dayOfWeek-1)%7==0) {
				System.out.println();
			}
		}
	}
}
