package com.sist.exception;
/*
		묶는 기술 => 객체지향 (누가 더 잘 묶어서 사용하는지) => 재사용
		
		1. 변수 묶는 방법
			- 배열 : 같은 데이터형 (메모리 크기가 동일해야함 => 연속적 메모리 구조)
					=> 인덱스 이용
			- 클래스 : 다른 데이터형 (메모시 주소(.))
		2. 연산자 / 제어문
			- 메소드 : 명령문을 묶어서 사용
		----------------------------------> 한개의 기능 => 부품 (컴포넌트)
		=> 조립 : 한개의 프로그램
		=> 게시판, 회원, 맛집, 채팅, 예약, 추천, 결제
		   -----------------------------------
		   영화 : 게시판, 회원, 예약, 추천, 결제
		   					--------------> 수정
	--------------------------------------------------------------------	   					
		1. 가독성		2. 최적화		3. 견고성
					   -----> Vue, React
					   
		1. 테스트 : 견고한 프로그램 => 사전에 에러를 방지하는 프로그램
								  ---> 예외처리
			견고 : 프로그래머의 실수, 사용자 입력이 잘못된 경우

		2. 예외처리
			- 정의 : 사전에 에러를 방지
			- 목적 : 비정상 종료를 방지하고 정상 종료를 할 수 있게 (에러를 건너뜀 => catch)
																	   ------
																	   에러 수정을 위한 확인
																	   에러를 복구
			1) 에러 복구 (try~catch)
			2) 에러 무시 => 에러 회피 (throws)
			3) 견고한 프로그램
			  -------------> 에러 발생(임의 발생) => throw
			4) 프로그램은 항상 모든 것을 지원하지 않음
				- 사용자 정의
				- 예약, 추천, 결제...
				- 사용자 정의 데이터형 Music, Movie ...
					=> 기존의 데이터형을 모아서 새로운 데이터형을 제작
						=> class
				- 사용자 정의 메소드
				- 예외처리가 없는 경우 => 사용자 정의 예외처리
				---------------------------------------
				결제모듈 => 보안처리 => 데이터베이스
				-------------------------------
					| 솔루션 => 개발, SM / 영업 => 운영
					| 50% 내근, 50% 외근
					 ------------------
					 인원 : 20명 (솔루션)
					 	   50명 (SI, 신규), 150명
			
			=> 예외복구
				형식)
					try
					{
						=> 정상적으로 수행할 수 있는 명령문
						=> 평상시 코딩
						문장 1
						문장 2
						--------
						문장 3 => 에러 발생 (3~5를 수행하지 않고 catch로 이동)
						문장 4
						문장 5
						--------> 무시
					}catch(예외처리 클래스)
					{
						=> try안에 있는 명령문에서 오류 발생시에 예외처리 / 복구
					} => 여러개 사용이 가능
					finally => 생략 가능 (필요한 경우에만)
					{
						=> try, catch를 수행하든 관계없이 무조건 수행하는 문장
							1) 서버 닫기
							2) 오라클 닫기
							3) 파일 닫기
					}
					
				실행)
					문장 1
					문장 2 
					try
					{
						문장 3
						문장 4
						문장 5
					}catch(예외처리 클래스)
					{
						문장 6
					}
					finally
					{
						문장 7
					}
					문장 8 => 종료
					
					1 > 2 > 3 > 4 > 5 > 7 > 8	=> try가 정상 수행시 catch(문장 6) 수행 x
													if ~ else
													
					try
					{
						문장 1
						문장 2 => C에러 발생
						문장 3
								int[] arr=new int[2]
								arr[2]=Integer.parseInt("10");
								
					}catch (A) (else if) 
					{
						A에 대한 에러 복구 => finally 이동
					}
					catch (B) (else if)
					{
						B에 대한 에러 복구 => finally 이동
					}
					catch (C) (else if)
					{
						C에 대한 에러 복구 => finally 이동
					}
					finally
					{
						닫기
					} 
					
					catch는 해당 영역에 한번만 수행 => 종료
		
					
 */
import java.io.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("C:\\javaDev\\movie.txt");
//			String data=""; // Ajax => 불러오기 느림
			StringBuffer sb=new StringBuffer(); // Vue => 불러오기 빠름
			int i=0;
			while((i=fr.read())!=-1)
			{
//				 data+=(char)i; // Ajax
				sb.append((char)i); // Vue
			}
			System.out.println(sb.toString()); // Vue
		}catch(IOException e)
		{
			// 오류 발생 => 에러 확인
			/*
			 		getMessage() => 에러메세지만 => null
			 		printStackTrace() => 권장
			 			 ------------
			 			 	ㅣ
			 			 	실행 => 순서 => 멈춤 => 에러 위치 확인
			 */
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(IOException e) {}
		}
	}

}
