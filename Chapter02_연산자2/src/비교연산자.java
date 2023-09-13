/*<44P>
 * 	비교연산자 => 결과값 (boolean : true/false)
 * 		ㄴ사용처 (조건문, 반복문)
 * 	숫자 (정수, 실수, boolean, 문자) => 문자열은 비교할 수 없다
 * 					ㄴ == , !=만 가능
 * 	----------------------------------- 문자는 어떤 연산자를 사용해도 정수형으로 변경
 * 	1) == 같다
 * 	2) != 같지 않다
 * 	3) < 작다
 * 	4) > 크다
 * 	5) <= 작거나 같다
 *  6) >= 크거나 같다
 *  -----------------------------------
 *  
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		//		   ----------------- 0.0~0.99 사이에서 숫자 추출 *100 = 0.0~99.0
		//	  ----- 0~99			  
		//							  --- 1~100
		int b=(int)(Math.random()*100)+1; // 예약 가능한 날 추출해놓고 시작할때 쓸거임
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		// a<b || a==b
		System.out.println("a>=b:"+(a>=b));
		// a>b || a==b
		
		char c=(char)((Math.random()*26)+65);
		char d=(char)((Math.random()*26)+65);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		System.out.println("c==d:"+(c==d));
		System.out.println("c!=d:"+(c!=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c<=d:"+(c<=d));
		System.out.println("c>=d:"+(c>=d));
		//문자도 비교 가능
		//Edit > Find/Replace 로 한번에 같은글자 변경 가능
		
		boolean b1=false;
		boolean b2=true;
		System.out.println("\nb1==b2:"+(b1==b2));;
		System.out.println("b1!=b2:"+(b1!=b2));;

	}

}
