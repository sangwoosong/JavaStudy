import java.util.Arrays;

public class 배열_3 {
	// 깊은 복사
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50};
		int[] arr2=arr.clone(); //arr의 메모리에 있는 모든 내용을 copy해 새로운 메모리에 저장
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr2));
		System.out.println("arr="+arr);
		//.out.println("arr2"+arr2);
		//깊은복사
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2)); // 다른 주소에 복붙한거라 arr이 바껴도 안바뀜
		// clone => prototype
	}

}
