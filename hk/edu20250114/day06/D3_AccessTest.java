package hk.edu20250114.day06;

public class D3_AccessTest {

	//멤버필드
	public  int a; //모두 접근 가능
		    int b; //패키지 내부에서만 접근 가능
    private int c; //클래스 내부에서만 접근 가능
    
    
    //메서드
    public void aa() {}
    void bb() {}
    private void cc() {}
    
    //은닉화: 데이터를 숨겨놓고 조건에 따라 공개
    //직접 접근을 못하게 하고 메서드를 통해서 접근 가능하게 구현
    public int getC(int code) {
    	if(code==3) {
    		return c;    		
    	}else {
    		return 0;
    	}
    }
    
    public void setC(int c) {
    	this.c = c;
    }
    
}
