package hk.edu20250113.day05;

public class D1_StarView {

	public static void main(String[] args) {
		
		
		/*
		 	1. 왼쪽 삼각형
		  			  1 2 3 4 5 6........... +1 증가
			0 ★		  An = a1 + (n+1)*d
			1 ★★	  4 = 1 + (4-1)*1 --> 1+(i-1)*1 -> 1-i-1
			2 ★★★    	  1 + n*1 --> 1+n -> 1+i
			3 ★★★★		 --> n(자릿수)에 -1을 할 필요없음
			4 ★★★★★		--> 0부터 시작하니까
						 a1 + n*d 를 적용하면 된다.
		
		 */		
				
		//140p 6번
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i-1; j++) {
				System.out.print("*");
				//System.out.print("");
			}
			System.out.println(); //줄바꿈
		}
		System.out.println("----------------------");
		System.out.println();
		
		/*
		 2. 오른쪽 -> 왼쪽 삼각형
		 	 ☆☆☆☆★ 공백을 출력하는 코드: 식 필요 -> 4 3 2 1 0...
		 	 ☆☆☆★★ 		4 + i*(-1) = 4-i
		     ☆☆★★★ 별을 출력하는 코드: 식 필요 -> 1 2 3 4 5...
		     ☆★★★★ 		1+i
		     ★★★★★ 
		 */		
		
		int num = 10;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-1-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1+i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		System.out.println("------------------------");
		System.out.println();
		
		// 3. 피라미드 * 출력
		/*
		 0 ☆☆☆☆★
		 1 ☆☆☆★★★     공백을 출력하는 코드: 식 필요 -> 4 3 2 1 0 .... 공차: - 1
		 2 ☆☆★★★★★			4-i
		 3 ☆★★★★★★★	별을 출력하는 코드: 식 필요 -> 1 3 5 7 9 ... 공차: +2
		 4 ★★★★★★★★★		-1+i*2
				  
		*/
		int num2 = 10;
		for (int i = 1; i < num2; i++) {
		    for (int j = 1; j < num2 -1 - i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		System.out.println("------------------------");
		System.out.println();
		
		//역피라미드
		/* 
		 0 ★★★★★★★★★
		 1 ☆★★★★★★★ 	공백을 출력하는 코드: 식 필요 -> 0 1 2 3 4 .... 공차: +1
		 2 ☆☆★★★★★			0 + i*1 --> i
		 3 ☆☆☆★★★ 		별을 출력하는 코드: 식 필요 -> 9 7 5 3 1 ... 공차: -2
		 4 ☆☆☆☆★			-2*i+9
		 
		 				5층일 때 첫 시작 갯수 9개 --> 5*2-1 = 9
		 				10층일 때  첫 시작 갯수 ?개 --> 10*2-1 = 19
		 */
		
		for (int i = 1; i < 5; i++) {
		    for (int j = 1; j < i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 1; j <= -2 * i + 9; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		/* 5.아래방향 직각삼각형
		   ★★★★★ 5 4 3 2 1 .. 5-i
		   ★★★★
		   ★★★
		   ★★
		   ★		   
		 */
		
		for(int i = 0; i <5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		/* 6. 아래방향 직각삼각형
			★★★★★
		     ★★★★
		      ★★★
		       ★★
		        ★
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*위쪽삼각형*/
		
		/*
		 7. 다이아몬드 
		 	  ☆☆★☆☆ 5-i 		1 3 5 3 1 
		  	  ☆★★★☆ 5-2*i
		  	  ★★★★★
		  	  ☆★★★☆
		  	  ☆☆★☆☆
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-2*i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < args.length; j++) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
