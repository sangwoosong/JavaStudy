/*
 * 2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
 * if : 3의 배수 조건 ~ else : 3의 배수가 아닐 경우
 */
import java.util.Scanner;
public class 문제_04_제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num;
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수를 입력해주세요 : ");
//		num=scan.nextInt();
//		
//		if(num%3==0)
//		{
//			System.out.println(num+"는(은)3의 배수입니다.");
//		}
//		else
//		{
//			System.out.println(num+"는(은)3의 배수가 아닙니다.");
//		}

		int num=(int)(Math.random()*100)+1;//1~100
		if(num%3==0)
			{
				System.out.println(num+"는(은)3의 배수입니다.");
			}
			else
			{
				System.out.println(num+"는(은)3의 배수가 아닙니다.");
	}
//직접 입력받는거 말고는 다를 점 없음
	}
}
