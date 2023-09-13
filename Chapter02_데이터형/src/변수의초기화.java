/*
 * 	변수의 초기화
 * 		1) 변수 추출
 * 		2) 변수 선언 (데이터형 생각)
 * 		3) 변수 초기화
 * 			ㄴ명시적 초기화
 * 				[int a=10;]
 * 			ㄴ입력값
 * 				[Scanner : 키보드 입력값을 받을 때 사용]
 * 				[BufferedReader : 예외처리]
 * 			ㄴ임의값(랜덤)을 받아서 초기화
 * 			ㄴ크롤링
 */
import java.util.Scanner;
//import = 자바에서 필요한 유틸을 가져옴
public class 변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=100;
		int b=(int)(Math.random()*100)+1; //왜 double은 안쓰지? =  0.0 and less than 1.0 랜덤값이 1 아래밖에 없기 때문
		Scanner scan=new Scanner(System.in);//키보드 입력값//
		System.out.print("정수 입력:");
		int c=scan.nextInt();
		System.out.println(c);*/
		
		int a=10;
		int b=20;
		// a=20, b=10
		System.out.println("a="+a+",b="+b);
		int temp=a; //값을 미리저장 / 정렬할때 사용
		a=b;; //a=20
		b=temp; //b=20
		System.out.println("a="+a+",b="+b);
	}
}
