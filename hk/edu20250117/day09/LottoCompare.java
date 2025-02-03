package hk.edu20250117.day09;

import java.util.Arrays;
import java.util.Iterator;

public class LottoCompare {

	//추첨번호: 6개
	public static final D3_Lotto  lotto = new D3_Lotto(); //Lotto 객체 안에 lots 배열이 로또 한 장의 개념
	
	//구매한 로또의 번호
	public D3_LottoStore userBall;
	
	public LottoCompare() {
		this.userBall = new D3_LottoStore();
		
	}
	public LottoCompare(int n) {
		this.userBall = new D3_LottoStore(n);
	}
	
	//추천번호와 비교하는 메서드
	public void compareBall() {
		//추첨번호 출력
		System.out.println("추첨번호");
		int[] lots = lotto.getLots(); //Lotto객체에 lots 필드
		Arrays.sort(lots); //정렬하기
		System.out.println(Arrays.toString(lots));
		
		//사용자 구매 번호 출력
		System.out.println("사용자 구매번호");
		D3_Lotto[] userLots = userBall.lottos; //[Lotto, Lotto Lotto..
		for (int i = 0; i < userLots.length; i++) {
			Arrays.sort(userLots[i].getLots());
			System.out.println(Arrays.toString(userLots[i].getLots()));
		}
		
		//당첨번호 비교하기
		System.out.println("당첨번호 확인하기");
		for (int i = 0; i < userLots.length; i++) {
			int count = 0; //당첨번호 갯수
			
			System.out.println(Arrays.toString(userLots[i].getLots()));
			for (int j = 0; j < lots.length; j++) {
				if(!Util.isSame(userLots[i].getLots(), lots[j])) { //배열 하나와 숫자 하나를 전달해서 숫자와 같은 수가 있는지 판별
					System.out.println(lots[j]+" ");
					count++;
				}
			}
			System.out.println("당첨번호 갯수: "+count);
			
			//당첨번호 갯수에 의한 등수 출력: 메서드를 만들어서 따로 구현 --> result(count) --> 3개, 4개..
			lottoResult(count);
			
			System.out.println("----------------------------");
		}	
	}
	
	//당첨 갯수를 확인해서 등수를 출력하는 기능
	public void lottoResult(int count) {
		switch(count) {
		case 6: System.out.println("1등"); break;
		case 5: System.out.println("2등"); break;		
		case 4: System.out.println("3등"); break;
		case 3: System.out.println("4등"); break;
		case 2: System.out.println("5등"); break;
		default: System.out.println("다음 기회에.."); break;
		}
	}
	
	
	//파라미터 배열과 숫자 하나를 받아서 비교
//	public boolean isSame(int[] a, int b) {
//		boolean isS = false;
//		for (int i = 0; i < a.length; i++) {
//			if(a[i] == b) {
//				isS = true;
//				break;
//			}
//		}
//		return isS;
//	}
}
