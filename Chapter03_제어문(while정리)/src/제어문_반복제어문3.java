import java.util.Scanner;
public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 123456789 메뉴들 9번은 종료
		while(true)
		{
			System.out.println("메뉴 선택 : ");
			int menu=scan.nextInt();
			if(menu<1 || menu>9) // 없는 메뉴 선택
			{
				System.out.println("없는 메뉴 입니다.");
				continue; // 조건식으로 이동 (처음부터 실행)
			}
			if(menu==9)
			{
				break; //while만 종료
				//System.exit(0); => 프로그램 전체종료를 시켜 뒷 내용을 진행 못해서 오류가 뜸
			}
			System.out.println(menu+"번 메뉴를 선택하셨습니다.");
		}
		System.out.println("프로그램 종료");
	}

}
