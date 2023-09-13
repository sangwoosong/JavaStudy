/*	*= , /=
 * 
 * 	int a=10;
 * 	a*=20;	=>	a=a*20	=>	a=10*20	=>	200
 * 
 * 	int a=10
 * 	a/=3;	=>	a=a/3	=>	a=10/3	=>	a=3
 */
public class 복합대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //final이 앞에 붙으면 상수가 됨 => 상수는 연산이 안됨, 상수는 대문자 변수는 소문자
		a*=20; //상수일 경우 - int b=A*20;
		System.out.println("a="+a);
		// a=200
		a=10;
		a/=3;
		System.out.println("a="+a);

	}

}
