package test.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class FriendDBConnect {
	//필드
	Connection frConn;
		
	//생성자
	public FriendDBConnect() {
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			frConn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB에 접속했습니다.");
		}		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//메소드, 리턴값
	public Connection getFrConn() {
		return frConn;
	}
}
