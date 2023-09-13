/*1.
 * 
 * 2. 산술연산자
 * 		+ , - , * , / , %
 * 	   ---         --- ---
 * 		+ => 덧셈, 문자열 결합
 * 					"" => 문자열
 * 						=> 웹, 윈도우 (네트워크) => 데이터형이 없다 (문자열)
 * 		/ => 나눗셈, 0으로 나눌 수 없다, 정수/정수=정수
 * 		% => 나머지 : 부호 (왼쪽부호)
 * 
 * 	형변환 : 자동, 강제
 * 		   ----> 연산처리 => 연산 같은 데이터형만 가능
 *			int + double = double + double 
 *			int + (int)double = int + int
 */
import java.util.Scanner;
public class 문제_01_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		/*----------------------
		Scanner scan=new Scanner(System.in); //키보드 입력값을 읽어옴
		System.out.print("첫번째 정수 입력:");
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int b=scan.nextInt();
		or
		System.out.print("정수 두개 입력(10 20):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a-b);
		System.out.println(a*b);*/
		
		//위 : 입력값 받는거 ----------			밑 : 내가 직접 짠거---
		
		/*int a,b;
		
		a=(int)(Math.random()*100)+1;
		b=(int)(Math.random()*100)+1;
		
		System.out.println("12.");
		System.out.printf("입력된 숫자:%d, %d \n", a, b); //ln으로 두개의 숫자 나타내는 법 
		System.out.println("뺄셈 결과:"+(a-b)); //괄호에 안넣고 덧셈 뺄셈 가능한지
		System.out.println("곱셈 결과:"+a*b);
		System.out.println("================\n");
		----------------------------------------*/
		/*
		Scanner Scan=new Scanner(System.in);
		System.out.print("세개 정수 입력(1 2 3):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(a*b+c);
		*/
		/*-------------------------------------
		a=(int)(Math.random()*100)+1;
		b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		System.out.println("13.");
		System.out.printf("입력된 숫자:%d, %d, %d \n", a, b, c);
		System.out.println("결과:"+(a*b+c));
		System.out.println("================\n");
		----------------------------------*/
		Scanner scan=new Scanner(System.in);
		System.out.print("두개 정수 입력(10 20):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a%b);
		
		/*
		a=(int)(Math.random()*100)+1;
		b=(int)(Math.random()*100)+1;
		
		System.out.println("14.");
		System.out.printf("입력된 숫자:%d, %d \n", a, b);
		System.out.println("결과:"+a%b);
		System.out.println("================\n");
		*/
	}

}
