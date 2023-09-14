/*
 * 		연산자(가장 많이 등장하는 연산자들 = 반드시 기억!)
 * 		----- 메소드(기능수행)에 많이 등장 ==여러개==> 프로그램
 * 			증감 연산자 : 반복문에 주로 사용 (++, --) *아래 코드 참조*
 * 			부정 연산자 : 반대효과
 * 			형변환연산자 : 클래스 형변환
 * 			--------------------------------------
 * 			산술(자주 등장) : +(문자열 결합)
 * 				 		   %(년도 계산, 페이지)
 * 			비교연산자 : 반복문, 조건문
 * 			논리연산자 : 기간, 범위 => &&
 * 			대입연산자 : = , +=
 * 			--------------------------------------
 */
import org.jsoup.Jsoup; //jar파일 추가하면 추가됨 (맨 위에 있어야함)
import org.jsoup.nodes.Document; //Document doc=Jsoup.connect
import org.jsoup.select.Elements; //Elements title=doc.select
import java.util.*; //클래스 전부 불러오기
public class 연산자정리 {
//	지니뮤직 top 200 차트 정보 가져오는
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//사용자 정보 습득
		System.out.print("검색어 입력:");//검색창 출력
		String fd=scan.next();//입력값을 이용해 검색 변수 선언
	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();//해당 주소에서 가져오기
	Elements title=doc.select("a.title");//title에 해당되는 정보 출력
	Elements singer=doc.select("a.artist");//artist에 해당되는 정보 출력
			for(int i=0;i<50;i++)//뭐지? => 루프문 (i=0이며 i는 50보다 낮고 i+1 를 반복)
			{
				if(title.get(i).text().contains(fd)) // => 이프문(조건문)
				{
					System.out.println(title.get(i).text()
							+"("+singer.get(i).text()+")"); //문자열 결합
				}
			}

	}

}
