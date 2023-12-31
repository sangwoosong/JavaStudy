/*
	변수 / 연산자 / 제어문 = 프로그래밍
		 -------------> 명령문
	=> 묶어서 사용
		변수 : 클래스 / 배열 (ㅇ)
		명령문 : 관련된 명령이 있음
				ㄴ 입력 관련 / 출력 관련 / 요청 관련 => 메소드
				ㄴ 동작 => 조립해서 사용 (객체지향 프로그램)
						 -----------> 수정 / 추가 (유지보수)
		메소드는 한개의 기능만 수행이 가능
		=> 자바는 클래스 영역을 벗어날 수 없음 (클래스 종속)
		
	1. 메소드 구성요소
		- 리턴형 : 사용자 요청에 대한 처리 결과값
					결과값은 반드시 한개만 사용 가능
								 -------
								 	ㄴ 여러개인 경우 => 배열 / 클래스 / 컬렉션
				=> 예측해서 설정
				
		- 매개변수 : 사용자가 요청한 값
					웹에서 마우스클릭, 엔터, 버튼, 입력창 등
				=> 사용자가 행위를 한 경우 메소드 호출
				   ----------> 마우스, 키보드
				   
		- 메소드명 : 식별자 (변수)
					=> 소문자로 시작 
					
		- return 문장 : 처리 결과값을 보내줌, 메소드의 종료
		  ---------- 맨 마지막에 사용하는 것이 아니라 중간에 사용이 가능	
		  	ex)
		  		메소드()
		  		{
		  			if()
		  			{
		  				return;
		  			}
		  			else
		  			{
		  				return;
		  			}
		  		}
		
	2. 메소드 형식
		---------------------------------------
		public : 모든 클래스
		protected : 상속받는 클래스, 같은 폴더 안에서
		default : 같은 폴더 안에서만
		private : 자신의 클래스 안에서만 => 은닉화
		---------------------------------------
		static : 자동 메모리 저장 => new
		abstract : 추상 메소드 => 선언만 (설계 => 요구사항)
		final : 수정이 불가능 => String, Math...
		
		리턴형(1개)으로 사용 => 기본형 (int , long , byte , char , double , boolean)
							  ---						 ------	  -------
					 => 참조형 : 배열 / 클래스
					 	String , int[]
					 => 메소드 매개변수 전송법
					 	-----------------
					 	***Call By Value / Call By Reference
		매개변수(0개 이상)로 사용 => 기본형 : Call By Value
								참조형 : Call By Reference
								*** 매개변수가 3개 이상이면 배열, 클래스
		[접근지정어][옵션] 리턴형 메소드명(매개변수...) => 선언부
		{
			구현부
			-변수 선언
			-연산자
			-제어문
			-------------결과값 도출 : 파이썬(예측)
			return 결과값;
			=>자체 처리 => void (return 생략 가능)
							   ----------
							   모든 메소드는 return이 필요 = 컴파일러가 자동으로 추가
		}
		=> return / import java.lang.* : 자동추가
							---------> String, Math, System...
		   return을 생략할때는 void인 경우에만 가능
		*** 모든 프로그램
		- 입력 => 변수에 대한 초기화
		- 처리부분 (요청) => CRUD
						  ----
						  Create : 추가 => INSERT
						  Read : 읽기 (목록, 상세보기) => SELECT
						  Update : 수정 => UPDATE
						  Delete : 삭제 => DELETE
		- 출력 => 사용자가 볼 수 있게 만듦 => HTML, CSS
		- main() => 프로그램의 시작과 종료
		
	3. 메소드 유형
		리턴형	매개변수
		  O		  O
		  	=> String substring(int begin) => 원형
		  	   ------
		  	   String substring(int begin, int end)
		  O		  X
		  	=> String trim()
		  	=> double random()
		  X		  O
		  	=> void main(String[] arg)
		  	   ---- 출력을 메소드 자체에서 처리
		  X		  X
		  	=> void println() => 다음줄에 출력 (거의 빈도수가 없음)
		  	
		  	*** 한개의 클래스 안에서 메소드명이 동일할 수 있음
		  						 ------------
		  						 	매개 변수의 갯수나 데이터형이 다름 
		  						 	(데이터형이 달라야 다른 메소드 / 변수만 다르면 같은 메소드)
		  						 aaa(int a) => aaa(int) 
		  						 aaa(int b)
		  						 aaa(double d)
		  						 aaa(int a, int b) => 오버로딩
		  						 	=> 중복 정의 메소드
		  		plus(int,int), plus(char,char), plus(double,double)
		  		
	4. 메소드 호출
	   --------
	   	- 인스턴스 메소드 => new를 이용해서 메모리 저장
	   		Scanner scan.new Scanner(System.in)
	   		scan.nextInt()
	   		String s="";
	   		s.메소드
	   	- 클래스 메소드 (static) => 공유 => 자동 저장
	   		Math.random()
	   		
	   	=> static
	   		클래스명.메소드명()
	   		--------------
	   		=> 같은 클래스인 경우 => 클래스명은 생략이 가능
	   	=> aaa(int a,int b)
	   		=> aaa(10,20)
	   	=> int aaa()
	   	   int a=aaa()
	   	   
	5. return값 설정
	   -----------
	   int display()
	   {
	   		return 10;
	   }
	   
	   double display()
	   {
	   		return 10.5;
	   }
	   
	   String display()
	   {
	   		return"";
	   }
	   
	   void display()
	   {
	   		return; 생략이 가능
	   }
	   
	   int[] display()
	   {
	   		int[] arr=new int[5];
	   		return arr;
	   }
	   
	   => 중요내용 => 여러번 호출이 가능 (재사용)
	   
	6. 메소드 사용 목적
		- 반복되는 기능 제거
		- 코드 관리가 쉬움 (기능별 분리)
		- 소스가 간결함
		- 재사용 (다른 클래스 연결)
		--------------------------
 */
// 5개의 정수를 전송 후 정렬 int[]
// 5자리 정수를 전송 후 거꾸로 출력 12345 => 54321
import java.util.*;
public class 메소드_1 {
	
	static int[] sortASC(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static int[] sortDESC(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static int[] sort(int[]arr,String type)
	{
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(type.equals("ASC"))
				{
					bCheck=arr[i]>arr[j];
				}
				else
				{
					bCheck=arr[i]<arr[j];
				}
				if(bCheck)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static void sort_1(int[]arr,String type)
	{
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(type.equals("ASC"))
				{
					bCheck=arr[i]>arr[j];
				}
				else
				{
					bCheck=arr[i]<arr[j];
				}
				if(bCheck)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//reverse
	static String reverse(int num)
	{
		String str=String.valueOf(num);
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res+=str.charAt(i);
		}
		return res;
	}
	//조립
	static void process()
	{
		
		// 5개의 정수 설정
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		/*int[] result=sortASC(arr);
		System.out.println("정렬 후 ASC : ");
		System.out.println(Arrays.toString(result));
		result=sortDESC(arr);
		System.out.println("정렬 후 DESC : ");
		System.out.println(Arrays.toString(result));*/
//		int[] result=sort(arr,"ASC");
//		System.out.println(Arrays.toString(result));
//		result=sort(arr,"DESC");
//		System.out.println(Arrays.toString(result));
		// Call By Reference
		sort_1(arr,"ASC");
		System.out.println(Arrays.toString(arr));
		
		sort_1(arr,"DESC");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(reverse(12345));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 조립
		process();
	}

}
