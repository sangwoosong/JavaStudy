package com.sist.main;
/*
		1. 접근지정어 : 접근이 가능한 범위 설정
			1) private : 멤버변수선언
				ㄴ 자신의 클래스에서만 사용 가능 = 은닉화
					private String id;
					private String pwd;
			2) default : 윈도우 (버튼, 기타 컴포넌트)
				ㄴ 접근 범위 - 같은 패키지에 있는 클래스
					int num;
					JButton btn;
			3) protected : 거의 사용빈도가 없음
				ㄴ 접근 범위 - 같은 패키지에 있는 클래스, 다른 패키지까지 접근 가능 (상속)
			4) public : 생성자, 클래스. 메소드 => 다른 클래스와 통신
				ㄴ 접근 범위 : 패키지 상관 없이 모든 클래스에 접근 가능
				
			private < default < protected < public
			--------------------------------------
				오버라이딩 => 접근지정어의 축소는 불가능, 확장은 가능
				
		2. 관련된 클래스를 모아서 관리 => 찾기 편함
		  ----------------------> 패키지 (폴더 개념) => 클래스별 분리
		  패키지 명칭 - 키워드 사용 불가능
		  	com(org).회사명.분리단위
		  	--------------------
		  	vo - 클래스형 데이터
		  	dao - 데이터베이스 연동
		  	model - 브라우저로 전송
		  	manager - 크롤링, 파일
		  	service - 데이터베이스 여러개를 한번에 처리 (JOIN, SUBQUERY)
		  	-----------------------------------------------------
		  	패키지가 다른 경우 (다른 폴더에 클래스가 저장)
		  		=> 반드시 import를 이용해서 클래스를 읽어옴
		  	패키지가 같은 경우
		  		=> import 없이 클래스 사용 가능
		  		   ------> 라이브러리만 사용하는 것이 아니라 사용자 정의 클래스도 사용
		  		   import com.sist.dao.*
		  		  					  ---> 여러개 사용시에는 *
		  		  					  	   한개 사용시에는 클래스명 지정
		  	*** 자바소스 코딩의 형식
		  		package - 한번만 사용이 가능
		  		import - 여러개 사용이 가능
		  			public class ClassName
		  			{
		  				멤버변수선연
		  				생성자
		  				멤버메소드
		  				{
		  					변수선언은 지역변수 => 메소드 호출이 종료되면 자동으로 사라짐
		  				}
		  				가독성 => 지금 순서로 코딩
		  			}
		  	**패키지를 사용하면 
         	default로 선언된 메소드 ,변수 , 생성자는 사용할 수 없다 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
