package com.sist.exception;
/*
		8장 => 예외처리
			  -------> 사전에 에러를 방지하는 목적
			  			비정상 종료를 방지하고 정상상태 유지
			  			예외처리 => 에러 발생시 에러를 건너뜀
		에러 발생
		-------
		 - 사용자 (잘못된 입력) => 유효성 검색 => javascript
		 					=> if 
		 - 개발자 (실수) => 배열 인덱스, 정수변환..., 형변환
		 ------------------
		 1) 사전에 차단 (if문에서 안되면 예외처리)
		 2) 예외처리
		 	------
		 		- 에러(Error) : 소스상에서 수정이 불가능한 에러
		 			ex) 메모리 저장공간 부족
		 		- 예외(Exception) : 소스상에서 수정이 가능한 에러
		 			ex) 파일경로명, IP, 0으로 나눔
		 				배열 인덱스 오류
		 				int[] arr=new int [2];
		 				arr[2]=10; // 0, 1
		 				
		=> 예외처리 방법
			- 예외복구 => try~catch
			- 예외회피 => throws
			- 임의발생 => throw
			- 지원하지 않는 예외 : 사용자 정의 예외처리
			
		=> 예외의 종류 (상속도의 가장 위에 있는 예외를 많이 잡음)
				Object : 모든 클래스의 상위 클래스
				  |
			  Throwable : 예외의 최상위 클래스
			 	  |
		---------------------
		|					|
	  Error				Exception
	  -----				---------
	  처리 불가능			처리 가능 (소스 변경)
	  메모리 부족				ㄴ 0으로 나누는 경우
	  윈도우 충돌				ㄴ 배열 인덱스 범위를 벗어나는 경우
	  톰캣 작동 불가			ㄴ 형변환, 파일명, IP
	  오라클 연결 불가
	  -------------
	  
	  	Exception : 예외처리의 최상위 클래스
	  	----------
	  		|
	  		| 1. [CheckException]
	  		|	- 컴파일시에 예외처리를 했는지 확인
	  		|	- 라이브러리 중에 반드시 예외처리	
	  		|	- java.io
	  		|		ㄴ 파일명이 틀린 경우
	  		|		ㄴ FileNotFoundException
	  		|		ㄴ IOExeption
	  		|	- java.net
	  		|	 	ㄴ URL주소, IP가 틀린 경우
	  		|		ㄴ MalformedURLException
	  		|	- java.sql
	  		|	ㄴ 오라클 URL : SQLException
	  		| 		jdbc:oracle:thin:@localhost:1521:XE
	  		|								   ------
	  		|								   	연결포트
	  		|	- 충돌 염려 => 쓰레드 InterruptedException
	  		| 	- ClassNotFoundException
	  		|-------------------------------------------
	  		|
	  		| 2. [UnCheckException]
	  		|	- 확인이 없기 때문에 필요시
	  		|	- RuntimeException => 예외를 확인할 수 없음
	  		|	  ----------------
	  		|		실행시 에러
	  		|			ex) 1~100 사이의 정수 입력..
	  		|	- NumberFormatException : 문자열로 받아서 정수로 변경시
	  		|		ㄴ 웹에서 가장 많이 발생
	  		|		ㄴ http://localhost/main/main.jsp?page=10
	  		|		ㄴ 웹에서는 URL을 이용해서 데이터 전송
	  		|		ㄴ 자바는 메소드의 매개변수를 이용해서 전송
	  		|	- 실수 : 33대란
	  		|		ㄴ String s="100,00" => 
	  		|   - ArrayIndexOfOutBoundsException: 
     		|		ㄴ 배열의 인덱스 범위를 벗어나는 경우
    		|		ㄴ NullpointerException:null만 클래스를 사용한 경우
            |            				   ------ 주소가 없는 경우
            |	- ArithmaticException : 0으로 나누는 경우
            |		
            |		=> 에러 예상 :
           	|			문자열로 정수를 받아서 배열에 저장한 다음에 나누기
           	|			----------		  ---------		  -----
           	|			NumberFormatException				ArithmaticException
			|								 ArrayIndexOfOutBoundsException
			|		=> 사전에 에러 방지 => 예측
			|	- ClassCastExeption : 형변환
 */
import javax.swing.*;
class A
{
	public void aaa() {System.out.println("A:aaa()");}
}
class B extends A
{
	public void aaa() {System.out.println("B:aaa()");}
}
public class MainClass_1  extends JFrame{
	  
	   JButton b1,b2;
	   
	   public MainClass_1()
	   {
	      
	      b1=new JButton("로그인");
	      b2=new JButton("취소");
	      add("North",b2);
	      setSize(300,300);
	      setVisible(true);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A();
//		B b=(B)a;
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//System.out.println(Integer.parseInt("10"));
	      
	      //int[] arr=new int[2];
	   //   arr[2]=100;
	   //   System.out.println(arr[2]);
	      

	}

}
