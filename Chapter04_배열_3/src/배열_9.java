// => 정수 10개 저장 => 3의 배수
public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 저장된 값 출력 => 실제 값만 읽는 경우
		// 향상된 for문 (for=each) => JDK 1.5 이상 => 배열/컬렉션(가변형 = 개수 변경 가능)이 있는 경우
		for(int i:arr) //arr에 있는 값을(실제 정보) i가 받아옴 (for-each = 저장된 값 출력)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n=== 결과값 ===");
		for(int i:arr) // Object는 모든 데이터형을 받을 수 있음
		{
			if(i%3==0)
				System.out.println(i+" ");
		}
	}

}
