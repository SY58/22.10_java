package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아 보세요.
		List<Member> members=new ArrayList<>();
		//2. 3명의 회원정보를 Member객체에 담아 보세요.(Member객체가 3개 생성되어야 함)
		Member m1=new Member();
		m1.num=1;
		m1.name="바나나";
		m1.addr="서울";
		Member m2=new Member(2,"딸기","부산");
		Member m3=new Member(3,"복숭아","대전");		
		//3. 위에서 생성된 Member 객체의 참조값을 members List 객체에 모두 담아 보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		/*
		 * 4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로
		 *    반복문 돌면서 출력해 보세요.
		 * 
		 * 번호: 1, 이름: 바나나, 주소: 서울
		 * 번호: 2, 이름: 딸기, 주소: 부산
		 * 
		 */
		for(Member tmp:members) {
			System.out.println("번호: "+tmp.num+", 이름: "+tmp.name+", 주소: "+tmp.addr);
		}
		System.out.println("---기본 for문---");
		for(int i=0; i<members.size(); i++) {
			System.out.println("번호: "+members.get(i).num+", 이름: "+members.get(i).name+", 주소: "+members.get(i).addr);
		}
	}
}
