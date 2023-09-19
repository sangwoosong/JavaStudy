/*
 * 1) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 * 	  -------------
 * 		초기값 : 2
 * 		조건식 : <=100
 * 		증가식 : 2
 */
public class 문제_05_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0; //합을 누적할 변수
//		for(int i=0;i<=100;i++)
//		{
//			if(i%2==0)
//				sum+=i;
//		}
//		System.out.println("2+4+...100의 합 : "+sum);
		
		int sum=0; //합을 누적할 변수
		for(int i=2;i<=100;i+=2)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("2+4+...100의 합 : "+sum);

	}

}
