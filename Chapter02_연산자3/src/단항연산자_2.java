//형변환 연산자
/*
 * 	(int 등)값
 */
public class 단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		double d=(double)a;
		//생략 가능 = upcasting
		char c=(char)a;
		//c=10000;
		// 특수한 경우 = 생이 가능
		// ㄴ연산처리가 되면 생략 불가능
		// 정수는 가능, 변수는 불가능(강제형변환 해줘야함)
		// Ex) char c=65;
		//'A'=65 'a'=97 '0'=48
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		c='0';
		System.out.println("c="+(int)c);
	}

}
