// 변환 
/*
 * 			String toUpperCase() => 대문자 변환
 *			String toLowerCase() => 소문자 변환
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Java";
		//msg=msg.toUpperCase(); //msg= 으로 다시 저장해줘야 정상 적용
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		//msg=msg.toLowerCase(); //msg를 소문자로 변환 저장
		System.out.println(msg);
		// 처리 => 다시 저장하지 않는 경우에는 원본을 유지함
		
		// 대문자로 변환하는 것은 가끔
		// 오라클에서 대문자 구분
	}

}
