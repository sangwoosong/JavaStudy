// break => while , for => System.exit(0) (시스템 익싯은 아예 윈도우를 꺼버림)
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	i=1	j=1 j=2 j=3
		 *  i=2 j=1 j=2 j=3
		 *  i=3	j=1 j=2 j=3		==> 9
		 */
//		for(int i=1;i<=3;i++)
//		{
//			for(int j=1;j<=3;j++)
//			{
//				if(j==2)
//					break; //소속한 부분만 제어
//				System.out.println("i="+i+",j="+j);
//			}
//		}
//		System.out.println("===== continue =====");
//				
//		for(int i=1;i<=3;i++)
//		{
//			for(int j=1;j<=3;j++)
//			{
//				if(j==2)
//					continue; //소속한 부분만 제어
//				System.out.println("i="+i+",j="+j);
//			}
			System.out.println("===== 이름있는 break =====");
			outer:for(int i=1;i<=3;i++) //outer가 정확히 뭐지? => 그냥 이름 (다른 단어여도 됨)(근데 왜 어떤 기준으로 쓰는거지?)
			{
				for(int j=1;j<=3;j++)
				{
					if(j==2)
						break outer; //소속한 부분만 제어
					System.out.println("i="+i+",j="+j);
				}
			}
		

	}

}
