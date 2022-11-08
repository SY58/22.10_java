package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.FriendDto;
import test.util.FriendDBConnect;

public class FriendDao {
	//멤버 한명의 정보를 저장,수정,삭제,열람하는 메소드
	//getList, getData 메소드
	
	//insert
	public boolean insert(FriendDto dto) {
		Connection frconn=null;
		PreparedStatement pstmt=null;		
		int rowCount=0;
		
		try {
			frconn=new FriendDBConnect().getFrConn();
			String sql="INSERT INTO friend"
					+" (num, name, phone, birth)"
					+" VALUES(member_seq.NEXTVAL, ?, ?, ?)";			
			pstmt=frconn.prepareStatement(sql);			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getBirth());
			rowCount=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(frconn!=null) {frconn.close();}
			} catch (SQLException e) {}			
		}	
		if(rowCount>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//update
	public boolean update(FriendDto dto) {
		Connection frconn=null;
		PreparedStatement pstmt=null;		
		int rowCount=0;
		
		try {
			frconn=new FriendDBConnect().getFrConn();
			String sql="UPDATE friend"
					+" SET name=?, phone=?, birth=?"
					+" WHERE num=?";			
			pstmt=frconn.prepareStatement(sql);			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getBirth());
			pstmt.setInt(4, dto.getNum());
			rowCount=pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(frconn!=null) {frconn.close();}
			} catch (SQLException e) {}			
		}	
		if(rowCount>0) {
			return true;
		}else {
			return false;
		}
	}	
	
	//delete
	public boolean delete(int num) {
		Connection frconn=null;
		PreparedStatement pstmt=null;		
		int rowCount=0;
		
		try {
			frconn=new FriendDBConnect().getFrConn();
			String sql="DELETE FROM friend"
					+" WHERE num=?";			
			pstmt=frconn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rowCount=pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(frconn!=null) {frconn.close();}
			} catch (SQLException e) {}			
		}	
		if(rowCount>0) {
			return true;
		}else {
			return false;
		}
	}

	//getList(select 전체)
	public List<FriendDto> getList() {
		List<FriendDto> list=new ArrayList<>();
		
		Connection frconn=null;
		PreparedStatement pstmt=null;		
		ResultSet result=null;
		
		try {
			frconn=new FriendDBConnect().getFrConn();
			String sql="SELECT num, name, phone, TO_CHAR(birth)"					
					+" FROM friend"
					+" ORDER BY num ASC";			
			pstmt=frconn.prepareStatement(sql);			
			result=pstmt.executeQuery();
			while(result.next()) {
				FriendDto dto=new FriendDto();
				dto.setNum(result.getInt("NUM"));
				dto.setName(result.getString("NAME"));
				dto.setPhone(result.getString("PHONE"));
				dto.setBirth(result.getString("TO_CHAR(BIRTH)"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(result!=null) {result.close();}
				if(pstmt!=null) {pstmt.close();}
				if(frconn!=null) {frconn.close();}
			} catch (SQLException e) {}			
		}
		return list;
	}
		
	//getData(select 일부만)
	public FriendDto getData(int num) {		
		FriendDto dto=null;
		
		Connection frconn=null;
		PreparedStatement pstmt=null;		
		ResultSet result=null;
		
		try {
			frconn=new FriendDBConnect().getFrConn();
			String sql="SELECT num, name, phone, TO_CHAR(birth)"					
					+" FROM friend"
					+" WHERE num=?"
					+" ORDER BY num ASC";			
			pstmt=frconn.prepareStatement(sql);
			pstmt.setInt(1, num);
			result=pstmt.executeQuery();
			while(result.next()) {
				dto=new FriendDto();
				dto.setNum(result.getInt("num"));
				dto.setName(result.getString("name"));
				dto.setPhone(result.getString("phone"));
				dto.setBirth(result.getString("TO_CHAR(birth)"));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(result!=null) {result.close();}
				if(pstmt!=null) {pstmt.close();}
				if(frconn!=null) {frconn.close();}
			} catch (SQLException e) {}			
		}
		return dto;
	}	
}
