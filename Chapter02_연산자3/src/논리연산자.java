/*
 * 		&& , || => 범위가 있는 경우
 * 		--	 --
 * 		|	  |
 *     포함   미포함
 *     
 *     	형식 : 
 *     			(조건) && (조건) => 조건을 사용하는 연산자 (부정연산자, 비교연산자)
 *     			----- AND -----
 *     			true     true	>	true
 *     			true	 false	>	false
 *     			false	 true	>	false
 *     			false	 false	>	false
 *     
 *    			(조건) || (조건) => 조건을 사용하는 연산자 (부정연산자, 비교연산자)
 *     			----- OR -----
 *     			true     true	>	true
 *     			true	 false	>	true
 *     			false	 true	>	true
 *     			false	 false	>	false
 */
//	||
/*
 * 	1~12 입력
 * 	12, 1, 2 => 겨울 (OR이 적합 = 범위 특정하기 힘듦)
 * 	3, 4, 5	=> 봄	(AND가 적합 = 범위 특정 가능)
 * 	6, 7, 8	=> 여름	(AND가 적합 = 범위 특정 가능)
 * 	9, 10, 11 => 가을(AND가 적합 = 범위 특정 가능)
 */
import java.util.Scanner; //모든 클래스를 가져 올 경우 Scanner 자리에 *
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("월 입력(1~12):");
		int month=scan.nextInt();
		
		if(month<=12) {
			System.out.print(month+"월은 "); //범위 밖 내용을 입력할때 이 내용을 출력시키지 않으려면 어케? => if~else문으로
			System.out.print(month>=3 && month<=5?"봄입니다":"");
			System.out.print(month>=6 && month<=8?"여름입니다":"");
			System.out.print(month>=9 && month<=11?"가을입니다":"");
			System.out.print(month==12 || month==1 || month==2?"겨울입니다":"");
		}else {
			System.out.print(month>12?"1~12 내의 숫자를 입력해주세요!":"");
		}

	}

}
