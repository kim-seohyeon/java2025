package hk.edu20250122.day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class D3_MapTest {

	public static void main(String[] args) {
		
		//저장하는 형태 - K:V, K:V, K:V..
		//		--> javascript에서 json데이터 형식 {k:v, k:v, k:v..}
		Map<String, String> map = new HashMap<>();
		map.put("하나", "집"); //Key 값 중복X
		map.put("둘", "보내");
		map.put("셋", "주세요");
		
		System.out.println(map.get("하나")+map.get("둘")+map.get("셋"));
		
		//set은 출력 순서가 없음
		Set<String> setKeyMap = map.keySet(); //key값들을 Set으로 반환
		Iterator<String> iterKeyMap = setKeyMap.iterator();	//iterator객체로 반환
		while(iterKeyMap.hasNext()) { //값 존재 확인하기
			String str = iterKeyMap.next(); //값 가져오기
			System.out.println(map.get(str)); 
		}		
		
		//k:["1", "2", ...]: map 안에 list 객체를 넣을수도 있다.
		Map<String, List<String>> map2 = new HashMap<String, List<String>>();
		
		
	}
}
