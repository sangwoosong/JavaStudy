/*
 * 		이항 => () + ()
 * 		삼항 => ()  ()  ()
 * 			   (조건)?값1:값2
 * 				 ㄴtrue => 값1
 * 				 ㄴfalse => 값2
 * 
 * 				int a=10;
 * 				(a%2==0)?"짝수":"홀수"
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		System.out.println(a);
		System.out.println(a%2==0?"짝수":"홀수");
		
		// sex=1,3 남자 sex=2,4 여자
		
		int sex=(int)(Math.random()*4)+1;
		System.out.println(sex);
		System.out.println(sex%2!=0?"남자":"여자");

	}

}
