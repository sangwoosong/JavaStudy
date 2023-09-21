/*
 * 7.	두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해 보세요.
 */
public class 문제_07_제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		while(true)
		{
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			System.out.println(a+"/"+b);
			sum++;
			
			if(a==b) 
			{
				System.out.println("반복 횟수 : "+sum);
				break;
			}
		}

	}

}
