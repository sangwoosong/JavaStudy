package com.sist.main2;
// 메모리 => 상위 클래스 => 상속받은 클래스 메모리 할당
class Super
{
	int a;
	public Super(int a)
	{
		this.a=a;
		System.out.println("Super 생성자 호출...");
	}
}
class Sub extends Super
{
	int a;
	public Sub()
	{
		super(100); // 상위클래스에 매개변수가 있는 생성자는 반드시 호출 후 사용
		// 상위클래스가 디폴트 생성자일때 생략 가능
		//super(); // 생략 가능 => 자동 추가됨 public Super()
		// Super super =new Super()
		a=1000;
		System.out.println("Sub 생성자 호출...");
		System.out.println("Sub:a="+a); // this.a 생략됨 // Sub
		// this = 자신을 나타내주는 객체형
		System.out.println("Super:a="+super.a); // Super
		// super = 상위클래스의 객체
		
		/*
					  heap
				-----------------
				 -----super-----
				 		a => super.a (Super > a 접근)
				 ---------------
				 
				 -----this------
				 		a => this.a (Sub > a  접근)
				 ---------------
				-----------------
		 */
	}
}
/*
		클래스 중 final 클래스
				-----
				public final class ()
								   -- 확장이 안되는 클래스 (상속을 못받음)
								   		보통 java.lang에 들어가있음 <217p>
								   		ㄴString, Math, System ...
								   		
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
	}

}
