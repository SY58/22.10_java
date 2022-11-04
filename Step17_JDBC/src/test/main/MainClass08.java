package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.mypac.Member;
import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		//추가할 회원정보
	    String name="딸기";
	    String addr="부산";
	    
	    //추가할 회원의 정보를 HashMap객체에 key:value의 쌍으로 저장한다음
	    Map<String, Object> map=new HashMap<>();
	    map.put("name", name);
	    map.put("addr", addr);
	    
	    //insert()메소드 호출하면서 Map객체를 전달한다.
	    insert(map);
	}
	
	//회원 한명의 정보를 추가하는 메소드를 만들기
	public static void insert(Map<String, Object> m) {
		//Map에 저장된 회원의 이름과 주소를 읽어와서
		String name=(String)m.get("name");
		String addr=(String)m.get("addr");
		//INSERT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
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
	    	  pstmt.setString(1, name);
	    	  pstmt.setString(2, addr);
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
