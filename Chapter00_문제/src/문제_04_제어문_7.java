/*
 * 7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
     (switch~case 사용) 

 */
//switch문을 어떻게 짜야할지 모르겠어서 전에 공부한거 참고 / scan.next() 기억하기
import java.util.Scanner;
public class 문제_04_제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1,num2;
//		int result=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.print("쳣번째 정수를 입력해주세요 : ");
//		num1=scan.nextInt();
//		System.out.print("두번째 정수를 입력해주세요 : ");
//		num2=scan.nextInt();
//		System.out.print("+,-,*,/중 하나 입력해주세요 : ");
//		
//		switch(scan.next())
//		{
//	case "+":
//		result=num1+num2;
//		break;
//	case "-":
//		result=num1-num2;
//		break;
//	case "*":
//		result=num1*num2;
//		break;
//	case "/":
//		result=num1/num2;
//		break;
//		default:
//			System.out.println("잘못된 연산자입니다!");
//	}
//			System.out.println("계산 결과값 "+result);

		int num1,num2;
		char op=' ';
		Scanner scan=new Scanner(System.in);
		System.out.print("쳣번째 정수를 입력해주세요 : ");
		num1=scan.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		num2=scan.nextInt();
		System.out.print("+,-,*,/중 하나 입력해주세요 : ");
		op=scan.next().charAt(0); //위와 다르게 변수를 선언해서 미리 받아옴 
		
		switch(op)
		{
	case '+':
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		break;
	case '-':
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		break;
	case '*':
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		break;
	case '/':
		if(num2==0) //오류처리
			System.out.println("0으로 나눌 수 없습니다.");
		else
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		break;
	default:
		System.out.println("잘못된 연산자입니다!");
	}
	}
}
