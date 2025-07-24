package hk.edu20250723.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D1_MapTest {

	public static void main(String[] args) {
		//Map-> key1:value
		//      key2:value
		//js -> Json 형식을 사용하는 객체가 있다
		//      {key1:value, key2:value..}
		//Map-> Json 형식으로 변환 할 수 있다
		
		Map<String, String> map = new HashMap<>();
		map.put("하나", "한경");
		map.put("둘", "닷컴");
		map.put("셋", "교육센터");
		map.put("셋", "센터교육");  //key중복되면 안됨
		
		System.out.println(map.get("하나")+","+map.get("둘"));
		//map에서 일괄적으로 데이터를 모두 가져오려면..
		Set<String> setKeyMap = map.keySet(); //key값만 set에 담아 반환
		Iterator<String> iter = setKeyMap.iterator();
		while(iter.hasNext()) {
			String str = iter.next();  //key값을 가져온다.
			System.out.println(map.get(str));
		}
		
		for(String str : setKeyMap) {
			System.out.println(map.get(str));
		}
		
	}
}
