/*
		substring() => 문자를 자른다
		
		"Hello Java"
		 0123456789
		 
		 substring(6) =6번부터 마지막까지
		 substring(0.5) => 0~4까지 (마지막 번호는 제외)
 */

public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="서울특별시 강남구 삼성로75길 지번 서울시 강남구 대치동 905-21";
//		String s1=s.substring(0, 5);
//		String s2=s.substring(6);
//		System.out.println(s1);
//		System.out.println(s2);
		
//		String s1=address.substring(0, 17); // 도로명 까지 BUT 너무 번거로움
//		String addr=address.substring(0,address.indexOf("지번")); // 숫자를 셀 필요 없이 지번 뒤를 모두 자름
		
//		String addr=address.substring(address.indexOf("지번")+3); //지번 앞을 모두 자름 / +3 준 이유 = '지''번''공백'을 자르려고
		
//		String addr=address.substring(address.indexOf("대치동"),address.indexOf("905-21")); // 직접 해봤는데 너무 김
//		int a=address.lastIndexOf(" ");
//		String addr=address.substring(a-3,a);
//		System.out.println(addr);
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf(".")); //lastIndexOf = 찾으려고 한 문자열의 마지막에 위치한
		System.out.println(s);

	}

}
