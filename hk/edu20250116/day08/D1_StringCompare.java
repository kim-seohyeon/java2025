package hk.edu20250116.day08;

public class D1_StringCompare {

	public static void main(String[] args) {
		//리터럴과 리터럴 비교
		String s1 = "java";
		String s2 = "java";
		
		System.out.println(s1 == s2); //주소로 비교
		System.out.println(s1.equals(s2)); //hashCode로 비교
		System.out.println();
		
		//객체와 객체 비교
		String obj1 = new String("java");
		String obj2 = new String("java");
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println();

		//객체와 리터럴 비교
		System.out.println(s1 == obj1);
		System.out.println(s1.equals(obj1));
		System.out.println();

		//String 특징: immutable한 성격 --> 값이 변경되지 않는 성질
		String s = "java"; //원본
		String ss = s; //복사하기
			   ss ="자바"; //복사 받은 쪽에서 값을 바꾸면 원본은?
	    System.out.println(s); //원본은 그대로
	
	    //성능 부분: 변수 s에 값이 자주 변경되는 상황 -> 객체가 새롭게 생성 -> 효율이 안 좋음
	    for (int i = 0; i < 10; i++) {
	    	s += i; //문자열에 증가되는 숫자를 더하는 코드
	    	System.out.println(s);
		}
		System.out.println();

		//StringBuffer는 heap영역에 한 번 생성되고,
		//값이 변경된다면 그 객체 안에 값이 변경 --> 새로 생성X --> 메모리 효율 Good!
	    StringBuffer sb = new StringBuffer("java");
//	    String sb = "java";
	    for (int i = 0; i < 10; i++) {
			sb.append(i); 
			System.out.println(sb.toString());
	    }

	}
}













