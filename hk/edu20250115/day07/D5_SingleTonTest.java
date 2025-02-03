package hk.edu20250115.day07;

import java.security.PublicKey;

public class D5_SingleTonTest {

	//싱글톤패턴: 객체를 한 번만 생성하게 하여 사용
	//- 해당 객체를 사용할 때 new를 사용 -> 생성자를 호출 못하게 하자
	private static D5_SingleTonTest singletonTest;
	private D5_SingleTonTest() {} //외부에서 접근 못하게
	public static D5_SingleTonTest getInstance() {
		if(singletonTest == null) { //객체가 생성 안 된 경우만 생성
			singletonTest = new D5_SingleTonTest(); //
		}
		return singletonTest;
	}
	
	public void print() {
		System.out.println("싱글톤패턴 완성");
	}
	
}



