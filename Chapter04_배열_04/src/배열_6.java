import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("=== 정렬 전 ===");
		System.out.println(Arrays.toString(arr));
		System.out.println("=== 정렬 후 ===");

	}

}
