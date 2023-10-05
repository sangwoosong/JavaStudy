// 4. 1~10까지 합을 구하는 메소드 구현
// ---------------> 사용자 요청하는 값은 없음 (매개변수 x)
// 메소드 자체에서 출력 => 결과값=>main()
// 리텬형
public class 문제_10_메소드_2 {
	// 매개변수(x), 리턴형 (o)
	static int sum()
	{
		int hap=0;
		for(int i=1;i<=10;i++)
		{
			hap+=i;
		}
		return hap; // 자체 출력 (void)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap=sum();
		System.out.println("hap : "+hap);
	}

}
