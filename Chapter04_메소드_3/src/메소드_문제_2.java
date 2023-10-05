// 정수 1개 입력받아 3의 배수 여부 확인
import java.util.*;
public class 메소드_문제_2 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		return num;
	}
	
	static String check(int num)
	{
		String res=num+"3의 배수 아님";
		if(num%3==0)
		{
			res=num+" = 3의 배수";
		}
		return res;
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	
	static void process()
	{
		int num=메소드_문제_1.userInput();
		String res=check(num);
		print(res);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num=scan.nextInt();
	}

}
