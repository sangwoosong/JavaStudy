/*
 	중복없는 난수 발생
 	=> 예약일 , 예약시간 ...
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 1~10 난수 발생 => 중복 없이
		int su=0; // 난수 저장
		boolean bCheck=false; //중복 여부 확인
		
		for(int i=0;i<arr.length;i++)
		{
			bCheck=true;
			//---------- 난수 발생
			// bCheck = true => 난수 중복
			// bCheck = false => 종료
			// arr에 저장
			while(bCheck)
			{
				su=(int)(Math.random()*10)+1; // 1~10
						bCheck=false; // 빠져나갈(종료) 조건을 만들어야함
				// 비교 => arr에 저장된 값과 난수가 같은지 확인
				for(int j=0;j<i;j++)
				{
					// i=> 저장된 갯수
					if(arr[j]==su) // 같은 수가 있는지 확인
					{
						bCheck=true; // while을 다시 수행
						break;
					}
				}
			}
			//---------- 계속 난수 중복 체크를 돌려서 false가 나오면 빠져나옴
			arr[i]=su;
		}
		// 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
