/*
 * 3) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
 */
public class 문제_05_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(char c='B';c<='N';c+=2)
//		{
//			System.out.print(c+" ");
//		}
		for(char c='B';c<='N';c+=2)
		{
			if(c!='N')
			System.out.print(c+", "); //코마가 마지막에 안찍히게 하려고
			else
				System.out.println(c);
		}

	}

}
