/*
 * 		문자열 :
 * 		 문자 : ' ' => 한글자 저장 => char
 * 				'a', 'b', 'c' => 한번 저장이 가능 String => "" (char 대신 String)
 * 		일반데이터형
 * 			String name="홍길동"; => 제어
 * 		클래스형
 * 			기능 => 메소드
 * 		=> 웹은 데이터형이 존재하지 않는다 => 문자열이 있음
 * 		
 */
import java.util.Scanner;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장
		String name="홍길동"; // 문자 여러개를 저장하는 공간 (char 여러개 = String 한개)
		System.out.println(name);
		char a='홍';
		char b='길';
		char c='동';
		System.out.println(a+""+b+""+c+"");
		String addr="서울특별시 마포구 양화로23길 10-10 B1";
		System.out.println(addr);
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 : ");
		String findData=scan.next();
		System.out.println(findData);
	}

}
