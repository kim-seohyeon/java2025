package hk.edu20250117.day09;

import java.util.Arrays;

public class D3_LottoMain {

	public static void main(String[] args) {
		
		
		D3_Lotto lotto = new D3_Lotto(); //로또 한 장 생성
		//lotto.makeLotto();
		System.out.println(Arrays.toString(lotto.getLots()));
		
		System.out.println("-------------------");
		
		D3_LottoStore store = new D3_LottoStore();
		D3_Lotto[] lottos = store.lottos; //구매한 로또들
		
		for (int i = 0; i < lottos.length; i++) {
			System.out.println(Arrays.toString(lottos[i].getLots()));
		}
		
		LottoCompare compare = new LottoCompare();
		
		compare.compareBall();
		//로또 한장 생성(당첨번호): new Lotto()

		//로또 여러 장 생성(구매로또): LottoStore() - 5장
		
		//비교해서 일치 번호 비교해서 출력해보기
		
		//숫자 하나를 배열에서 일치하는 숫자가 있는지 판별하는 메서드
		
		//isSame()메서드
	}
}
