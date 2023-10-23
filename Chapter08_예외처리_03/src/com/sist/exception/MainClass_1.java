package com.sist.exception;
import java.io.IOException;
import java.sql.SQLException;
/*
		throws => 선언 => 예외회피
		=> method 위에 붙어있다 => 라이브러리에 주로 사용
								--------
								자동완성기 이용
		=> throws 이용할 수 있다, try~catch 이용
			예외처리의 중심은 try~catch
		-------------------------------------------
		주의점
			void method() throws Exception, IOException, SQLException
			{
			}
			
			=> 사용
			void main() throws Exception, IOException, SQLException	
			{
			}
			void main()
			{
				try
				{
				}
				catch((IOException ex)
				{
				}
				catch(SQLException e)
				{
				}
				catch(Exception e)
				{
				}
				
			}
			=> 가장 큰 예외처리로도 가능 => Exception으로 통합이 가능
			void main() throws Exception
			{
      		}
      		void main()
      		{
         		try
         		{
         		}catch(Exception ex)
         		{
         		}
      		}
 */
public class MainClass_1 {
	// 코딩이 많은 경우에 throws 주로 사용 (이미 만들어진 소스)
	// 시작부터는 try 사용
	public void method() throws Exception,IOException,SQLException
	{
		// 컴파일 통과
		int i=Integer.parseInt("10 ");
		System.out.println(i);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MainClass_1 m=new MainClass_1();
		try
		{
			m.method();
		}catch(Exception ex)
		{
			
		}
			System.out.println("프로그램 종료");
	}

}
