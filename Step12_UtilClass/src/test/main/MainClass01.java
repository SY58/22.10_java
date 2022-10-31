package test.main;

import java.util.ArrayList;
import java.util.List;

/*
 * java에서 배열은 크기를 조절할 수 없는 고정 배열이다.
 * 따라서 동적으로 item을 추가하고 삭제하고 하는 작업을 하려면 일반배열은 사용할 수 없다.
 * 그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//String type을 저장할 수 있는 ArrayList 객체생성
		List<String> names=new ArrayList<>();
		//"바나나", "딸기", "복숭아" 3개의 String type을 저장해 보세요.
		names.add("바나나");
		names.add("딸기");
		names.add("복숭아");
		//0번방의 아이템을 불러와서 item이라는 변수에 담아보세요.
		String item=names.get(0);
		//1번방의 아이템을 삭제하려면?
		names.remove(1);
		//0번방에 "아이스크림"을 넣고 싶으면?
		names.add(0, "아이스크림");
		//저장된 아이템의 갯수(size)를 size라는 지역변수에 담아 보세요.
		int size=names.size();
		//저장된 모든 아이템 전체 삭제
		names.clear();
	}
}
