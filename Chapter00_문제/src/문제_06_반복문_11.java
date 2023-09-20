/*
 * 11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
 */
public class 문제_06_반복문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10;i++)
		{
			int a=(int)(Math.random()*100)+1;
			System.out.print(a+" ");
			if(a%2==0)
				count++; //hit
		}
		System.out.println("\n결과값 : "+count);

	}

}
