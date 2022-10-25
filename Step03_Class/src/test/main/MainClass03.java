package test.main;

import test.mypac.Member;
/*
 * 1.한명의 회원정보를 담을 수 있는 객체를 생성할 Member 클래스를 test.mypac 패키지에 만들어 보세요.
 * 
 * 회원 한명의 정보는 번호, 이름, 주소로 이루어져 있다.
 * 따라서 3개의 필드를 적당한 데이터 type을 선언해서 만들어야 한다.
 */

public class MainClass03 {
	public static void main(String[] args) {
		//2. Member 클래스로 객체를 생성해서(new Member()) 참조값을 m1이라는 지역변수에 담아 보세요.
		Member m1=new Member();
		//3. m1에 담긴 참조값을 이용해서 1, 바나나, 서울이라는 정보를 객체에 저장해 보세요.
		m1.num=1;
		m1.name="바나나";
		m1.addr="서울";
		
		/*
		 * 비슷한 작업을 javascript로 한다면?
		 * 
		 * let m1={};
		 * m1.num=1;
		 * m1.name="바나나";
		 * m1.addr="서울";
		 * 
		 * or
		 * 
		 * let m1={num:1, name:"바나나", addr="서울"};
		 */
		
		//2, 딸기, 부산이라는 회원정보도 Member 객체에 담아보기
		Member m2=new Member();		
		m2.num=2;
		m2.name="딸기";
		m2.addr="부산";	
		
		//m1 안에 있는 참조값을 이용해서 콘솔창에 바나나의 정보를 아래와 같은 형식으로 출력해 보세요.
		//번호:1, 이름:바나나, 주소:서울
		System.out.println("번호:"+m1.num+", 이름:"+m1.name+", 주소:"+m1.addr);
	}
}
