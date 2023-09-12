/*가장 기본이 되는 연산자 : 산술연산자 <38P>
 *	 산술연산자 : + , - , * , / , %(나누고 나머지값)
 *	 ------- 이항연산자 (피연산자 (연산 대상) 2개)
 *			
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+ (산술)
		//국어, 영어, 수학점수의 총점을 구한다
		int kor=89;
		int eng=90;
		int math=87;
		int total=kor+eng+math;
		double avg=total/3.0;
		//출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		//평균
		//System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f\n",avg); //소수점 이하 '2'자리만 표시하라는 형식 (printf)
		
		System.out.println("======== % ========="); //다시 뜯어보기
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(5%2));
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2));
		System.out.println("======== 형변환 =========");
		
		/*
		 * 자동 형변환
		 * 		작은 데이터 > 큰 데이터형
		 * 강제 형변환
		 * 		큰 데이터형 > 작은 데이터형
		 * 
		 *				----> 자동 형변환
		 * 	byte < char <int < long < float < double
		 * 				<---- 강제 형변환
		 * 
		 * 자동 형변환
		 * 	int a='A';
		 * 		> a=65	  (char>int)
		 * 	double d=100;
		 * 		> d=100.0 (int>double)
		 */
		
		int aa='A';
		System.out.println("aa="+aa);
		double dd=100;
		System.out.println("dd="+dd);
		System.out.println(100+10.5+10.5F+'A'); //가장큰 데이터형의 결과값이 나옴 (double)
		//자동 형변환이 있는 경우 > 연산은 같은 데이터형끼리만 연산
		/*
		 * 'A'+10
		 * char+int
		 * char > 65 + 10 > 75
		 */
		System.out.println('A'+'B'); //65+66
		//int 이하 (byte, char, short) 연산 > 결과값 int
	}

}
