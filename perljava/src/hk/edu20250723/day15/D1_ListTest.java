package hk.edu20250723.day15;

import java.util.ArrayList;
import java.util.List;

import hk.edu20250715.day09.D2_Lotto;

public class D1_ListTest {

	public static void main(String[] args) {
		
		//List사용하기
		//제네릭 개념 : 타입을 나중에 정의하도록 선언하는 방법
		List<String> list = new ArrayList<String>();
//		List<Integer> aa = new ArrayList<>();
		list.add("한"); //값만 추가하면다면, 끝 위치에 자동으로 인덱스 생성되면서 추가
		list.add("경");
		list.add("닷");
		list.add("컴");
		
		
		for (int i = 0; i < list.size(); i++) {
		String str = list.get(i);
		System.out.println(str+"");
		}
		List list2 = new ArrayList();
		list2.add("A");
		String s = (String)list2.get(0);  // string <- object 강제 형변환 (String)으로 해야함
		System.out.println();
		
		System.out.println(list.contains("한")); //리스트값을 검색
		List<D2_Lotto>lot = new ArrayList<>();
		D2_Lotto lot2 = new D2_Lotto();
		lot.add(lot2);
		lot.add(lot2);
		lot.add(new D2_Lotto());
		System.out.println(lot.contains(new D2_Lotto()));
		list.add(1,"국");
		list.add(3,"제");
		list.remove(0); //삭제
		System.out.println(list);
		
		//목록 조회: 향상된 for문 사용
		for (String ss : list) {
			System.out.println(ss);
		}
		

	}

}
