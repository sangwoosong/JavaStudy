/*
 * 3. 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 
 * 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다. 알맞은 코드를 넣으세요.

public static void main(String[] args) { 
    char ch = 'A'; 
    char lowerCase = (코드 입력); 
    System.out.println("ch : " + ch); 
    System.out.println("ch to lowerCase : " + lowerCase);

 */
import java.util.Scanner;
public class 문제_02_연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//03
//		char ch = 'A'; 
//	    char lowerCase = (ch>=65 && ch<=96)?(char)(ch+32):ch; 
//	    System.out.println("ch : " + ch); 
//	    System.out.println("ch to lowerCase : " + lowerCase);
		
		//답
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		char ch = scan.next().charAt(0);
		System.out.println("ch = " + ch); 
	    char lowerCase = (ch>='A' && ch<='Z')?(char)(ch+32):ch; 
	    System.out.println("소문자로 변경된 값 : " + lowerCase);
	    char higherCase = (ch>='a' && ch<='z')?(char)(ch-32):ch; 
	    System.out.println("대문자로 변경된 값 : " + higherCase);

	}

}
