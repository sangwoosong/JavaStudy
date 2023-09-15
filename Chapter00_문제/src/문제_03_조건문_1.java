import java.util.Scanner;
/*
 * 문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
 */
public class 문제_03_조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int num1=scanner.nextInt();
		if(num1>=50)
		{
			System.out.println(num1+"는(은)50 이상입니다.");
		}
		if(num1<=50)
		{
			System.out.println(num1+"는(은)50 이하입니다.");
		}

	}
//완벽하게 함
}
