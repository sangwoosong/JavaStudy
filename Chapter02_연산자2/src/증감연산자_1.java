/*
 * 증감 연산자	 => 반복문에서 주로 사용
 * ㄴ1개 증가, 1개 감소 (a++	=	a=a+1	=	a+=1)
 * 	  ++       --
 * 		1. 전치연산자
 * 			++a , --a
 * 
 * 		2. 후치연산자
 * 			a++ , a--
 * 
 * 		Ex) int a=10;
 * 			int b=++a;	=> a를 먼저 증가하고 b에 대입
 * 				ㄴ> a=11 , b=11
 * 
 * 			int a=10;
 * 			int b=a++;	=> b에 a값을 대입 후에 나중에 a값을 증가
 * 				ㄴ> a=11 , b=10
 * 
 * 			int a=10;
 * 			int b=++a + ++a + a++	=> a값은 증가된 수만큼
 * 				  ---   ---   ---
 * 				  11     12    12
 * 			==> a = 13	,	b = 35
 * 
 * 			int a=10;
 * 			int b=a++ + a++ + ++a;	=> a++는 이동할때 증가됨
 * 				  ---   ---   ---
 * 				   10   11    13
 * 			==> a = 13	,	b = 34
 * 
 * 			int a=10;
 * 			int b=++a + a++ + ++a + a++
 * 				  ---   ---   ---   ---
 * 				  11    11    13    13
 * 			==> a=14	,	b=48
 *  
 * 			int a=10;
 * 			int b=a++ + a++ + a++ + a++
 * 				  ---   ---   ---   ---
 * 				  10    11    12    13
 * 			==> a=14	,	b=46
 * 
 * 			int a=10;
 * 			int b=a-- + a++ + --a + a++
 * 				  ---   ---   ---   ---
 * 				  10     9     9     9
 * 			==> a=10	,	b=37
 * 
 */
public class 증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=a++;
		System.out.println("a="+a+",b="+b);

	}

}
