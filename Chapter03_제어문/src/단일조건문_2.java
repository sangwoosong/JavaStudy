import java.util.Scanner;
/*
 * 		정수 입력을 1개 받는다
 * 		>>11
 * 		같은 숫자입니다
 * 		>>88
 * 		>>77
 */
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("0~99사이의 수 입력 : ");
		int num=scan.nextInt();
		if(num>=0 && num<100)
		{
			//int a=num/10;
			//int b=num%10;
		if(num%11==0)//(a==b)
		{
			System.out.println("같은 숫자입니다.");
		}
		if(num%11!=0)//(a!=b)
		{
			System.out.println("다른 숫자입니다.");
		}
		}
		if (num<1 || num>99)
		{
			System.out.println("1~99사이의 숫자를 입력해주세요.");
		}
	}

}
