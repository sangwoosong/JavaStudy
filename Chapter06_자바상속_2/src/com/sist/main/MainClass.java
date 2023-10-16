package com.sist.main;
/*
		상속
			자바상속
				1) 멤버변수 : static, private을 못받음
					ㄴ 접근 지정어 : public / protected / default / private
								 -------------------   -------  -------- 
								 		|				  |			상속은 받지만 접근은 불가능
								 패키지 관계없이 받음		패키지가 같은 경우
					=> 생성자, 초기화 블록은 못받음
				2) 메소드
				
		*** 클래스 여러개를 한개의 객체로 접근시에는 상위 클래스 이용
			ex)
				Student
				 |	 |
			HStudent UStudent
			
			HStudent h=new HStudent()
			UStudent u=new UStudent()
			-------------------------
			Student h=new HStudent)_
			h=new UStudent()
			
			*** 모든 클래스를 한개의 객체로 연결이 가능
				Object o=new MainClass()
				o=new MainClass1()...
				Object는 모든 데이터형을 묶어서 사용이 가능
			Object o=10;
			o=10.5;
			o=true; ...
			
			자바의 매개변수가 객체인 경우
			Object를 형변환 시킴 => 제네릭스
			
			형식
			class 하위클래스 extends 상위클래스
			=> 단일 상속만 가능
				다중상속은 불가능함
				
				class Man
				{
					String name;
					int age;
				}
				class Woman
				{
					String name;
					int age;
				}
				// 자바에서는 인터페이스 제외 존재하지 않음 (C언어에만 존재)
				class Human extends Man,Woman => 다중 상속
				{
					String name;
					int age;
					String name;
					int age;
				} => 변수가 중복됨
			
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
