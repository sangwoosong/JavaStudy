/* <25P> 
 * 변수 : 관리할 데이터를 저장하는 공간 (한개만)
 * 		 변수명 > 소문자로 시작
 * 		 식별자 (명령규칙)
 * 			1) 알파벳(대소문자 구분)이나 한글로 시작
 * 			2) 명칭의 글자수는 제한하지 않음 (보통 3~7글자로 압축)
 * 			3) 숫자는 사용 가능 But 앞에 사용 불가
 * 			4) 특수문자 2개 사용 가능 ($, _) _ 를 많이 사용
 * 				언더바를 앞에 붙이면 임시변수 (EX. _name)
 * 			5) 변수명에는 공백 사용 불가
 * 			6) 키워드 사용 불가 = 자바에서 사용하는 단어 (Ex. class, java 등)
 * 			7) 소문자로 시작하고 새로운 단어 결합시 새로운 단어 시작 대문자
 * 
 * 	변수
 * 	1) 선언
 * 		ㄴ데이터형 변수명;
 * 		   int a; = 4byte 메모리 공간을 만들고 이름을 a로 부여
 * 	2) 초기값을 부여
 * 			a=100;
 * 	3) 동시에 처리 
 * 			int a=100;
 * 	4) 값 읽기 / 값 변경 > 읽기(값을 가지고옴) / 쓰기(저장) / 수정
 * 
 * int(데이터형) num(변수)=200(리터럴)
 * 
 * 프로그램 개발 : 가독성(리팩토링) + 퍼포먼스(속도)
 * 
 * 	각 데이터형 표현법
 * 	byte b=100;
 * 	int i=100;
 * 	long l=100L; long l=200;
 * 	char c='A';, char c=65 ('A')
 * 	boolean b=true; boolean b=false;
 * 	float f=10.5F;
 * 	double d='A'; d=65.0 double d=10; d=10.0
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte _byte=127;
		int _int=20000;
		long _long=20000; // 20000L
		float _float=10.5f;
		double _double=100; //100.0 > 자동 형변환
		char _char=65; // 'A'
		boolean _boolean=true;
		
		System.out.println("_byte:"+_byte);
		System.out.println("_char:"+_char);
		System.out.println("_double:"+_double);
		System.out.println("_float:"+_float);
		// + (산술 & 문자열 결합)

	}

}
