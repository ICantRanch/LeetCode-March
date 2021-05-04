package LeetCode.March;

import java.util.HashSet;
import java.util.List;

public class EnterRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		
		HashSet<Integer> visited = new HashSet<>();
		roomClear(0,rooms,visited);
		
		System.out.println(visited);
		
		return visited.size() == rooms.size();
	}
	
	public void roomClear(int roomNum,List<List<Integer>> rooms,HashSet<Integer> visited) {
		
		for (Integer key : rooms.get(roomNum)) {
			
			if(!visited.contains(key)) {
				visited.add(key);
				roomClear(key,rooms,visited);
			}
		}
	}

}
