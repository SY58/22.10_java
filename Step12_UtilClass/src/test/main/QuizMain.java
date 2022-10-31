package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		//sample 데이터
		Map<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");	
		
		/*
		 * (콘솔창에 아래와 같이 출력되도록 하기)
		 * 겁색할 단어를 입력하세요: house
		 * house 의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요: gura
		 * gura는 목록에 없습니다.
		 */
		//scanner , system.in , if~else
		
		Scanner scan=new Scanner(System.in);
		System.out.print("겁색할 단어를 입력하세요: ");
		String str=scan.nextLine();
		
		boolean isTrue=dic.containsKey(str);
		if (isTrue) {
			System.out.println(str+"의 뜻은 "+dic.get(str)+"입니다.");
		} else {
			System.out.println(str+"은(는) 목록에 없습니다.");
		}
	}
}
