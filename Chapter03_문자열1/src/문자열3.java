/*
 * 
 */
import java.util.Scanner;
public class 문자열3 {
// 문자열 입력을 받아서 A,a가 몇개인지 확인
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String data=scan.next();
		
		int count=0; // A||a
		// charAt => 문자를 한개씩 자르는 경우에 사용
		//
		for(int i=0;i<data.length();i++) // = 붙이면 오류남 => 문자 카운트는 0부터인데 가져오는건 1부터 시작함
		{
			char c=data.charAt(i);
			if(c=='A'||c=='a')
				count++;
		}
		System.out.println("A|a의 갯수는"+count+"개입니다.");
	}

}
