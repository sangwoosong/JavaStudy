/*
 		split => String[]
 		
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String actor="하정우,임시완,배성우,김상호";
//		String[] movie=actor.split(","); // 잘라서 각각의 문자열로 나눠줌 
//		System.out.println(movie[1]);
		
//		String actor="하정우|임시완|배성우|김상호";
//		String[] movie=actor.split("\\|"); // | 는 안잘림 => \\를 붙여야 잘림
//		System.out.println(movie[1]);
		
		String name=" Hello Java ";
		System.out.println(name.trim()); // 좌우의 공백을 모두 없애줌 => 공백이 사라지는거라 index는 12=> 10으로 바뀜
		
		// replace = 원하는 문자를 변경
		String s="Hello Java";
		System.out.println(s.replace('a', 'b'));
		System.out.println(s=s.replace("Java","Oracle"));
		System.out.println(s);
		
		// 문자의 결합
		String msg="대대로 마을을 지켜 온 당주집 장손이지만 정작 귀신은 믿지 않는 가짜 퇴마사";
		if(msg.length()>20)
		{
			//msg=msg.substring(0,20)+"...";
			msg=msg.substring(0,20).concat("..."); // concat을 사용해도 되지만 +가 더 편함
		}
		System.out.println(msg);

	}

}
