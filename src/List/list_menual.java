package List;

import java.util.ArrayList;
import java.util.HashMap;

public class list_menual {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//list.size()
		//add�� �߰�
		list.add("Hello");
		list.add("world");
		
		//set�� ����
		list.set(1, "coding");
		
		//get�� ������ ��������
		String str = list.get(1);

		//remove�� ������ ����
		list.remove(1);
		
		//clear ������
		list.clear();
		
		//������ ����
		boolean b = list.isEmpty();
		System.out.println(b);
		
		System.out.println("=============================================");
		System.out.println("=============================================");
		
		//Map ��ü ���� Map.size()
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//������ ����
		map.put(0 , "Hello");
		map.put(1 , "world");
		
		//������ ����
		map.get(0);
		
		//����������
		map.remove(1);
		
		//Ư�� ������ ���� �ľ�
		b = map.containsKey(0);
		System.out.println(b);
		
		b = map.containsValue("Hello");
		System.out.println(b);
		
		//������ ��ü����
		map.clear();
		
		//������ ����
		b = map.isEmpty();
		
	}
}
