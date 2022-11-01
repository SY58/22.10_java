package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass09 {
	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("바나나");
		names.add("딸기");
		names.add("복숭아");
		names.add("사과");
		names.add("오렌지");
		
		//반복자(Iterater)객체 얻어내기 (저장된 item을 일렬로 세웠다고 생각하면 됨)
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			//cursor를 다음칸으로 이동해서 커서가 위치한 곳의 item을 읽어오기
			String item=it.next();
			System.out.println(item);
		}
		//특정 item(데이터, 참조값) 존재 여부 알아내기
		boolean isContain=names.contains("바나나");
		//저장된 item의 갯수
		int size=names.size();
		//특정 item 삭제
		names.remove("딸기");
		//모든 item 삭제
		names.clear();
	}
}
