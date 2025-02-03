package hk.edu20250117.day09;

import java.util.Iterator;

//Lotto객체를 생성하면 Lotto 한 장의 의미
public class D3_Lotto {

	//6개의 번호를 저장할 배열
	private int[] lots; //배열 선언
	
	//default 생성자
	public D3_Lotto() {
		lots = new int[6]; //번호 6개
		makeLotto(); //생성자 호출하면 바로 로또번호 생성 실행
	}
	
	//생성자 오버로딩
	public D3_Lotto(int n) {
		lots = new int[n];
		makeLotto(); //생성자 호출하면 바로 로또 번호 생성 실행

	}
	
	//1~45까지의 숫자를 랜덤하게 생성하는 기능
	public int makeBall() {
		//Math클래스에 random()메서드 활용
		//0부터 1사이의 실수를 반환: 0.000001 ~ 0.999999999
		//random()에서 반환되는 값 * 45 -->44.9999 --> 0 ~ 44 +1 -> 1~45
		return (int)(Math.random()*45)+1;
		
	}
	
	//1~45 사이에 숫자를 배열에 넣어주는 메서드
	public void makeLotto() {
//		for (int i = 0; i < lots.length; i++) {
//			lots[i] = makeBall(); //중복 숫자가 포함될 수 있음 --> 판별 필요
//		}
		
		int count = 0;
		while(count<lots.length) {
			int b = makeBall(); //랜덤 숫자 생성
			if(! isSame(lots, b)) {// 중복되는 숫자가 없을 경우
				lots[count++] = b; // 배열에 숫자 생성
			}
		}	
	}
	
	//배열에 중복 숫자가 있는지 확인하는 메서드
	//파라미터 배열과 숫자 하나를 받아서 비교
	public boolean isSame(int[] a, int b) {
		boolean isS = false;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == b) {
				isS = true;
				break;
			}
		}
		return isS;
	}
	
	//배열lots는 private으로 선언 --> 클래스내에서만 접근 가능
	//public 메서드를 통해 접근하도록 getter메서드 구현
	public int[] getLots() {
		return this.lots;
	}
	
}






















