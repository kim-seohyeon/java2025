package hk.edu20250116.day08;

public class D1_StringMethod {

	public static void main(String[] args) {
		String str = sTest01("java는 객체 지향 프로그래밍 언어 입니다.", 6);
		System.out.println(str);
		System.out.println();
		String str2 = "국민의힘 정당 지지도가 더불어민주당을 앞섰다는 여론조사 결과가 16일 나왔다.";
		System.out.println(sTest02(str2));
		System.out.println();
		sTest04();
		System.out.println();
		System.out.println(sTest05(str2, 0, 6));
		System.out.println();
		
		search("정당");
		
	}
	
	//String 주요 메서드 연습
	
	// 1. 문자 하나를 반환
	//	  문자열에서 문자 추출 -> "문자열" -> '문'(char타입으로 반환)
	// charAt(index)
	public static String sTest01(String s, int index) {
		char c = s.charAt(index);
		String ss = c+""; //문자열을 만나면 문자열이 됨. (char -> String 형 변환)
		String ss2 = String.valueOf(c);
		
		//또 다른 예시) 문자열을 int형으로 변환
		int i = Integer.parseInt("100"); //"100" --> 100 int형으로 변화
		return ss;
		
	}
	
	//2. 문자열의 인덱스를 반환하는 indexOf()
	// "ABCD" 문자열에서 
	// "ABCD".indexOf("C") --> 반환값은 2 (해당 인덱스)
	// "ABCD".indexOf("E") --> 반환값은 -1 (존재하지 않는다)
	// "ABCD".indexOf("BC") --> 반환값은 1 (해당 문자열의 첫 번째 인덱스)
	// 종류: indexOf(), lastIndexOf()
	
	public static String sTest02(String s) {
		int num1 = s.indexOf("여론조사");
		int num2 = s.indexOf("정당");
		int num3 = s.lastIndexOf("결과");
		
		//존재한다면.. 존재하지 않는다면... 조건에 -1 활용
		if(s.indexOf("국민") != -1) { //존재한다면
			System.out.println("\"국민\"이라는 단어가 존재합니다.");
			
		}
		return num1+","+num2+","+num3;
	}
	
	//3. 문자열의 길이 반환: "abcd".length() --> 4
	
	//4. 문자열의 내용 변환: replace("원본", "새로운 내용")
	public static void sTest04() {
		String s = "java프로그래밍java객체지향java는쉬워요";
			   //s.replace("java", "C#"); //immutable하기 때문에 원본이 바뀌지 않음
			   //s = s.replace("java", "C#");//결과를 새로 대입해야 적용 된다
			   s = s.replace("쉬워요", "하기싫어요");
	    System.out.println(s);
	}
	
	//5. 문자열 추출하기: substring()
	//substring(sindex): 해당 인덱스부터 끝까지 추출
	//substring(sindex, eindex): 시작 인데스와 종료 인덱스 -1까지 추출
	//				0,		5		--> 실제로는 0~4번 자리까지 추출
	public static String sTest05(String s, int si, int ei) {
		return s.substring(si, ei);
	}
	
	//예제:
	//문자열에서 특정 검색어가 존재하는지 판단하여 존재하면 해당 검색어를 추출하고, 출력하기
	//위 작업을 반복하여, 특정 검색어가 몇 개가 나오는 지 갯수도 출력하는 프로그램 구현
	//indexOf("검색어", 시작인덱스): 설정한 인덱스부터 검색한다.
	//"국민의힘 정당 지지도가 정당 더불어민주당을 정당 앞섰다는 여론조사 결과가 16일 나왔다."
	//"정당"이라는 문자열이 존재하는지 찾아서 추출하기 indexOf(), substring(), length()
	
	public static void search(String keyword) {

		String s="국민의힘 정당 지지도가 정당 더불어민주당을 정당 앞섰다는"
				+ " 여론조사 결과가 16일 나왔다.";
		
		if(s.indexOf(keyword)!=-1) {
			int count=0;//검색된 개수
			int idx=0;//검색 시작 인덱스           // 01  4      1+3=4
			while(s.indexOf(keyword,idx)!=-1) {    // "abcde" -> "bcd"
				String ss=
				  s.substring(s.indexOf(keyword,idx),s.indexOf(keyword,idx)+keyword.length());
				System.out.println("검색어"+(++count)+":"+ss);//검색어 추출
				idx=s.indexOf(keyword,idx)+keyword.length();//검색 시작 인덱스 구하기
				System.out.println("=========================\n");
			}
			System.out.println("더이상 검색어가 존재하지 않습니다.");
			System.out.println("검색된 총 개수는 "+count+"입니다.");
		}else {
			System.out.println("검색어가 존재하지 않습니다.");
		}
		
	}
	
	
}














