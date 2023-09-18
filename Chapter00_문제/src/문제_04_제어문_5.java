/*
 * 5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
   60점 이하면 F를 출력하라 (다중 if 사용)
 */
import java.util.Scanner;
public class 문제_04_제어문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score;
//		Scanner scan=new Scanner(System.in);
//		System.out.print("점수를 입력해주세요(100점 만점) : ");
//		score=scan.nextInt();
//		System.out.println(score+"점");
//		
//		if(score>=90 && score<=100)
//		System.out.println("성적 = A");
//		
//		else if(score>=80 && score<=89)
//		System.out.println("성적 = B");
//		
//		else if(score>=70 && score<=79)
//		System.out.println("성적 = C");
//		
//		else if(score>=60 && score<=69)
//		System.out.println("성적 = D");
//		
//		else
//		System.out.println("성적 = F");
		
		int kor=(int)(Math.random()*51)+50;//0~100
		int eng=(int)(Math.random()*51)+50;
		int math=(int)(Math.random()*51)+50;

		System.out.println("국어 : "+kor+"점");
		System.out.println("영어 : "+eng+"점");
		System.out.println("수학 : "+math+"점");
		System.out.println("총점 : "+(kor+eng+math)+"점");
		double avg=(kor+eng+math)/3.0;
		System.out.printf("평균%.2f\n",avg);
		
		//학점
		char score='A';
		
		if(avg>=90)
			score='A';
		
		else if(avg>=80)
			
			score='B';
		
		else if(avg>=70)
			score='C';
		
		else if(avg>=60)
			score='D';
		
		else
			score='F';
		System.out.println("학점 : " + score);
	}
//랜덤 생성에 학점 평균까지 구하는거라 많이 달라짐..
}
