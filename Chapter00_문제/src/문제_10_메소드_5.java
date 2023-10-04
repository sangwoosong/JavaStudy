// 5. 1~n까지 합을 구하는 메소드 구현
//  매개변수(o), 리턴형 (x)
/*
 		메소드 사용시에 호출 
 						main()은 컴파일러에 의해 자동 호출
 											Call Back
 		메소드
 */
import java.util.Scanner;
public class 문제_10_메소드_5 {
	static void sum(int n)
	{
		int hap=0;
		for(int i=1;i<=n;i++);
		{
			hap+=i;
		}
		System.out.println("hap : "+hap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num=scan.nextInt();
		
		sum(num);
	}

}
