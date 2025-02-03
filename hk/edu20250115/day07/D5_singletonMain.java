package hk.edu20250115.day07;

public class D5_singletonMain {
	public static void main(String[] args) {
		D5_SingleTonTest st = D5_SingleTonTest.getInstance(); //생성자를 private으로 설정해서 오류
		st.print();
	}
}
																																																																						