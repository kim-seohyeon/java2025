package hk.edu20250123.day13;

//내가 Exception클래스를 구현하려면 Exception 클래스를 상속 받아야 한다.
public class D1_UserException extends Exception {
	
	public D1_UserException() {

		this("UserException 오류입니다.");
	}

	public D1_UserException(String msg) {
		super(msg); //super() 부모의 생성자 호출
	}

}
