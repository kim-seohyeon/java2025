package hk.edu20250122.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hk.edu20250117.day09.D3_Lotto;

public class D3_ListTest {

	public static void main(String[] args) {
		//제네릭: 형 변환을 미리 정의해주는 개념
		ArrayList<String> list = new ArrayList<String>(); //인터페이스 타입으로 객체 생성
					 list.add("집"); //값을 저장하면 자동으로 저장공간과 인덱스 생성
					 list.add("보");
					 list.add("내");
					 list.add("줘");
					 
		String str = list.get(0); //이미 String타입으로 변환해서 저장했기 때문에 다시 다운캐스팅할 필요없다.
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		list.remove(0);
//		list.clear();
		System.out.println(list.size());
		
		//Lotto객체 저장해보기
		List<D3_Lotto> lottoList = new ArrayList<D3_Lotto>();
		for (int i = 0; i < 5; i++) {
			lottoList.add(new D3_Lotto());
		}
		
		for (D3_Lotto d3_Lotto : lottoList) {
			System.out.println(Arrays.toString(d3_Lotto.getLots()));
		}
		
		//wrapper class(기본타입->참조타입)를 사용하면 기본타입도 저장할 수 있다.
		//  int 기본타입을 저장한다면... Integer 참조타입으로 형 변환 시켜줘야 한다
//		List<Integer> listInt = new ArrayList<E>
		
		
	}
}
