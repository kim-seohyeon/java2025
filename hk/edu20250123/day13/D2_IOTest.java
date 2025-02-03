package hk.edu20250123.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class D2_IOTest {

	public static void main(String[] args) {
		
//		test01();	
		test02();
	}
	
	//파일 읽고 출력하기
	public static void test01() {
		InputStream in = null; //입력 파이프 선언
		OutputStream out = null; //출력 파이프 선언
		
		try {
			in = new FileInputStream("C:\\Users\\hkedu\\Hello.java");
			out = new FileOutputStream("C:\\Users\\hkedu\\outputHello.txt");
			
			int i = 0; //byte단위로 읽어서 데이터를 저장할 변수
			while((i = in.read()) != -1) { //파일 읽는 메서드: read()
				System.out.print((char)i);
				out.write(i); //파일 출력하는 메서드: write()
			}
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			//multi catch를 할 경우
			//작은 범위의 클래스들을 먼저 처리하고, 마지막에 Exception으로 처리
		}
		finally {
			//스트림은 사이 끝나면 반드시 종료해야 한다.
			//마지막에 사용한 것부터 닫는다.
			try {
				if(out != null) {
					out.close();					
				}
				if(in != null) {
					in.close();					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//한번에 읽을 때 크기를 설정해서 읽고 쓰기
	public static void test02() {
		InputStream in = null; //입력 파이프 선언
		OutputStream out = null; //출력 파이프 선언
		
		try {
			in = new FileInputStream("C:\\Users\\hkedu\\Hello.java");
			out = new FileOutputStream("C:\\Users\\hkedu\\outputHello2.txt");
			
			//10byte단위로 읽기
			byte[] b = new byte[10]; //{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
			int i = 0; //읽어들인 갯수가 저장
			while((i = in.read(b)) != -1) { //파일 읽는 메서드: read()
				out.write(b); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 
							  //[51, 52, 53, 54, 55, 46, 47, 48, 49, 50]
							  //10개씩 읽고 남은 5개가 위와 같이 저장되면 출력할 때 문제가 됨.
				out.write(b, 0, i); //b배열의 0번째부터 i갯수의 길이만큼 출력
			}
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			//multi catch를 할 경우
			//작은 범위의 클래스들을 먼저 처리하고, 마지막에 Exception으로 처리
		}
		finally {
			//스트림은 사이 끝나면 반드시 종료해야 한다.
			//마지막에 사용한 것부터 닫는다.
			try {
				if(out != null) {
					out.close();					
				}
				if(in != null) {
					in.close();					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
}









