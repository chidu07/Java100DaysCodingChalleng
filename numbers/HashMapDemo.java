

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		int a[]= {2,5,6,2,8,4,3,4,4,2};
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int key:a) {
			if(map.containsKey(key)) {
				map.put(key,map.get(key)+1 );
			}
			else {
				map.put(key,1);
			}
			
		}
		System.out.println(map);
		//print non repeated value
		System.out.println("non repeated value");
		for(int key:map.keySet()) {
			if(map.get(key)==1) {
				System.out.println(key);
			}
		}
		System.out.println(" repeated value");
		for(int key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key);
			}
		}
		System.out.println(" count of duplicate value");
		for(int key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key+"->"+map.get(key));
			}
		}
		
		System.out.println("Another way");
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}
