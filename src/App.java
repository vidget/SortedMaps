import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		// HashMap doesn't keep your values in any type of order.
		//even though a HashMap may appear in order do not rely on it being in order
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Same a HashMap but has a linked list connecting the entries in order
		// to provide ORDER
		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();

		// Sorts by the natural order for Integers it would 1,2,3,4 for strings
		// it would be Alphabetical
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//appears to be in order by may not always be....
		testMap(hashmap);
		
		//keeps it in the ordered entered...
		testMap(linkedhashmap);
		
		//maintains a natual logical order sorting the keys. 
		testMap(treeMap);
			
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(2, "Cat");
		map.put(1, "Dog");
		map.put(3, "Mouse");
		map.put(4, "Bird");
		map.put(0, "Human");
		map.put(7, "Bear");
		map.put(5, "Snake");

		for(Integer key: map.keySet()){
			String value = map.get(key);
			System.out.println(value);
		}
		
		
		
	}

}
