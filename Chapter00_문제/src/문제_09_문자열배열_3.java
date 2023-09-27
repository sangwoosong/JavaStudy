//

import java.util.Arrays;

public class 문제_09_문자열배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//word count
		int[] arr=new int[100];
		int[] count=new int[10];
		
		//초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		//빈도수
		for(int i:arr)
		{
			count[i]++;
		}
		
		for(int i=0;i<count.length;i++)
		{
			System.out.printf("count[%d]=%d\n",i,count[i]);
		}

	}

}
