/*
 * 1~100까지 => 3의 배수의 합, 5의 배수합, 7의 배수의합 => 출력
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int third=0,fifth=0,seventh=0;
		
		for(int i=1;100>=i;i++)
		{
			if(i%3==0)
				third+=i;
			if(i%5==0)
				fifth+=i;
			if(i%7==0)
				seventh+=i;
		}
		System.out.println("1~100까지의 3의 배수 합 : "+third);
		System.out.println("1~100까지의 3의 배수 합 : "+fifth);
		System.out.println("1~100까지의 3의 배수 합 : "+seventh);

	}

}
