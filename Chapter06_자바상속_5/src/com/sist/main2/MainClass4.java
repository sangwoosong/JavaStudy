package com.sist.main2;
class Super
{
	
}
class Sub extends Super
{
	
}
// NullPointerException,  ClassCastException => 자주 생기는 오류
public class MainClass4 {
	static String str; // null값 초기화
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Super ssss;
		Super s=new Sub();
//		Sub ss=(Sub)new Super(); // ClassCastException = 형변환 오류
//		Sub ss=(Sub)s;
		char c=str.charAt(0);
//		Super sss=new Super();
//		Sub ssss=(Sub)sss;
		
	}

}
