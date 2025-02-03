package hk.edu20250117.day09;

public class Util {

	//배열에 중복 숫자가 있는지 확인하는 메서드: 반환타입 boolean
	//배열하고, 숫자 하나에 대한 비교
	public static boolean isSame(int[] a, int b) {
		boolean isS = false;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == b) {
				isS = true;
				break;
			}
		}
		return isS;
	}
}
