/* for문에서는 시작점, 도착점 먼저 찾기 => 범위 지정이 끝
 * 		1차 for
 * 		for(시작점;어디까지;몇씩증가)
 * 			초기값  조건식  ++,+=
 * 		예) 1~100
 * 			int i=1 i<=100 i++
 * 		예) 1~100 => 홀수
 * 		-------------------------
 * 		문자는 정수 (문자는 모든 연산시 => 정수 변수)
 * 		for(int i=...
 * 			------> for문 블럭{} 안에서만 사용 가능 (소멸됨)
 * 		변수 사영 범위 {} 메모리 해제
 * 
 * 		{							/지역변수/
 * 			int a=10;			블럭 안에서만 사용 가능
 * 			{
 * 				int b=20;
 * 				{
 * 					int c=30;
 * 				}
 * 			}
 * 		}
 * 
 * 		중첩 for => 2차 for
 * 
 * 		for(초기값;조건식;증가식)
 * 		{
 * 			for (초기값;조건식;증가식)
 * 			{		  ----->핵심
 * 			}
 * 		}
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=1;i<=100;i+=2) 홀수
		//for(int i=2;i<=100;i+=2) 짝수       //꼭 i++만 쓰는건 아님 / 2씩 증가시 i+=2'
		
		for(int i=1;i<=4;i++) //줄 수
		{
			for(int j=1;j<=5-1;j++) // 실제 출력물
			{
				System.out.print("★");
			}
		System.out.println();
		}
		

	}

}
