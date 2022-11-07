package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		//삭제할 회원의 번호라고 하자
		int num=3;		
		delete(num);
	}
	
	//인자로 전달한 번호에 해당하는 회원 한명의 정보를 삭제하는 메소드
	public static void delete(int num) {
		
		//DELETE 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//connection 객체의 참조값 얻어오기
	  	  	conn=new DBConnect().getConn();
	  	  	//실행할 SQL문
	  	  	String sql="DELETE FROM member"
	  	  			+ " WHERE num=?";  	  	
	  	  	//PreparedStatement 객체의 참조값 가져오기
	  	  	pstmt=conn.prepareStatement(sql);
	  	  	//?에 값 바인딩하기			  	  	
	  	  	pstmt.setInt(1, num);
	  	  	pstmt.executeUpdate();
	  	  	System.out.println("회원 정보를 삭제했습니다.");				
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		};
	}
}
