package com.sist.main;
/*
		객체지향 목적
			1. 데이터 손실 방지 - 캡슐화 (변수 private(은닉화-보이지 않는다 가장), 기능을 처리)
									 ---> 저장/읽기 = getter/setter
									 	  HTML(Jsoup)
			2. 재사용 - 상속 / *포함
			3. 수정 / 추가 - 유지보수 
				=> 다형성 (오버라이딩/오버로딩)
				
		상속 : 재사용
		 ㄴ 상위클래스 - 상속을 내리는 클래스 => 공통적으로 사용하는 내용 (변수, 메소드)
		 ㄴ 하위클래스 - 상속을 받는 클래스 => 재사용 및 확장 (extends)
		   -------- 확장
			   | 여러개의 하위 클래스를 묶어서 사용 = 상위 클래스를 이용
			   | 단일 상속, 키워드 (extends)
			   |
			*1) 있는 그대로 사용 (변경 없이) = 포함
				class Window 
				{
					JFrame fr=new JFrame() => 더 많이 사용
				}
			2) 변경해서 사용 = 상속
				class Window extends JFrame
			
		new를 사용하지 않아도 메모리 할당이 가능 (리플렉션)
		
		
		사용법
			class A
			class C
			class B extends B,C => 오류 (C언어, React에서 사용)
			-----------------------------------------------
		   	class A
			class C extends A => A, C
			class B extends C => A, C, B
			=> 상속을 받은 클래스가 메모리는 큼
			=> 클래스의 크기는 위로 올라갈수록 큼 (범위) = 공통기반이 많음, 구체화
			
					ex)
						생물
						 |
					----------
					|		 |
				   동물		식물
				    |
			----------------
			|	 |    |    |
		  포유류 양서류 조류 ...
		   |
		-------
		|  |  |
	   인간 소 개
	   |
	 -----
	 |   |
	남자 여자
	 |
   홍길동 => 상속 (위로 올라갈수록 커짐)
   	
   						class A
   						class B extends A	A>B => is-a (상속)
   						
   						class A
   						class B
   						{
   							A a=new A()		B>A => has-a (포함)
   						}
   						
   		상속의 예외 조건 - static : 상속은 없지만 공통 사용이 가능
   					  - private : 상속은 되지만 접근이 불가능
   						------------
   					  - 생성자
   					  - 초기화 블록
   					  	------------
   		메모리 할당
   		여러개를 묶어서 사용할때 상위클래스로 메모리 할당
   		확장된 클래스로 메모리 할당
   		----------
   		class A
   		class B extends A => B, A
   		class C extends A => C, A
   		class D extends A => D, A
   		class E extends A => E, A
   		=> B b=new B()
				   
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
