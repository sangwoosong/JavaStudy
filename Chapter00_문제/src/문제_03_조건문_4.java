/*
 * 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
   합계와 평균을 구해보자.
   
   변수 : 3개의 정수, 최대값과 최소값, 합계와 평균

 */
import java.util.Scanner;
public class 문제_03_조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int num1,num2,num3;
//		System.out.print("첫번째 정수를 입력해주세요 : ");
//		num1=scan.nextInt();
//		System.out.print("두번째 정수를 입력해주세요 : ");
//		num2=scan.nextInt();
//		System.out.print("세번째 정수를 입력해주세요 : ");
//		num3=scan.nextInt();
//		
//		int max=num1;
//		if (max<num2)
//			max=num2;
//		if (max<num3)
//			max=num3;
//		System.out.println("최댓값 : "+max);
//		
//		int min=num1;
//		if (min>num2)
//			min=num2;
//		if (min>num3)
//			min=num3;
//		System.out.println("최소값 : "+min);
//		
//		System.out.println("합계 : "+(num1+num2+num3));
//		
//		double avg=(num1+num2+num3)/3.0;
//		System.out.printf("평균 : %.2f\n",avg);
		
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.println(a+","+b+","+c);
		System.out.println("합계 : "+(a+b+c));
		System.out.printf("평균:%.2f\n",(a+b+c)/3.0);
		
		int max=a;
		if (max<b)
			max=b;
		if (max<c)
			max=c;
		System.out.println("최댓값 : "+max);
		
		int min=a;
		if (min>b)
			min=b;
		if (min>c)
			min=c;
		System.out.println("최소값 : "+min);
	}
//평균 구할때 더블 변수를 굳이 선언 안해도 됨 (강제 형변환)
}
