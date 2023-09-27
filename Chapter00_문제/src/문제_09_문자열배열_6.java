import java.util.*;
public class 문제_09_문자열배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//초기값
		// Random r=new Random() => r.nextInt(100) => 라이브러리를 배우면 이렇게
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		//총합 / 평균
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("총합 : "+sum);
		System.out.printf("평균 : %.2f\n",sum/10.0);
		
	}

}
