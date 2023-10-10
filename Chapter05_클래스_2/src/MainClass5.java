import java.text.DecimalFormat;
/*
		사용자 정의 클래스 - 클래스 선언에 필요한 변수
 */
/*class Movie
{
	int movieId; 
	String poster,nameKr,nameEn;
	String regdate;
	String genre;
	String nation;
	String grade;
	String time;
	double score;
	int boxoffice;
	String info;
}*/

/*class MovieNews
{
	int newsId1; 
	String poster1,title1;
	String info1;
	String date1;
	String publisher1;
	
	int newsId2; 
	String poster2,title2;
	String info2;
	String date2;
	String publisher2;
	
	int newsId3; 
	String poster3,title3;
	String info3;
	String date3;
	String publisher3;
}*/
class MovieNews
{
	int news_no; // no값은 항상 줘야함 (못찾아서)
	String poster;
	String title;
	String content;
	String regdate;
	String author;

/*class Food
{
	int foodId1; 
	String poster1,title1;
	String info1;

	int foodId2; 
	String poster2,title2;
	String info2;
	
	int foodId3; 
	String poster3,title3;
	String info3;
	
	int foodId4; 
	String poster4,title4;
	String info4;

	int foodId5; 
	String poster5,title5;
	String info5;
	
	int foodId6; 
	String poster6,title6;
	String info6;
}*/
	class Food
	{
		int food_cate_no; 
		String title;
		String subject;
		String info;
		String poster;
	}

/*class Restaurant
{
	String title;
	double score;
	String address;
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu;
}*/

	class Restaurant
	{
		String title;
		double score;
		String address;
		String phone;
		String type;
		String price;
		String parking;
		String time;
		String menu;
	}
	

/*class Food1
{
	String poster,title;
	String user;
	double score;
	int hit;
}
	
*/
class Food1
{
	int Food_no;
	String poster;
	String title;
	String chef;
	int score;
	int hit;
	int showUser;
}



/*class chart
{
	int rank;
	int updown;
	String poster;
	String title;
	String singer;
	String album;
	int like;
}*/
class chart
{
	int music_no;
	int rank;
	String state; // 유지, 상승, 하강
	int idcrement;
	String poster;
	String title;
	String singer;
	String album;
	int like;
}

class goods
{
	int goods_no; // 구분자
	int goods_discount; // 앞에 .._를 붙여주는 것이 좋음
	String goods_poster;
	String goods_name;
	int goods_price;
}
// new => 새로운 메모리 공간 생성
class musical
{
	int no;
	String poster,title,genre,regdate,location,actor,grade,time; // 한번에 선언 가능하지만 수정이 번거로움
}


public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int like=323457;
		// 라이브러리
		// => 숫자 => int 
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println("♡ "+df.format(like));
	}

}
}
