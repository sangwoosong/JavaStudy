package com.sist.lib;
// Random
import java.util.*;
/*
		Random => 임의의 수를 추출할때 사용
				  -------> 자바 JVM 에서
				  => Math.random() => double (계속 형변환 시켜줘야함)
		=> int nextInt(int bound) 핵심
					  -----------
					  	100 => 0~99 + 1
				nextInt(100)+1
 */
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z알파벳을 임의로 10개 출력
		Random  r=new Random();
//		for(int i=1;i<=10;i++)
//		{
//			char c=(char)(r.nextInt(26)+65);
//			System.out.print(c+" ");
//		}
//		for(int i=1;i<=6;i++)
//		{
//			int lotto=r.nextInt(45)+1; // 1~45
//			System.out.print(lotto+" ");
//		}
		int day=r.nextInt(7)+7; // 7~13
//		Set set=new HashSet();
		for(int i=1;i<=day;i++)
		{
			int rr=r.nextInt(31)+1;
				System.out.print(rr+" ");
//				set.add(rr);
		}
		System.out.println("\n=== 최종결과 ===");
//		for(Object obj:set)
//		{
//			System.out.print(obj+" ");
//		}
	}

}
