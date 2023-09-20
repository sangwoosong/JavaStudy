/*
 * 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
   // 체크인할때 코딩
 */
import java.util.Scanner;
public class 문제_06_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b=scan.nextInt();
		int mul=1; // 합 구할땐 0, 곱 구할땐 1
				
		for(int i=a;i<=b;i++)
		{
			mul*=i; // 이걸 몰라서 못풀었음 (위에까진 다 ok)
		}
		System.out.println("결과값 : "+mul);

	}

}
