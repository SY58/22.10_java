package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.mypac.Member;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		//추가할 회원정보
	    String name="딸기";
	    String addr="부산";
	    
	    //추가할 회원의 정보를 Member 객체에 담고
	    Member mem=new Member();
	    //객체의 필드가 public 공개필드이기 때문에 대입연산자로 직접 참조해서 필드에 값을 대입할 수 있다.
	    mem.name=name;
	    mem.addr=addr;
	    //insert()메소드 호출하면서 Member 객체 전달하기
	    insert(mem);	      
	}
	
	//회원 한명의 정보를 추가하는 메소드를 만들기
	public static void insert(Member m) {
		Connection conn=null;
	    PreparedStatement pstmt=null;	      
	      try {
	    	  //connection 객체의 참조값 얻어오기
	    	  conn=new DBConnect().getConn();
	    	  //실행할 SQL문
	    	  String sql="INSERT INTO member"
	    			  + " (num, name, addr)"
	    			  + " VALUES(member_seq.NEXTVAL, ?, ?)";
	    	  pstmt=conn.prepareStatement(sql);
	    	  pstmt.setString(1, m.name);
	    	  pstmt.setString(2, m.addr);
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원 정보를 추가했습니다.");
	    } catch(Exception e){
	    	e.printStackTrace();
	    }finally {
	  	  try {
	  		  if(pstmt!=null)pstmt.close();
	  		  if(conn!=null)conn.close();
	  	  }catch(Exception e) {}
	    }
	}
}
