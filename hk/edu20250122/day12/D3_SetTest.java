package hk.edu20250122.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D3_SetTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("set");
		set.add("set"); //중복값X
		set.add("get");
		set.remove("set");
		
		Iterator iter = set.iterator(); //Set --> iterator객체로 변환하여 반환
		while(iter.hasNext()) { //hasNext()는 set에 값이 존재하는지 확인
			String str = (String)iter.next();
			System.out.println(str);
			
		}
	}
}
