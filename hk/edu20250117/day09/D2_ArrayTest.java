package hk.edu20250117.day09;

import java.util.Arrays;
import java.util.Iterator;

public class D2_ArrayTest {

	//생성자를 통해 초기화
	public int [] test;
	public int [][] test2; //2차원배열 [][]: [[1, 2, 3],[1, 2, 3],[1, 2, 3]]
	
	public D2_ArrayTest() { //기본 생성자
		test = new int[3];
		test2 = new int[3][3];
	}
	
	public D2_ArrayTest(int n) { // 생성자 오버로딩
		test = new int[n];
		test2 = new int[n][n];
	}

						//m:2, n:3
	public D2_ArrayTest(int m, int n) { //생성자 오버로딩
		test = new int[m];
		test2 = new int[m][n]; //[[1, 2, 3], [1, 2, 3]]
	}
	
	
	public static void main(String[] args) {
		//선언 방법
		//1. 리터럴 방식: 기본처럼 선언하는 방법
		//			   변수 선언과 값을 동시에 정의
		int[] a = {1, 2, 3, 4, 5, 6}; 
		int[] b; //선언만..
		//b = {1, 2, 3, 4}; //선언과 초기화를 따로 할 수 없다.
		b = a; //주소 복사하는 경우는 가능
		System.out.println("인덱스로 값을 가져온다: "+b[1]); //2 출력
		
		//값을 가져오고 저장하는 방법: index를 이용
		int c = b[1]; //가져오기
				b[0]=10; //저장하기
		//System.out.println(b[0]); //10출력
		
//		int[] cc = []; //js []
//		int[] cc = {}; //java {}
		
		//2. new를 사용해서 정의하는 방법
		int[] b2 = new int[] {5, 2, 4, 3, 1};
		int[] b3;
			  b3 = new int[] {1, 2, 3, 4, 5};
	    int[] b4 = new int[5]; //선언, 정의(자릿수), 초기화(X)
	    b4[0]=6; b4[1]=7; // -->[6, 7, 0, 0, 0]
	    
	    for (int i = 0; i < b4.length; i++) {
			System.out.println(b4[i]);
		}
		
	    //Arrays 클래스: 배열을 다루는데 편리한 기능을 제공
	    //toString(): 배열 안에 값을 문자열로 반환
	    System.out.println(Arrays.toString(b2));
	    //sort(): 배열 안에 값을 정렬
	    Arrays.sort(b2); //mutable하다 = 원본의 값이 변경된다
	    System.out.println(Arrays.toString(b2));
	 
	    //shallow copy(얕은 복사: 주소 복사)
	    int[] c2 = {1, 2, 3, 4, 5};
	    int[] d = c2; //주소 --> 전달(복사)
	    d[0] = 50;
	    System.out.println(Arrays.toString(c2));
	    
	    //deep copy(깊은 복사: 값 복사)
	    int[] e = new int[] {1, 2, 3, 4, 5};
	    int[] f = new int[5];
	    for (int i = 0; i < e.length; i++) {
			f[i] = e[i];
		}
	    f[0] = 60;
	    System.out.println(Arrays.toString(e));
	    System.out.println(Arrays.toString(f));
	    
	    //깊은 복사를 제공하는 메서드
	    //System.arraycopy(): 깊은 복사 기능 제공
	    int[] g = new int[5];
	    System.arraycopy(f, 0, g, 0, g.length); //(원본 배열, 원본시작인덱스, 복사받는배열, 복사시작인덱스, 길이)
	    g[1] = 30;
	    System.out.println(Arrays.toString(f));
	    System.out.println(Arrays.toString(g));

	    //2차원 배열 사용하기
	    int [][] aa = new int[][] {{1, 2, 3, 4},{5, 6, 7, 8}};
	    int [][] aaa = new int[2][4];
	    for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[0].length; j++) {
				aaa[i][j] = j+1;
				
			}
		}
	    System.out.println(Arrays.toString(aaa[1]));
	    // json --> ["k":[{"a":"1","b":"2"},{"c","3","d","4"}]]
	    
	    //2차원 배열에서 내부 배열의 열 길이가 다를 경우 {{1,2,3},{1,2,3,4}}
	    int [][] a4 = new int[2][]; //두번째[]를 비워둔다.
	    a4[0] = new int[] {1,2,3};
	    a4[1] = new int[] {4,5,6,7};
	    
	    //배열 변환 방법
	    //2차원 --> 1차원 변환
	    int[][] bb = new int[][] {{1,2,3},{4,5,6}}; //2*3=6
	    int[] b1 = new int[bb.length*bb[0].length]; //{1,2,3,4,5,6}
	    //공식: i*col(열)+j
	    //	   i와 j는 for문의 변수 i와 j를 의미, col은 2차원 배열의 내부 배열 길이
	    //     i*col(열)+j = 0*3+0 = 0
	    //     i*col(열)+j = 0*3+1 = 1
	    //     i*col(열)+j = 0*3+2 = 2
	    //     i*col(열)+j = 1*3+0 = 3
	    //     i*col(열)+j = 1*3+1 = 4
	    //     i*col(열)+j = 1*3+2 = 5	    
	    for (int i = 0; i < bb.length; i++) {
			for (int j = 0; j < bb[0].length; j++) {
				b1[i * bb[0].length + j] = bb[i][j];
			}
		}
	    System.out.println("2차원->1차원: " + Arrays.toString(b1));
	    
	    //1차원 --> 2차원 변경
	    //공식: [i/col][i%col]: i는 for문의 변수 --> 1차원 베열의 인덱스
	    //[0/3][0%3] [1/3][1%3] [2/3][2%3] [3/3][3%3] [4/3][4%3] [5/3][5%3]
	    //  0    0     0    1     0    2     1    0     1    1     1    2
	    int [][] bbb = new int[2][3];
	    int col = bbb[0].length;
	    
	    for (int i = 0; i < b1.length; i++) {
			bbb[i/col][i%col] = b1[i];
		}
	    for (int i = 0; i < bbb.length; i++) {
	    	System.out.println(Arrays.toString(bbb[i]));
			
		}
	    
	    
	    
	    
	    
	}
}
