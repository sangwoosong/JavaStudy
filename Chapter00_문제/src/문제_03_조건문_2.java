/*
 * 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
 * -----------------		---------
 * 		변수						조건문
 */
import java.util.Scanner;
public class 문제_03_조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 하나를 입력해주세요 : ");
//		int num1=scan.nextInt();
//		
//		if(num1<3)
//		{
//			System.out.println("3 이상의 정수를 입력해주세요.");
//		}
//		if(num1%3==0)
//		{
//			System.out.println(num1+"는(은)3의 배수입니다.");
//		}
//	if(num1%3!=0 && num1>3)
//		{
//			System.out.println(num1+"는(은)3의 배수가 아닙니다.");
//		}
		
		int num=(int)(Math.random()*100)+1;
		if(num%3==0)
			{
				System.out.println(num+"는(은)3의 배수입니다.");
			}
		if(num%3!=0)
			{
				System.out.println(num+"는(은)3의 배수가 아닙니다.");
			}
	}
//거의 비슷하게 함
}
