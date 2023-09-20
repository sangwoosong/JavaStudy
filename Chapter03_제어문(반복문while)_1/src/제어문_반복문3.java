/*
 * 
 */
import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math;
		int total;
		double avg;
		Scanner scan=new Scanner(System.in);
		
		/*[아래 while문 3개보다 간단하게]
		 * 	for(int i=1;i<=3;i++)
		 * 		{
		 * 			while(true) // (true)
					{
						System.out.print("국어점수 : ");
						kor=scan.nextInt();
						if(kor>=0 && kor<=100)
							{
								break;
							}
					}
		 * 		}
		 * 
		 * 각각 다른 변수 (kore,eng,math)는 어떻게? => 배열로
		 */
		while(true) // (true)=무한루프 => 반드시 종료 조건 (break)
		{
			System.out.print("국어점수 : ");
			kor=scan.nextInt();
			if(kor>=0 && kor<=100)
			{
				break; // 종료
			}
		}
		while(true) 
		{
			System.out.print("영어점수 : ");
			eng=scan.nextInt();
			if(eng>=0 && eng<=100)
			{
				break; 
			}
		}
		while(true) 
		{
			System.out.print("수학점수 : ");
			math=scan.nextInt();
			if(math>=0 && math<=100)
			{
				break; 
			}
		}
		
		total=kor+eng+math;
		avg=total/3.0;
		
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f ",avg);

	}

}
