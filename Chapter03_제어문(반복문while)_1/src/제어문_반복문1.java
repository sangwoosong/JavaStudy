/*
 * 		웹
 * 		--> 변수 , 연산자 , 제어문 , 메소드 , 클래스 , 인터페이스 , 예외처리
 * 						 ------
 * 						   ㄴ if / for / while / break
 * 
 * <71p>
 * -------while => 반복문 => 반복 횟수가 없는 경우 (횟수가 있을때 써도 되지만 없을때 많이 씀)
 * 			| 사용처 :
 * 			  		데이터베이스 연동, 파일 읽기
 * 					형식)
 * 						초기값
 * 						while(조건문)
 * 						{
 * 							반복수행문장
 * 							증가식
 * 						}
 * 						예)
 * 							int i=1;
 * 							while(i<=10)
 * 							{
 * 								System.out.println(i);
 * 								i++
 * 							}
 * 					순서)
 * 						초기값 ----------- 1
 * 						while(조건문)----- 2 ------> false - 종료 / true - 문장 수행
 * 						{
 * 							반복수행문장 --- 3
 * 							증가식 ------- 4
 * 						}
 * 						
 * 
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for =====");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
		}
		
		System.out.println("===== while =====");
		int i=1;
		while(i<=10)
		{
			System.out.println(i+" ");
			i++;
		}
		

	}

}
