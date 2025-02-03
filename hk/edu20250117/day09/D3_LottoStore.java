package hk.edu20250117.day09;

public class D3_LottoStore {
	
	//lotto 객체 여러 개가 저장
	public D3_Lotto[] lottos; //{Lotto, Lotto, Lotto...}
	
	//2차원배열 --> 이 예제에서는 활용X
//	public D3_Lotto[][] lottos2;
//	public D3_LottoStore(int m, int n) { //m행 n열
//		lottos2 = new D3_Lotto[m][n];
//	}

	//default 생성자
	public D3_LottoStore() {	
		this.lottos = new D3_Lotto[5]; //기본 5장 구매
		makeLotto();
	}

	//생성자 오버로딩
	public D3_LottoStore(int n) {	
		this.lottos = new D3_Lotto[n]; //기본 n장 구매
		makeLotto();
	}
	
	public void makeLotto() {
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = new D3_Lotto();
		}
	}
	
}
