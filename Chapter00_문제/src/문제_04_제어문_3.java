/*
 * 3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
 */
import java.util.Scanner;
public class 문제_04_제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		num=scan.nextInt();
		
//		if(num>0)
//		{
//			System.out.println(num+"의 절대값은 "+(num-num*2)+"입니다.");
//		}
//		else
//		{
//			System.out.println(num+"의 절대값은 "+(num-num*2)+"입니다.");
//		}
		int result=0;
		if(num>0)
			result=num*-1;
		else
			result=num;
			System.out.println(num+"의 절대값은 "+Math.abs(num)+"입니다.");
	}

}
