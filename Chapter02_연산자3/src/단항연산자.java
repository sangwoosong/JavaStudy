//증감연산자, 부정연산자, 형변환연산자
import java.util.Scanner;
//1개의 정수를 입력 받아서 한개를 증가한 값을 출력하시오
/*
 *	1. a++
 *	2. ++a
 *	3. a+=1
 *	4. a=a+1
 */
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int a; Scanner scan=new Scanner(System.in); System.out.print("정수 입력:");
		 * a=scan.nextInt();
		 */
		 
		
		//1개 증가
		//a++;
		//++a;
		
		//n개 증가
		//a+=10;
		//a=a+10;
		
		int a=1;
		int b=a++;
		/* = int a=1;
		 * 	 int b=a;
		 * 	 a++;
		 */
		
		System.out.println("a="+a); //왜 +1돼서 나오는거지..? => 대입 먼저 된 후 계산이 됨 (ex. a=1, b=a(++) => a=2 b=a(++))
		System.out.println("b="+b);

/*		System.out.println("=== 부정연산자 ===");
		
		//bCheck 다시 공부 + 밑 코드 한번 뜯어보기
		boolean bCheck=true;
		System.out.println("변경전:"+bCheck);
		bCheck=!bCheck;
		System.out.println("변경후:"+bCheck);*/
		
		/*
		boolean aa=true;
		while(true)
		{
			aa=!aa; // 주고받는 구문
			if(aa==true)
			{
				System.out.println("사용자");
			}
			else
			{
				System.out.println("컴퓨터");
			}
		}*/
	}

}
