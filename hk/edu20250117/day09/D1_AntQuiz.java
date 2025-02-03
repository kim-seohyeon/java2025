package hk.edu20250117.day09;

public class D1_AntQuiz {
	
	public static void main(String[] args) {
		
		D1_AntQuiz ant = new D1_AntQuiz();
		ant.antPrint(20);
	}

	//"11" ---> "12"로 변환해서 반환해 주는 메서드
	public String antMake(String s) {
		//"11" --> 0번째 값과 다음 값을 비교
		//		   같으면 count 올리고, 다르면 count는 1로 초기화
		//		   					 "1"+count -> "12"
		char c = s.charAt(0); //일단 문자열의 첫번째 값을 추출해 오기
		int count = 1; //최소 1개가 있으니까 1로 설정, 연속된 같은 숫자의 갯수를 저장하는 변수
		String t = ""; //최종 만들어지는 숫자열을 저장하는 변수
		
		//변수 i는 문자열의 인덱스로 이용 -> 이미 0번째는 추출한 상태이므로, 1부토 시작
		//"112111"
		for (int i = 1; i < s.length(); i++) {
			if(c == s.charAt(i)) { //0번째와 1번째..2번째 비교
				count++;
			}else {
				t = t + c + count; //String + char + int = String
				count = 1; //count 초기화
				c = s.charAt(i); //카운트할 대상 숫자를 업데이트
			}
		}
		t = t + c + count; //마지막 숫자를 반영하기 위해 한 번 더 실행
		return t;
	}
	
	public void antPrint(int num) {
		String s = "1";
		for (int i = 0; i < num; i++) {
			s = antMake(s);
			System.out.println(s);
		}
	}
}
