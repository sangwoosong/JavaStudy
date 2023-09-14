// if~else
// (조건)?값1:값2
// 조건 : true => 값1
// 조건 : false => 값2

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1; //java.lang.* String.System.Math => 같은 폴더에 있어서 import 안해도됨
		//			0.0~99.0 => 0~99+1 = 1~100
		// 나중에는 >	Random r=new Random() r.next(100)
		System.out.println(a%2==0?a+"는(은) 짝수다":a+"는(은) 홀수다");
		
		char ch='a';
		char c=(char)((Math.random()*26)+65); // 전체를 괄호로 묶지 않으면 오류 - +65만 바뀌기 때문 / A~Z
		int s=(int)(Math.random()*2); // 0,1만 나옴
		ch=s==0?c:(char)(c+32); //0나오면 대문자, 1나오면 +32 해서 소문자 (대문자와 소문자 차이 = 32)
		System.out.println(ch>='A' && ch<='Z'?ch+"는(은) 대문자입니다":ch+"는(은) 소문자입니다");

	}

}
