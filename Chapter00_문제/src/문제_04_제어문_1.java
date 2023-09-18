//1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
/*
 * 		if(양수 조건)
 * 		{
 * 		}
 * 		else
 * 		{
 * 		}
 * 		=> if (조건문) ==> a>=0
 * 			{
 * 				조건 true 일때 수행
 * 			}
 * 			else
 * 			{
 * 				조건 false 일때 수행
 * 			}
 */
// 웹 => 아이디중복, 로그인, 관리자/사용자, 아이디찾기, 비밀번호 찾기, 파일 업로드
import java.util.Scanner;
public class 문제_04_제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num=scan.nextInt(); //키보드에 입력된 값을 받음
		/*
		 * 정수 : nextInt()
		 * 실수 : nextDouble()
		 * 논리 : nextBoolean()
		 * 문자열 : next()
		 * ***단점 = char는 읽지 못함
		 * 			----> 문자열로 읽어서 첫번째 문자를 자른다
		 * 							   -------->charAt(0)
		 */
		//결과값 출력
		if(num>=0)
		{
			System.out.println(num+"는(은) 양수입니다.");
		}
		else
		{
			System.out.println(num+"는(은) 음수입니다.");
		}

	}
//똑같이 작성함
}
