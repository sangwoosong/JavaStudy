/* 식별자 => 변수 / 상수 / 메소드 / 클래스 / 인터페이스
 * 
 * 			자바에서 제공하는 제어문
 * 			------------------
 * 			조건문 : 형식, 사용처
 * 				1) 선택문 : 값이 1개 => 키보드, 서버 프로그램 =>application
 * 					형식)
 * 						switch(정수 문자 문자열)
 * 						{
 * 							case 값:
 * 								실행문장
 * 								break; => 실행문장 수행 후 종료
 * 								------> 중복적으로 실행문장이 있는 경우에는 break 생략 가능
 * 							case 값:
 * 								...
 * 								...
 * 							default:	값이 없는 경우 실행문장
 * 						} => 버튼 클릭, 메뉴 선택
 * 
 * 
 * 				2) 단일 조건문
 * 
 * 					형식)
 * 						if(조건문) => 조건(true/false)
 * 						{			----------------> 비교연산자/논리연산자/부정연산자
 * 							조건이 true일때 처리 문장
 * 						}
 * 							=> 웹) 상세보기, 로그인, 아이디찾기 등..
 * 							=> 독립적이다 (if문마다 따로 수행)
 * 							=> 조건에 해당되는 모든 내용 출력
 * 
 * 				3) 다중 조건문
 * 					형식)
 * 						if(조건문)
 * 						{
 * 							조건 true일때 처리문장 => 문장 수행 중 종료
 * 							조건 false일떄 다음 if문을 찾아감
 * 						}
 * '					else if(조건문)
 * 						{
 * 							조건 true일때 처리문장 => 문장 수행 중 종료
 * 							조건 false일떄 다음 if문을 찾아감
 * 						}
 * 						else if(조건문)
 * 						{
 *							조건 true일때 처리문장 => 문장 수행 중 종료
 * 							조건 false일떄 다음 if문을 찾아감
 * 						}
 *						else
 * 						{
 * 							조건이 없는 경우 처리
 * 						}
 * 
 * 				4) *선택 조건문 : true와 false를 나눠서 처리
 * 					ㄴ 제어문 / 변수 / 연산자 => 자바스크립트, 오라클
 * 					형식)
 * 						if(조건문)
 * 						{
 * 							조건 true 일때 => 로그인시
 * 						}
 * 						{
 * 							조건 false 일때 -> 로그인 안한 상테
 * 						}
 * 						else
 * 				반복문 <65p>
 * 		-------------------	
 * 				DB단 - DBA
 * 				View단 - HTML, JS
 * 	     		Back단 - java
 * 
 * 
 * 					 종류 , 형식
 * 						1) 종류
 * 							*for => 반복 횟수가 있는 경우 <65p>
 * 								=>웹) 목록 출력, 쿠키출력 ...
 * 								  => 출력용 (javascript)
 * 							*while => 반복횟수가 없는 경우 => 선조건
 * 										서버 프로그램, 게임...
 * 										데이터베이스 프로그램, 파일 읽기
 * 										데이터 관리 (java)
 * 										int a=10;
 * 							while(조건문) a!=10
 * 							{
 * 								반복실행문장
 * 							}
 * 
 * 							do~while => 반복회수가 없는 경우 => 한번은 반드시 실핼할때 => 후조건
 * 								
 * 								do{
 * 									반복실행문
 * 								}while(조건문) a!=10
 * 
 * 				반복제어문
 * 			1) for => 2차 for (알고리즘) => 코테
 * 				형식)		  false => 종료
 * 
 *    					  1	=>	2 	<= 4
 * 					for(초기값; 조건식; 증감식)
 * 					{		   ----
 * 							true   ↗
 * 							 ↓3
 * 						반복 실행 문장
 * 					}
 * 
 *     				1 => 2 => 3 => 4
 *     					============
 *     				   	 2 => 3 => 4
 *     				 	============
 *    					 2 => 3 => 4
 *   					============
 *     					2 => false 일때까지 반복
 *   					  1		  2    4	==>	i=1 ~ i=10 i=11 false 종료
 * 					for(int i=1;i<=10;i++)
 * 					{
 * 							수행 3
 * 					}
 * 
 * 				초기값 : 조건식에 사용할 변수 선언 => 값은 한번만 사용
 * 				조건식 : 반복 횟수 => 반복문을 중단할지 여부 확인
 * 						false => 종료, true => 반복 수행
 * 				증가식 : 조건식이 false가 되는 조건을 만든다.
 * 				----
 * 				한개 ++
 * 				여러개 +=
 * 
 * 반복제어문
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("=====For문=====");
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello For문");
		}
		System.out.println("=====For문=====");
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello For문");
		}
		System.out.println("=====For문=====");
		for(int i=10;i>=0;i--)// 증감식
		{
			System.out.println("Hello For문");
		}
	}

}
