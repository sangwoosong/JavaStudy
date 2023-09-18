/*
 * 12,1,2 겨울  3,4,5 봄 678 여름 91011 겨울
 * case 값이 동일할 수 없다
 * case 값에 실수를 사용할 수 없다
 * case 값:
 * case 문장을 수행하고 종료시에는 반드시 break;
 * case에 사용ㅎ는 순서는 상관이 없다
 * 			switch(정수)
 * 			{
 * 				default:
 * 					break;
 * 				case
 * 
 * 			}
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 임의 추출 => random()
		int month=(int)(Math.random()*12)+1;
		// 1~50							50
		System.out.println("입력한 달 : "+month);
		switch(month)
		{
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:// if(month==3||month==4||month==5)
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		}
				

	}

}
