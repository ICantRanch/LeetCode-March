package LeetCode.March;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

	static class keyVal{
		
		int key;
		int val;
		
		public keyVal(int key, int val) {
			this.key = key;
			this.val = val;
		}
		
		
	}
	
	List<keyVal> map;
	
	
	public MyHashMap() {
		
		map = new ArrayList<keyVal>();
		
	}
	
	public void put(int key, int value) {

		int index = checkKey(key);
		
		if(index != -1) {
			map.get(index).val = value;
		}else {
			map.add(new keyVal(key, value));
		}
	}
	
	
	public int get(int key) {
		
		int index = checkKey(key);
		
		return index == -1 ? -1: map.get(index).val;
		

	}
	
    public void remove(int key) {
        
    	int index = checkKey(key);
    	if(index != -1) {
    		map.remove(index);
    	}
    	
    }
	
	
	public int checkKey(int key) {
		
		for (int i = 0; i < map.size(); i++) {
			if(map.get(i).key == key) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
