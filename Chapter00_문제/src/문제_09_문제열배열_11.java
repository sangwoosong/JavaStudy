import java.util.Arrays;

public class 문제_09_문제열배열_11 {

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
		
		for(int i:arr)
		{
			if(i%3==0)
				System.out.println(i+" ");

}

	}

}
