package test.main;

import java.util.HashMap;
/*
 * java에서 어떤 데이터를 key:value의 쌍으로 관리하고 싶으면 HashMap객체를 사용한다.
 * key의 generic도 마음대로 지정할수있지만 보통 String type으로 한다.
 * value의 generic은 그때그때 다르지만 value가 여러가지 type이면 Object로 지정한다.
 */
public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 번호:1, 이름:바나나, 남자여부:false (숫자,문자,불리언)
		 */
		HashMap<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "바나나");
		map1.put("isMan", false);
		
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		//동일한 key 값으로 다시 담으면서 수정
		map1.put("name", "무화과");
		//특정 key 값으로 담긴 내용 삭제, 성공하면 true 실패하면 false 리턴
		map1.remove("isMan");
		//모두 삭제
		map1.clear();
	}
}
