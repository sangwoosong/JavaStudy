/*
 * 9)100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
 */
public class 문제_05_반복문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0; //이미 선언됐을 경우 : sum=count=0; (코마 금지)
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("4의 배수가 아닌 수의 갯수 : "+count);
		System.out.println("7의 배수가 아닌 수의 합 : "+sum);

	}

}
