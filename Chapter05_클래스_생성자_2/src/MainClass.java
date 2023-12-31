/*
		=> 자바 기본 문법
		   -----------
		   데이터형 (메모리 크기)
		   	기본형
		   	참조형 => 클래스 / 배열
		   	
		   클래스
		   	- 데이터만 모아서 관리 => 변수
		   		=> 초기화를 해서 사용
		   			- 명시적 초기화
		   			- 초기화 블록
		   			- 생성자 (가장 많이 사용)
		   			
		   	- 메소드		"
		   		1) 클래스의 구성
		   			class ClassName
		   			{
		   				----------------------
		   				데이터 저장 공간 : 멤버변수 => 프로그램 종료시까지 유지
		   									  => 다른 클래스에서도 사용 가능
		   									  
		   								인스턴스변수 => new를 이용해서 메모리에 저장
		   										  => 메모리 공간 따로 생성
		   									데이터형 변수명;
		   								공유변수 => 컴파일러에 의해 자동 생성
		   									   => 메모리 공간을 1개만 사용
		   									static 데이터형 변수형;
		   				----------------------
		   				생성자 : 변수에 대한 초기화
		   						*** 클래스 영역에서는 선언만 가능
		   						void A() => 일반메소드
		   						(특징)
		   						클래스명과 동일
		   						리턴형이 없음
		   						여러개 사용 가능 = 같은 이름으로 여러개 사용 (오버로딩)
		   						* 오버로딩(컨스) - 중복 함수 정의 (new, add) <-> 오버라이딩(modify)
		   								 - 기술 면접 단골
		   								 - 메소드명이 동일
		   								 - 매개변수의 갯수나 데이터형이 다름
		   								 - 리턴형은 관계없음
		   								ex)
		   									A()
		   									A(int a,int b) => A(int,int)
		   									A(String s,double d) => A(String,double)
		   									***A(int c,int d)(int,int)
		   									=> 실제 메소드에도 적용
		   									*** void도 리턴형
		   									
		   						(기타)
		   						생성자를 사용하지 않고 초기화하는 방법
		   						=> 인스턴스 블록
		   							{
		   								구현 => 변수의 초기화
		   							}
		   						=> 정적 블록
		   							static *****
		   							{
		   								구현 => static에 대한 초기화
		   							}
		   							
		   								ex)
		   									class A
		   									{
		   										int[] arr=new int[5];
		   										
		   										A()
		   										{
		   										
		   										}
		   									}
		   									A a=new A(); => arr 저장
		   									---------------------------------
		   									class A
		   									{
		   										static int[] arr=new int[5];
		   										
		   										static
		   										{
		   											초기화 => 자동
		   										}
		   									}
		   									A.arr
		   				----------------------
		   				멤버메소드
		   					- static 메소드 : 메모리가 한개만 생성
		   						static 리턴형 메소드(매개변수 목록)
		   						{
		   						
		   						}
		   					- 인스턴스 메소드 : 따로 생성
		   						레턴형 메소드(매개변수 목록)
		   						{
		   						
		   						}
		   				----------------------
		   				class A
		   				{
		   					int a;
		   					int b;
		   					void display(){
		   					}
		   				}
		   				
		   				A aa=new A();
		   				
		   				--- aa ---
		   				   ---
		   				   a
		   				   ---
		   				   b
		   				   ---
		   				   display()
		   				   ---
		   				   
		   				----------
		   				A bb=new A();
		   				
		   				--- bb ---
		   				   ---
		   				   a
		   				   ---
		   				   b
		   				   ---
		   				   display()
		   				   ---
		   				   
		   				----------
		   			}
 */
// 생성자는 오라클 연동에 많이 사용 (데이터가 저장된 장소)
// 윈도우 초기화 => 시작과 동시에 레이아웃 처리
// 서버연결, 서버구동

/*
		메소드 : 인스턴스 메소드 => new를 이용해 메모리에 저장할때마다 생성
				----------- 객체 생성마다 따로 작동
				호출 방법 : 객체명.메소드()
			형식)
				리턴형 메소드명(매개변수목록) => 선언부
				{
					구현부
				}
				
				리턴형 => 요청에 대한 결과값 (1개만 사용이 가능)
							=> 여러개인 경우 : 클래스 / 배열
							=> 리턴형이 없는 경우 : void
				  | 기본형, 배열, 클래스
				메소드명 => 알파벳이나 한글로 시작함
						  숫자를 사용할 수 있음 (단 앞에 사용 금지)
						  키워드는 사용 할 수 없음
						  -----> 클래스명, 메소드명은 키워드가 아님
						  공백이 있으면 안됨
						  특수문자 사용 가능 (_ , $)
						  약속) 소문자로 시작, 두번째 단어의 첫자는 대문자 사용
						  *** 소프트웨어 이행
						  	  ------------> 한글에 문제가 생김
						  	  				가급적이면 영문 사용 권장
						  	  윈도우 개발 => 서버 리눅스 사용
						  	  Full Stack	AWS(PaaS)
						  	  => STS : 11
						  	  => tomcat => 9 => 11
						  	  	 spring-boot => 2.7.4 => 3
						  	  	 javax => 
						  	  -----------------------------
						  
				매개변수 : 사용자가 보내준 값
						 --------------> 여러개 있을 수 있음 (가급적이면 3개 초과 금지)
						 3개 이상일때는 클래스 / 배열을 사용
						 
				void 메소드명()
				{
					--- 구현
					return; => 생략이 가능 => 컴파일러가 자동 추가
					------> 메소드 종료 : 원하는 위치에 설정 가능
				}
				
				void 메소드명()
				{
					if()
						return;
						// 코드 사용이 불가능
					else
						return;
				}
				
				=> 호출
				   메소드명();
				--- 데이터형이 클 수도 있음
				int 메소드명()
				---
				{
					return 정수값;
						   ----- 일치
				}
				
				int[] 메소드명()
				{
					int[] arr=new int[10];
					return arr;
				}
					int[] arr=메소드명()
				class A
				
				A 메소드명()
				{
					A a=new A();
					  -
					return a;
						   -
				}
					A a=메소드명()
					
			***** 메소드는 호출시마다 처음부터 return이 있는 곳까지 실행 => 호출된 위치로 다시 돌아감
			
			ex)
				void aaa()
				{
					1
					2
					3
					return;
				}
				| 시작점
				void main()
				{
					4
					5
					aaa(); 1 2 3
					6
					7
					aaa(); 1 2 3
					8
					9
					return;
				}
				
				4 5 (1 2 3) 6 7 (1 2 3) 8 9
				반복제거, 재사용, 유지보수가 용이 (소스가 간결)
							   ----------------------
							   			| 구조적인 프로그램
				객체지향 프로그램 => 메소드
				
			프로그램 기획
				벤치마킹 / 요구사항 분석
				------------------- 변수 / 메소드
				
			ex) 숫자 야구게임
				멤버변수
					com[] user[] s
				컴퓨터 난수 발생 => 3개 => com[]
				사용자가 입력 => 3개 => user[]
				비교 => com[] user[]
				힌트 => user[] s, b
				종료 => s
				-------------------------------
 */

import java.util.Arrays;

class User
{
	int[] arr=new int[5];
	// 5개의 정수를 입력받아서 정렬하는 프로그램 제작 => 출력
	User() 
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
	}
	void sort()
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
	}
	void print()
	{
		System.out.println("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
	}
}
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.sort();
		user.print();
	}

}
