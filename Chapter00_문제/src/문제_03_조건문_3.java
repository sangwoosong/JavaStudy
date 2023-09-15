/*
 * 1학년부터 4학년까지 중간고사 시험을 보았다. 
   4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
   이를 판단하는 프로그램을 작성해보자.
   점수가 0미만 100초과이면 경고문구 출력!
중첩조건문
 */
import java.util.Scanner;
public class 문제_03_조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("학년을 입력해주세요(숫자) : ");
//		int grade=scan.nextInt();
//		System.out.print("점수를 입력해주세요(숫자) : ");
//		int score=scan.nextInt();
//		
//		if(grade<1 || grade>4)
//		{
//			System.out.println("1~4사이의 학년을 입력해주세요.");
//		}
//		if(score<0 || score>100)
//		{
//			System.out.println("0~100사이의 점수를 입력해주세요.");
//		}
//		
//		if(score>0 && score<100 && grade>1 && grade<4)
//		{
//		System.out.printf("입력된 학년과 점수는 %d학년, %d점 입니다.\n",grade, score);
//		
//		
//		if(grade==4 && score>=70)
//		{
//			System.out.println("합격입니다.");
//		}
//		if(grade<=3 && score>=60)
//		{
//			System.out.println("합격입니다.");
//		}
//		
//		if(grade==4 && score<70)
//		{
//			System.out.println("불합격입니다.");
//		}
//		if(grade<=3 && score<60)
//		{
//			System.out.println("불합격입니다.");
//		}
//		}
		int hak;
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.print("학년을 입력해주세요(1~4) : ");
		hak=scan.nextInt();
		System.out.print("점수를 입력해주세요(숫자) : ");
		score=scan.nextInt();
		
		if(score<0 || score>100)// 잘못된 입력 처리
			{
				System.out.println("경고☞ 잘못된 입력입니다");
			}
		if(score>=0 && score<=100) //정상 입력 처리
		{
			if(hak==4) //4학년
			{
				if(score>=70)
				{
					System.out.println("합격");
				}
				if(score<70)
				{
					System.out.println("불합격");
				}
			}
			if(hak<4) //1~3학년
			{
				if(score>=60)
				{
					System.out.println("합격");
				}
				if(score<60)
				{
					System.out.println("불합격");
				}
			}
		}

	}
//조금 더 압축 할 필요 있음, if(score>0 && score<100 && grade>1 && grade<4) => = 기호를 빠트림
}
