/*
	응용
	=> 정수를 1개 입력 받아서 -> 이진법 출력	
	32bit => 0,1 => 16bit (0~32767) => 양수
	0 , 15...
	
		10
		0000 0000 0000 1010 (뒤에서부터 채움)
 */
import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16]; // 0
		int index=binary.length-1; // = 마지막 인덱스 번호
		
		//역순으로 값을 배정
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767사이의 정수 입력 : ");
		int num=scan.nextInt();
		System.out.println("=== Lib ===");
		System.out.println(Integer.toBinaryString(num));
		
		while(true) // (범위가 지정되지 않음)
		{
			binary[index]=num%2;
			num=num/2;	// 1/2=0
			if(num==0) break;
			index--; //역순
		}
		// 출력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		

	}

}
