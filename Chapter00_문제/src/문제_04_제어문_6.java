/*
 * 6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
   		60점 이하면 F를 출력하라 (switch~case 사용)

 */
import java.util.Scanner;
public class 문제_04_제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score;
//		char grade=' ';
//		Scanner scan=new Scanner(System.in);
//		System.out.print("점수를 입력해주세요(100점 만점) : ");
//		score=scan.nextInt();
//		System.out.println(score+"점");
//
//		score=(int)score/10;
//		
//		switch(score)
//		{
//		case 10:
//		case 9:
//			grade='A';
//			break;
//		case 8:
//			grade='B';
//			break;
//		case 7:
//			grade='C';
//			break;
//		case 6:
//			grade='D';
//			break;
//		default:
//			grade='F';
//		}
//		System.out.println("성적 : "+grade);
		
		int kor=(int)(Math.random()*51)+50;//0~100
		int eng=(int)(Math.random()*51)+50;
		int math=(int)(Math.random()*51)+50;
		double avg=(kor+eng+math)/3.0;
		
		char score='A';
		int temp=(int)(avg/10);
		switch(temp) //정수 문자 문자열 case1 case '+" case
		{
		case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}
		System.out.println("성적 : "+score);
	}
//이것도 랜덤으로...
	
}
