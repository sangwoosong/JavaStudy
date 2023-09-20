/*
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 
 * 		줄수 별표
 * 		 1	 5
 *		 1	 5
 *		 1	 5
 * 		 1	 5
 * 	줄수 for(int i=1;i<=4;i++)
 * 	별표 for(int j=1;j<=5;j++)
 * --------
 * 	ABCDE
 * 	FGHIJ
 * 	KLMNO
 * 	PQRST
 * --------
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 * --------
 * ★☆☆☆
 * ☆★☆☆
 * ☆☆★☆
 * ☆☆☆★
 */
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
//		char c='A'; // i 시작 상관없이 A부터 쭉
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=4;i++)
//			{
//				for(char j='A';j<='E';j++)
//				{
//					System.out.print(j);
//				}
//				System.out.println();
//			}
//		for(int i=1;i<=4;i++)
//		{
//			char c='A'; // for문 안에 있냐 밖에 있냐 따라 다름 // i가 새로 시작할때 A부터 시작
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j) // 같은줄 같은 번째는 검은별
				{
					System.out.print("★");
				}
				else
				{
					System.out.print("☆");
				}
			}
			System.out.println();
		}
	}

}
