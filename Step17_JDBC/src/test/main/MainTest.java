package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainTest {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정
		int num=2;
		String name="사과";
		String addr="문경";
				
		/*
		 * MemberDao객체를 생성해서 참조값을 dao라는 지역변수에 담기
		 */
		MemberDao dao=new MemberDao();
		
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
				
		boolean isSuccess=dao.update(dto);
		
		if(isSuccess) {
			System.out.println(name+"의 정보를 수정했습니다.");
		}else {
			System.out.println("회원정보 수정 실패!");
		}
	}
}
