package hk.edu20250122.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D4_CardCase {
    
	//멤버필드
	//card 52개 객체를 저장할 필드
	private List<D4_Card> cards;
	
	//카드의 총 장수를 저장할 필드: DECK * STECK = 4 * 13 = 52
	private static final int NUMOFCARDS = D4_Card.DECK.length
											*D4_Card.STECK.length;
	
	//생성자: 멤버필드 초기화!
	public D4_CardCase() {
		cards = new ArrayList<D4_Card>(); //객체 생성
		shuffle(); //cardcase객체가 생성되면 바로 52장의 카드가 생성됨
	}
	
	//메서드
	//카드 객체를 생성해서 cards에 추가해 줄 메서드
	public void shuffle() {
		int ii = 0;
		while(true) {
			D4_Card card = new D4_Card(); //카드 한 장 만들기
			if (!cards.contains(card)) { //중복확인
				cards.add(card); //중복 안 되면 추가
				ii++; //스택올리고
			}
			if(ii == NUMOFCARDS) { //52가 되면 종료
				break;
			}
		}
		
	}
	
	//private 접근 제한 --> 외부에서 접근할 수 있도록
	//메서드를 통해 접근하게 함
	public List<D4_Card> getCards(){
		return cards;
	}
	
}








