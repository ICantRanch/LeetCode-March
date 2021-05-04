package LeetCode.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OceanFlow {
	
	public static class Flow{
		
		boolean pacific;
		boolean atlantic;
		public Flow() {}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pacificAtlantic(new int[][] {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}});
		
	}
	
	
	public static List<List<Integer>> pacificAtlantic(int[][] heights) {
		
		Flow[][] flows = new Flow[heights.length][heights[0].length];
		
		for (int i = 0; i < flows.length; i++) {
			for (int j = 0; j < flows.length; j++) {
				flows[i][j] = new Flow();
			}
		}
		
		List<List<Integer>> result = new ArrayList<>();
		
		
		
		
		
		for (int i = 0; i < flows.length; i++) {
			for (int j = 0; j < flows[0].length; j++) {
				System.out.print(flows[i][j].pacific + "," + flows[i][j].atlantic + "   ");
			}
			System.out.println();
		}
		System.out.println();

		
		
		
		
		for (int i = 0; i < flows.length; i++) {
			
			update(i,0,true,flows,heights,result);
			update(i,flows[0].length-1,false,flows,heights,result);
		}
		for (int j = 0; j < flows[0].length; j++) {
			
			update(0,j,true,flows,heights,result);
			update(flows.length-1,j,false,flows,heights,result);
		}
		
		for (int i = 0; i < flows.length; i++) {
			for (int j = 0; j < flows[0].length; j++) {
				System.out.print(flows[i][j].pacific + "," + flows[i][j].atlantic + "   ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (List<Integer> is : result) {
			System.out.println(is);
		}

		return result;
	}
	
	public static void update(int y, int x, boolean aOrp,Flow[][] flows,int[][] heights,List<List<Integer>> result) {

		//aOrp false == atlantic, true == pacific
		
		if(aOrp) {
			
			if(flows[y][x].pacific == true) {return;}
			System.out.printf("Pacific Current: %d,%d\n",y,x);
			flows[y][x].pacific = true;
		}else {

			if(flows[y][x].atlantic == true) {return;}
			System.out.printf("Atlantic Current: %d,%d\n",y,x);
			flows[y][x].atlantic = true;
		}
		if(flows[y][x].pacific && flows[y][x].atlantic) {result.add(new ArrayList<>(Arrays.asList(y,x)));}
		
		if(y+1 < heights.length && heights[y+1][x] >= heights[y][x]) {
			System.out.println("Down");
			update(y+1,x,aOrp,flows,heights,result);
		}
		if(y-1 >= 0 && heights[y-1][x] >= heights[y][x]) {
			System.out.println("Up");
			update(y-1,x,aOrp,flows,heights,result);
		}
		if(x+1 < heights[0].length && heights[y][x+1] >= heights[y][x]) {
			System.out.println("Right");
			update(y,x+1,aOrp,flows,heights,result);
		}
		if(x-1 >= 0 && heights[y][x-1] >= heights[y][x]) {
			System.out.println("Left");
			update(y,x-1,aOrp,flows,heights,result);
		}
	}

	
}	
