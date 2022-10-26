package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 0~9 사이의 랜덤한 정수를 얻어내서 콘솔창에 출력하고 싶다면.
		 * hint) Random 클래스를 import해서 사용해 보세요. 
		 */
		
		//Random 객체를 생성해서
		Random r1=new Random();
		//NextInt(메소드를 호출해서 정수 하나를 리턴ㅂ당아서
		int ranNum=r1.nextInt(10);		
		//콘솔창에 출력해보기
		System.out.println(ranNum);
		
		//1~45사이의 랜덤한 정수 하나를 얻어내서 ranNum2라는 지역변수에 담아 보세요.
		int ranNum2=r1.nextInt(45)+1;
		int ranNum3=r1.nextInt(1,46);
		//True or False중에 랜덤한 boolean 값을 얻어내서 isRun이라는 지역변수에 담아보세요.
		boolean isRun=r1.nextBoolean();
	}
}
