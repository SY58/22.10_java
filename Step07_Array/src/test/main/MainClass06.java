package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		//1.문자열을 저장할수있는 방 5개짜리 배열객체를 생성해서 참조값을 msgs라는 지역변수에 담는다.
		String[] msgs=new String[5];
		//2. 키보드로부터 입력받을 수 있는 Scanner객체를 생성해서 참조값을 scan이라는 지역변수에 담는다.
		Scanner scan=new Scanner(System.in);
		//3. 반복문을 위에서 생성한 배열의 방의 갯수만큼 돌면서 키보드로부터 문자열을 입력받아서
		//   배열에 순서대로 저장한다.
		for(int i=0; i<msgs.length; i++) {
			System.out.print("문자열 입력:");
			//문자열 한줄 입력 받기
			String line=scan.nextLine();			
			//배열의 i번째 방에 저장			
			msgs[i]=line;
			//msgs[i]=scan.nextLine(); 위 2줄을 1줄로 쓴것
		}		
		//4. 반복문 돌면서 배열에 저장되었던 모든 문자열을 순서대로 콘솔창에 출력한다.
		for(int i=0; i<msgs.length; i++) {
			String tmp=msgs[i];
			System.out.println(tmp);
			//System.out.println(msgs[i]); 위 2줄을 1줄로 쓴것 
		}
	}
}
