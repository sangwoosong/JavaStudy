/*
		문자 10개를 저장
		저장된 문자 출력
		저장된 문자 꺼꾸로 출력 => length-1
 */
public class 배열_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65); // A~Z
		}
		System.out.println("=== 정상 출력 ===");
		for(char c:arr)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n=== 거꾸로 출력 ===");
		for(int i=arr.length-1;i>=0;i--) // 항상 0으로 시작하진 않음 
		{
			System.out.print(arr[i]+ " ");
		}
		// Arrays.sort() => ASC => DESC (번대로 출력)
	}

}
