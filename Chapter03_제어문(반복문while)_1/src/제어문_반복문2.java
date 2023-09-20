/*
 * 		while
 * 		-----
 * 			=> 10개의 난수 => 1~100
 * 			=>최대값 / 최소값
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1,min=100; // 낮은값, 높은값을 부여해야 변경됨 (max=100, min=1 로 넣으면 안됨 => 변경되지 않기 때문)
		int i=1; //루프변수 => 1~
		while(i<=10)
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.println(rand+" ");
			//최대값, 최소값
			if(max<rand)
				max=rand;
			if(min>rand)
				min=rand;
			i++; //없으면 무한루프 => 10까지 증가하게 해야함
		}
		System.out.println("\n최소값 : "+min);
		System.out.println("최소값 : "+max);

	}

}
