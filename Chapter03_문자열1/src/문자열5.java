//정수를 2진법으로
import java.util.Scanner;
public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bin=new int[16];
		int index=15;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		System.out.println(Integer.toBinaryString(num)); // 2진법으로 바꾸는 메소드
		/* while(true) {
			bin[index]=num%2;
			num=num/2;
			if(num==0)
				break;
			index--;
		}
		for(int i=0;i<bin.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.println(" ");
			}
			System.out.print(bin[i]);
		} */

		int[] bin2=new int[16];
		int index2=15;
		Scanner scan2=new Scanner(System.in);
		System.out.println("정수 입력");
		int num2=scan.nextInt();
		System.out.println(Integer.toHexString(num2));

	}

}
