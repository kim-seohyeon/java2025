package hk.edu20250122.day12;

//Card 클래스가 카드 한 장을 의미한다. Card[card멤버필드]
public class D4_Card {

	//카드 한 장을 저장할 필드 선언[그림+숫자]
	private String card; //"◆7"
	
	//카드를 만들기 위한 필드 선언
	public static final String[] DECK = {"◆", "♥", "♠", "♣"};
	public static final String[] STECK = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	
	public D4_Card() {
		init(); //card객체 생성하자마자 카드 생성
	}
	
	//카드 한 장 만드는 기능
	public void init() {
		int a = (int)(Math.random()*DECK.length); //0~3까지 숫자를 랜덤하게 생성
		int b = (int)(Math.random()*STECK.length); //0~12까지 랜덤 생성
		this.card = DECK[a]+STECK[b]; //"◆"+"7"
	}
	
	public String getCard() {
		return card;
	}
	
	//Object클래스의 메서드 중 toString()을 오버라이딩함
	@Override
	public String toString() {
		return "["+card+"]"; //주소@해시코드 x -> "[card]" 출력되게 재정의
	}
	
	//equals() 오버라이딩하기
	@Override			//list.contains(Card) --> listCard.equals(Card)
	public boolean equals(Object obj) { //obj <-- 새로 비교할 card객체 받음
		boolean isS = false;
		D4_Card ca = (D4_Card)obj; //Card -> Object -> Card 형 변환 과정
		if(card.equals(ca.getCard())) { //Card 객체 안에 card 멤버필드끼리 비교
			isS = true;
		}
		return isS;
	}
	
	//equals() 메서드를 오버라이딩하면 hashCode()메서드도 오버라이딩해야 함
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return card.hashCode()+137;
	}
	
	
	
	
	
}












