package com.sist.exception;
/*
		1. 자바 문법 => 변수 / 연산자 / 제어문
					  사용자 정의 클래스
					  	ㄴ 멤버변수 / 메소드 / 생성자
					  	ㄴ 클래스의 종류 - 인터페이스
					 에러 방지 - 예외처리
					 
				예외처리 : 사전에 에러를 방지하는 프로그램
							= 비정상 종료를 방지하고 정상 수행
					자바에서 지원하는 예외처리
						1) 고려 => if => 예외처리
						2) 예외처리 대상
							- CheckedException : 컴파일시에 예외처리가 되어있는지 확인
								=> 반드시 예외처리를 함
									io(입출력), net(네트워크), sql(오라클 연결)
							- UnCheckException : 사용자의 입력에 따라 ...
						3) 예외처리 방법
							- 예외복구 : 에러를 받아서 처리 (catch)
								형식)
									try
									{
										=> 정상수행 할 수 있는 소스코드
										=> 모든 소스, 부분 소스
									}catch(예외처리 종류)
									{
										=> try에서 에러가 발생시 처리하는 문장
										=> 복구는 거의 없음
										=> 에러의 위치
											printStackTrace()
										=> 에러 정보
											getMessage()
										=> 에러 수정 목적
									}
									=> catch는 여러개 사용이 가능, 전체 Exception
									finally
									{
									 => 생략 가능
									 => 사용처 : 서버 종료, 오라클 연결 해제, 파일 닫기...
									 => 에러가 발생(o), 에러 없는 경우
									 	-------------------------
									 	try 수행 (정상 수행), catch (에러가 있음)
									 	-----------------------------------
									 	무조건 수행하는 문장
									}
									
								동작 순서
									try
									{
										문장 1
										문장 2
										문장 3
									}
									catch(Exception e)
									{
										문장 4
									}
									finally
									{
										문장 5
									}
									try에 에러 문장이 없는 경우
										1 > 2 > 3 > 5 => catch절은 통과 (finally는 수행)
									------------------------
									try
									{
										문장 1
										문장 2 => 에러 발생
										문장 3
									}
									catch(Exception e)
									{
										문장 4
									}
									finally
									{
										문장 5
									}
									try에 에러 문장이 있는 경우
										1 >  > 4 > 5 => catch절 수행
									
							- 예외회피 : JVM에 미리 알려줌 => RuntimeException은 생략이 가능
									   이런 에러가 발생할 수 있음을 고지
								문법)
									메소드() throws 예외처리의 종류 ...
									메소드() throws Exception, NumberFormatException
										
										예외처리 순서가 없음
											- try~catch => 예외처리 순서 (상속도)
											- throws => 예외처리 순서 없음
											- throws 문장을 사용할때는 try 위치
												=> 이미 소스가 완료된 상태에서 에러 처리
						*4) 예외처리 목적 : 프로그램 종료
							ex) 로그인 => 입력이 안된 상태 => 종료
								=> 개인 정보 누출 => 자바스크립트
						=> 라이브러리 뒤에 많이 붙어있음
						   ----------
						   - throws
						   - try~catch를 이용할 수 있음
						   
						   		ex)
						   			void insert() throws Exception
						   				=> insert를 호출하기 위해서는 예외처리를 하고 사용
						   					void method()
						   					{
						   						insert() => 오류
						   					}
						   					
						   					=> void method() throws Exception
						   						{
						   							insert()
						   						}
						   						or
						   						void method()
						   						{
						   							try
						   							{
						   								insert()
						   							}catch(Exception ex){}
						   						}
							
		임의 발생 => 테스트
		지원하지 않는 예외 => 사용자 정의 예외
									   
		2. 라이브러리 => 암기
			java.lang
				- Object, String, StringBuffer, Wrapper
			java.util
				- Date, Calendar, StringTokenizer
				- Collection
					ㄴ ArrayList, HashSet, HashMap
			java.io
				- 업로드 / 다운로드 => 파일 관련
			java.net : 흐름 (크롤링 => 프로젝트) URL
			* java.sql : 자바에서 오라클 연동
				- Connection, Statement, ResultSet
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
