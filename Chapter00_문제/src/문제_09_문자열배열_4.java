import java.util.Arrays;

public class 문제_09_문자열배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//초기값
		// Random r=new Random() => r.nextInt(100) => 라이브러리를 배우면 이렇게
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			// double random() => 0.0~0.99
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("인덱스가 1인 곳의 값 : "+arr[1]);
	}

}
