/*
 * 		문자열 (일반 변수와 저장 방식은 똑같음)
 * 		----- String 기능이 많다
 * 			1. 문자의 갯수 확인 (비밀번호, SMS 일정바이트 이상 대용량으로) : length()
 * 
 * 			2. 검색
 * 			   ---
 * 				***startWith : 시작하는 문자열이 같은 경우
 * 				endWith : 끝나는 문자열이 같은 경우 => cookie
 * 				***contains : 포함된 문자가 있는지
 * 				   -------> 추천 (검색어)
 * 				equals : 같은 값 => id, password
 * 				   -------> 대소문자 구분
 * 
 * 			3. 문자열 제어
 * 				-변경 : replace(), replaceAll()
 * 					   replace('a','b') = a를 b로
 * 					   replaceAll("[가-힣]","") = 한글 전체를 공백으로
 * 					   replaceAll("[0-9A-Za-z]","") = 숫자, 영어 전체를 공백으로
 * 
 * 							Strings"Hello Java"
 * 									0123456789
 * 				-문자자르기 : substring(1)	=> 1번 제외
 * 						    substring(4,7) => 456번만 제외
 * 										-- 제외 
 * 				-대문자 : toUpperCase
 * 				-소문자 : toLowerCase
 * 
 * 			4. 모든 데이터형을 문자열로 변경
 * 				- valueOf(1) => "1" => 윈도우 , 웹
 * 
 * 			5. 분리 : split() => Spring[]
 * 				charAt(index)
 * 				"Hello Java" => charAt(0) => 'H'
 * 				**index번호가 자바는 무조건 0부터 시작 (오라클은 1번)
 * 
 * 		String => 일반형
 * 		---------------	Call By Value / Call By Reference
 * 							  |		    => 배열/클래스
 * 							String
 * 			형식) String s="";
 * 				 String s=new String ("")
 * 
 */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		System.out.println(s.length()); // 문자 갯수 => 공백 포함
		if(s.startsWith("Hel")) // 서제스트에서 많이 나옴 => 검색기 (제안)
		{
			System.out.println("포함됨");
		}
	}

}
