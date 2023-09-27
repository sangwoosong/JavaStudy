import java.util.*;
public class 문제_09_문자열배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//초기값
		// Random r=new Random() => r.nextInt(100) => 라이브러리를 배우면 이렇게
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(arr));

		for(int i=0;i<arr.length;i++)
		{
			if(i==3)
				continue; //인덱스가 3인 것을 제외 => 증가식으로 이동
			System.out.print(arr[i]+" ");
		}
	}

}
