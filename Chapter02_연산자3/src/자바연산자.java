/*
 * 		변수	: 저장 공간
 * 		---> 자바 저장 공간을 설정 (자료형, 데이터형)
 * 			------------------
 * 				정수
 * 				ㄴbyte (8bit) => 0,1을 8개 채워서 숫자 한개 저장 (-128~127)
 * 				ㄴint (32bit) => -21억4천 ~ 21억 4천
 * 				----------------------------------defalt (컴퓨터에서 모든 숫자는 int를 인식)
 * 				ㄴlong (64bit) => 금융권, 빅데이터 (크기가 큰 데이터를 이용하는 곳)
 * 				실수
 * 				ㄴdouble (64bit) => 소수형 15자리 이상
 * 				문자
 * 				ㄴchar (16bit) => 0~65535 (문자번호)
 * 									'A' > 65
 * 				논리
 * 				ㄴboolean (8bit) => true / false => 0 , 1
 * 				-----------------------------------
 * 					정수 3개 저장
 * 					ㄴ> int a,b,c;
 * 					실수 2개 저장
 * 					ㄴ> double d1, d2
 * 					문자 1개 저장
 * 					ㄴ> char c;
 * 					ㄴ> boolean bb;
 * 
 * 					-----> 데이터 저장 -----> 사용자 요쳥에 맞게 가공 -----> 화면 출력
 * 					-----> 프로그램 (반복)				|
 * 												  연산자
 * 		자바에서 제공하는 연산자
 * 		-------------------
 * 		단항연산자 :
 * 			ㄴ 증감연산자 (++ , --) - 한개 증가, 한개 감소
 * 					++a : a값을 1증가 시킨후에 다른 연산을 수행
 * 							int a=10;
 * 							int b=++a; > 증가(1) > 대입
 * 					a++ : 먼저 다른 연산후에 나중에 1 증가
 * 							int a=10;
 * 							int b=a++; > 대입 > 증가(1)
 * 					
 * 			ㄴ 부정연산자 (!) - boolean에서만 사용이 가능
 * 					true => false
 * 					false => true
 * 							Ex) boolean bCheck=false;
 * 								bCheck=!bCheck => bCheck=true
 * 								예약 가능한 날 => !(예약 가능한 날)
 * 
 * 			ㄴ 형변환연산자 (type) - 강제형변환
 * 					객체지향 형변환 (클래스)
 * 					숫자 관련만 (정수, 실수, 문자)
 * 				-------------------------
 * 					UpCasting : 데이터형을 크게 만듬 (자동형변환)
 * 						int => double
 * 						char => int
 * 					DownCasting : 데이터형을 작게 만듬 (강제형변환)
 * 						char c=(char)65; c='A'
 * 						int i=(int)100.0 i=100
 * 
 * 					데이터형의 크기
 * 							----> 자동 형변환
 * 				byte < char < int < long < float < double
 * 							<---- 강제 형변환
 * 					자동형변환
 * 					-------
 * 						연산 처리시 많이 변경 (자바자체)
 * 						--------
 * 							데이터형이 같은 것 끼리 연산이 됨
 * 
 * 					double + int (x)
 * 							---->double로 변경
 * 					char + int (x)
 * 					---->int로 변경
 * 					int + long (x)
 * 					--->long으로 변경
 * 					int + char + double
 * 					---------->double로 변경
 * 					*** 주의점 : int 이하 데이터형은 연산시에 int로 변경
 * 					char+byte = int
 * 					char+char = int
 * 					byte+byte = int
 * 		
 * 		이항연산자 :
 * 			ㄴ산술연산자 (+ , - , * , / , %)
 * 				+ : 두개의 값을 더함 (1+2=3) / 문자를 합침 ("8"+"7"="87")
 * 					***우선순위 : * , / , % => + , -
 * 								3+5*10 = 53
 * 								(3+5)*10 = 80
 * 					Ex) 7+"7"+7-7 = 에러
 * 						"777"-7 (x)
 * 						() 또는 *%/ 면 가능
 * 				/ : 정수/정수 = 정수 , 정수/실수 = 실수 , 정수/(double)정수 = 실수
 * 					Ex) int hit=135;
 * 						int count=10;
 * 						hit/count=13 (x)
 * 						hit/(double)count=13.5 (o)
 * 					***0으로 나눌 수 없다 (오류발생)
 * 				% : 왼쪽 부호 (윤년 구하기, 숫자 자르기, 배수 구하기...)
 * 
 * 			ㄴ비교연산자 (== , != , < , > , <= , >=) => 결과값은 true/false
 *				문자/정수/실수
 *				'A', "A" => 자바는 Unicode를 사용 (모든 국가의 언어 사용 가능)
 * 				== : 같다
 * 				!= : 같지 않다
 * 				< : 작다 (왼쪽 기준)
 * 				> : 크다
 * 				<= : 작겨나 같다
 * 				>= : 크거나 같다
 * 					***날짜, 문자열은 비교 불가 (자체 메소드 존재)
 * 
 * 			ㄴ논리연산자 (&& , ||)
 * 				&& : 직렬연산자 (조건 2개가 true일 경우에만 true)
 * 					(조건) && (조건)
 * 					-----	 -----
 * 					주로 사용처 : 기간, 범위가 포함된 상태
 * 				|| : 병렬연산자 (조건 2개중에 한개 이상 true일 경우 true)
 * 					(조건) || (조건)
 * 					-----	 -----
 * 					주로 사용처 : 잘못된 입력
 * 
 * 			ㄴ대입연산자 (= , += , -=)
 * 				일반 대입
 * 				+= : a+=1 => a=a+1 => 여러개 증가
 * 				-= : a-=1 => a=a-1 => 여러개 감소
 * 					
 * 
 * 		삼항연산자 :
 * 			ㄴ조건연산자 (?:)
 * 				(조건)?값1:값2
 * 				-----
 * 				true => 값1
 * 				false => 값2 ===> 페이징
 */

//산술연산자
//정수 3개 입력을 받아서 총점 , 평균
import java.util.Scanner; //scanner 클래스를 가지고 옴 (java.util = 패키지(폴더명))
// c => include
// c# => using
// 자바스크립트 => import
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math;
		int total;
		double avg;
		// 선언 (메모리 저장하는 공간만 만든다)
		//메모리 공간에 값을 첨부 => 변수의 초기화
		Scanner scan=new Scanner(System.in);
		//						----------> 키보드 입력
		System.out.print("국어,영어,수학 점수 입력(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		//활용할 수 있다
		//new => 메모리에 저장 (클래스)
		//연산처리
		total=kor+eng+math;
		avg=total/3.0;
		//결과 출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println();
		System.out.print(avg>=90 && avg<100?"A학점":"");
		System.out.print(avg>=80 && avg<90?"B학점":"");
		System.out.print(avg>=70 && avg<80?"C학점":"");
		System.out.print(avg>=60 && avg<70?"D학점":"");
		System.out.print(avg<60?"F학점":"");
	    
	}

}
