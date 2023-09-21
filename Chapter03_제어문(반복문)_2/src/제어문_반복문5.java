/*
 * 		★
 * 		★★
 * 		★★★
 * 		★★★★ ==> 2차 for문의 조건식
 * 
 * 		줄수 별표
 * 		 1	 1
 *		 2	 2
 *		 3	 3
 * 		 4	 4		===> i=j	=>	j<=i
 * -----------
 * 		★★★★
 * 		★★★
 * 		★★
 * 		★
 * 
 * 		줄수 별표
 * 		 1	 4	|	역순 => 더한다 5
 *		 2	 3	5
 *		 3	 2	5
 * 		 4	 1	5
 * 		----------> i+j=5 => j=5-i
 * -----------
 * 		A
 * 		BC
 * 		DEF
 * 		GHIJ
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++) // 조건만 바꾸면 됨
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5-i;j++) // 조건만 바꾸면 됨 /수의 관계, 공식만 알면 쉬움
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		char c='A';
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) // 거꾸로 = ;j<=5-i;
			{
				System.out.print(c++);
			}
			
			System.out.println();
		}
	}

}
