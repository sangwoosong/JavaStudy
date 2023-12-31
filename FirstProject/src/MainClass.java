/*
 * 주석~~
 * 
 * 1. 프로젝트 명 설정
 * 2. src > java파일 생성
 * 		java : 단위가 클래스
 * 		클래스 생성
 * 		--------
 * 			1. 클래스는 대문자로 시작
 * 			2. 단어가 2개 이상일 경우
 * 			   시작하는 첫자는 대문자
 * 				or _ (Main_Class , File_Name)
 * 			3. 자바에서 숫자 표현
 * 						> 8진법
 * 							011
 * 						> 10진법
 * 						> 16진법
 * 							0xFF >HTML의 색상표
 * 						문자표현 : '한개의 문자만 사용이 가능'
 * 						 'AB' (X) > 'A', 'B', '흥'
 * 						문자열 표현 : "여러개의 문자열 사용이 가능"
 * 			4. 문장이 종료가 되면 ;
 * 			---------- 명령 수행
 * 			---------- 명령 = 순서 (알고리즘)
 * 			5. 들여쓰기
 * 			6. 자바 실행
 * 			-------
 * 									    컴파일											인터프리터
 * 				MainClass.java > 컴퓨터 인식(2진파일), javac > MainClass.class (bytecode) > 실행 (java) >
 * 				원시소스 (개발자만 알아보는 소스)
 * 			7. 프로그램 실행
 *         		------
 *         		컴파일 : 컴퓨터 인식언어로 변경
 *         				java, c, c++ 등
 *         		인터프리터 : 한줄씩 번역
 *         				   HTML
 *         		-------------------------
 *         		자바 : 컴파일 + 인터프리터
 *         				보안이 뛰어남
 *         		> 게임에 사용되는 언어 (세븐스타)
 *         			= 임베디드 > 모바일
 *         		> 그린 프로젝트 : 모든 기계를 리모콘 한개로 제어
 *         			> 1차 부도
 *         			> 데스케이프 (브라우저 업체) > 웹 발전
 *         		> 개별업체 (썬 마이크로 시스템)
 *         		> 자바언어 사용
 *         		> 제임스 고슬링 + 아서벤 > 둘의 이름을 함침 (JAVA)
 *         		> 1995년도 자바 탄생 (5/23)
 *         		> 1996년도 한국 상륙 > 2000년 (jsp)
 *         		> MS <싸움> 연합군 승 (오라클, 썬)
 *         		> MS (데이터베이스 : MS-SQL, Windows)
 *         		  SUN (솔라리스) > 인수 > MySQL
 *         		> 부도 2차 (오픈소스라)
 *         		> 오라클 인수 > JAVA 유료화
 *         		------------
 *         			I
 *         		java의 제작 (제임스 고슬링)
 *         					연봉 적어서 이직 > 구글 (GO)
 *         		> 모바일 (유료화 > 안드로이드 (자바 > Kotlin))
 *         			* 스프링 (오픈소스) > 준비(자바,코틀린)
 *         		-------------------------------------
 *         [자바 필수] *=핵심
 *         		*1) 변수 (한개의 데이터 저장)
 *         		   데이터형 (정수, 실수, 문자 ...)
 *         		2) 가공 : 연산자, 제어문
 *         		3) 데이터를 모아ㅓ 관리 : 배열 (같은 것만 모음)
 *         		4) 다른 데이터를 모아서 관리 : 클래스
 *         		*5) 클래스 : 재사용, 보안, 수정, 추가 > 객체지향 프로그램
 *         		*6) 예외처리
 *         		7) 라이브러리
 *         [추가적] IO(파일 입출력), *오라클 연결
 *         		
 */
public class MainClass {
	//프로그램의 시작점 > main은 반드시 한개 이상이 필요함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java!!");
	}

}
