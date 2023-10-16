package com.sist.main;
class A
{
	private int a;
	public A(int a)
	{
		this.a=a;
	}
//	public A()
//	{
//		
//	}
}
class B extends A
{
	public B(int a) {
		super(1); // public A(int a) 상위클래스에 매개변수가 있을 경우 반드시 호출
		// TODO Auto-generated constructor stub
	}
//	public B(int a)
//	{
//		super(a);
//	}
//	public B()
//	{
//		//super();
//	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
