package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		//student 클래스의 기본 생성자를 호출해서 객체를 생성하고 참조값을 s1이라는 이름의 지역변수에 담는다.
		Student s1=new Student();
		s1.study();
	}
}
