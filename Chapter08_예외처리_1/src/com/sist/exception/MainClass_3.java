package com.sist.exception;
import java.sql.Connection;
import java.sql.DriverManager;
// 다중 catch => 에러마다 따로 처리
/*
 	=> 에러 코드 => 계층 구조 확인 => 크기 (순서가 존재)
		try
		{
			문자열 => 정수로 변환 에러
		}catch(Exception e) // 여기서 다 처리됨 (맨 마지막으로 내려가야함)
		(작은 것) {
		}catch(NumberFormatException e)
		{
		}catch(NullPointerException e)
		
						Throwable
						---------
							|
					-----------------
					|				|
				  Error			Exception
				  					|
				  			------------------
				  		  Check			  UnCheck
				  			|	 순서상관없음	 |
				  			|	   <=>		 |
				  		IOException	  		RuntimeException
				  		SQLException		 |
				  							NumberFormatException
				  							...
 */
// 문자열을 입력받아 정수로 변환 후 배열에 첨부, 배열에 있는 값 나누기
import java.util.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String s1=scan.next();
		// <input type=text>
		System.out.print("정수 입력 : ");
		String s2=scan.next();
		
		try
		{
			int[] arr=new int[2];
			arr[0]=Integer.parseInt(s1); // 정수형 변환 <271p>
			arr[0]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result = "+result);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("정수 변환을 할 수 없습니다");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의 범위를 벗어났습니다");
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}catch(RuntimeException e)
		{
			System.out.println("실행시 에러...");
		}catch(Exception e)
		{
			System.out.println("기타 에러 발생...");
		}catch(Throwable e)
		{
			System.out.println("에러와 예외처리를 잡는다");
		}
		System.out.println("프로그램 종료");
		// RuntimeException, Throwable
		// SQLException
	}
	

}
