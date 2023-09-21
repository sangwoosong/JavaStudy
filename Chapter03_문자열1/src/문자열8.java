import java.util.Scanner;
/*
 *  equals(==) : 대소문자 구분
 *  equalsIgnoreCase : 대소문자 구분 없이
 */
public class 문자열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin",MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id=scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd=scan.next();
		// 대소문자 구분
		if(id.equals(MID) && pwd.equals(MPWD))// equalsIgnoreCase = 대소문자 구분 x
		{
			System.out.println(id+"님 로그인 되었습니다.");
		}
		else
		{
			System.out.println("ID 또는 Password가 틀립니다.");
		}
	}

}
