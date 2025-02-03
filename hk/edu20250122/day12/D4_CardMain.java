package hk.edu20250122.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D4_CardMain {

	public static void main(String[] args) {
		//카드 한 장
//		D4_Card card = new D4_Card();
//		card.init();
//		System.out.println(card.toString());
//		
		//List에 card 객체 52장 담아보기
		//52장 출력도 해보기
		List<D4_Card> list = new ArrayList<D4_Card>();

		D4_CardCase cardCase = new D4_CardCase();
		
		System.out.println(cardCase.getCards().size());
		for (int i = 0; i < cardCase.getCards().size(); i++) {
			System.out.println(cardCase.getCards().get(i)+"\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}

	}

}
