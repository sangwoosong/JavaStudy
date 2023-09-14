/*
 * 농구공 5개씩 한 박스에 들어간다. 40개면 8상자,26개면 6상자이다 
    삼항연산자를 이용해서 구현하시오

 */

import java.util.Scanner;
public class 문제_02_연산자 {

	public static void main(String[] args) {
		//01 => 총페이지 만들때 쓰임
//		Scanner scan=new Scanner(System.in);
//		System.out.print("농구공 갯수 : ");
//		int ball=scan.nextInt();
//		System.out.println(ball%5==0?ball/5:ball/5+1);
		
		//답
		Scanner scan=new Scanner(System.in);
		System.out.print("농구공 갯수 : ");
		int ball=scan.nextInt();
		//System.out.println("필요한 박스 : "+(ball%5==0?ball/5:ball/5+1));
		System.out.println("필요한 박스 : "+(int)(Math.ceil(ball/5.0))); // => 더 간략하게 가능 (라이브러리 배울때)(자주 사용)

	}

}
