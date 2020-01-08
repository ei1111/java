package List;

import java.util.ArrayList;
import java.util.HashMap;

public class list_menual {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//list.size()
		//add는 추가
		list.add("Hello");
		list.add("world");
		
		//set은 변경
		list.set(1, "coding");
		
		//get은 데이터 값꺼내기
		String str = list.get(1);

		//remove는 데이터 제거
		list.remove(1);
		
		//clear 다제거
		list.clear();
		
		//데이터 유무
		boolean b = list.isEmpty();
		System.out.println(b);
		
		System.out.println("=============================================");
		System.out.println("=============================================");
		
		//Map 객체 생성 Map.size()
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//데이터 삽입
		map.put(0 , "Hello");
		map.put(1 , "world");
		
		//데이터 추출
		map.get(0);
		
		//데이터제거
		map.remove(1);
		
		//특정 데이터 유무 파악
		b = map.containsKey(0);
		System.out.println(b);
		
		b = map.containsValue("Hello");
		System.out.println(b);
		
		//데이터 전체제거
		map.clear();
		
		//데이터 유무
		b = map.isEmpty();
		
	}
}
