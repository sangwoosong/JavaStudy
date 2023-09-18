import java.util.Scanner;

public class 문제_04_제어문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int com=(int)(Math.random()*3); //012
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2): ");
		int user=scan.nextInt();
		
		switch(com)
		{
		case 0://컴퓨터 가위
			switch(user)//중첩 스위치 (스위치+이프 / 이프+스위치 등등 섞을 수 있음)
			{
			case 0:
				System.out.println("비김");
				break;
			case 1:
				System.out.println("사람이김");
				break;
			case 2:
				System.out.println("컴이김");
			}
			break;
		case 1://컴퓨터 바위
			switch(user)
			{
			case 0:
				System.out.println("컴이김");
				break;
			case 1:
				System.out.println("비김");
				break;
			case 2:
				System.out.println("사람이김");
			}
			break;
		case 2://컴퓨터 보
			switch(user)
			{
			case 0:
				System.out.println("사람이김");
				break;
			case 1:
				System.out.println("컴이김");
				break;
			case 2:
				System.out.println("비김");
			}
			break;
		}

	}

}
