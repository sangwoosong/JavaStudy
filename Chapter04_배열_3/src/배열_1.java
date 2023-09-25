/* <86p> - new => 클래스 등을 저장할때 계속 씀 (익숙해지기)
		
		new => 메모리 확보
			   --------> 메모리 크기
			   	   |
			 메모리 주소를 전송
			 	ㄴ new를 사용할때 마다 메모리 주소가 달라짐 = 여러개 저장 가능
			
			ex) int[] arr=new int[5]; : new를 이용하면 자동 초기화(0)
				---------------------
				arr [10@1212412] < 메모리 주소 => 를 임의의 이름으로 바꾸는 것
				----	100	-[0]-[1]-[2]-[3]-[4]----
				100			  0	  0	  0	  0	  0
				----		------------------------
				메모리 주소를 이용해서 데이터를 제어 => 참조변수
												------
												1. 배열
												2. 클래스
				=> 데이터형의 형변환
					double [] arr={10, 20,'A', 'B', 30} (double 을 사용함)
					=> arr[0] = 10.0
					   arr[1] = 20.0
					   arr[2] = 65.0
					   arr[3] = 66.0
					   arr[4] = 30.0
					int[] arr={10.0,'A', 'B', 20, 30} => 오류 (실수때문에)
							  ------
					boolean[] arr={true, false, true...}
					
					데이터형[] 배열명;
							 ----->참조변수
					=> 전체 크기 (저장된 갯수) => length
					=> 데이터형[] 배열명=new 데이터형[배열의 크기]; => 오류
									  ----------> 갯수
					=> 복사
					   1) 얕은 복사 : 참조 (공유)
					   2) 깊은 복사 : 새로운 배열을 만듦
					   		
					   	int a=10;
					   	int b=a;
					
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//얕은 복사 => Call By Reference
		int[] arr=new int[5]; //new의 역할 : 메모리를 할당하고 0으로 채워줌
		//0으로 초기화 => 연속적인 메모리 구조
		/*		[I@6504e3b2 => arr[0] = 일반변수와 동일
		 * 		---------------------------------------------
		 * 		|	0	|	0	|	0	|	0	|	0	|
		 * 		---------------------------------------------
		 * 						20byte
		 */
		int[] arr2=arr; //얕은 복사 => 저장된 주소값이 같은 경우에는 같은 메모리를 제어 (배열, 클래스)
		
		System.out.println("arr="+arr);
		System.out.println("arr2="+arr2);
		
		arr[0]=100;
		arr[1]=200;
		
		System.out.println("arr2=>"+arr2[0]);
		System.out.println("arr2=>"+arr2[1]);
		// 배열이나 클래스인 경우에 같은 주소를 가지고 있으면 같은 메모리 제어 => 얕은복사
		//메모리 주소가 다른 경우 따로 제어
	}

}
