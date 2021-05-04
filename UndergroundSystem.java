package LeetCode.March;

import java.util.HashMap;

class UndergroundSystem {
    
    public static class Average{
        int sum;
        int trips;
        public Average(int sum, int trips){
            this.sum = sum;
            this.trips = trips;
        }
    }
    public static class Start{
    	String start;
    	int time;
    	public Start(String start,int time) {
    		this.start = start;
    		this.time = time;
    	}
    }
    
    HashMap<Integer,Start> customers;
    HashMap<String,HashMap<String,Average>> lines;

    public UndergroundSystem() {
    	customers = new HashMap<Integer,Start>();
        lines = new HashMap<String,HashMap<String,Average>>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        customers.put(id, new Start(stationName,t));
        if(!lines.containsKey(stationName)) {
        	lines.put(stationName, new HashMap<String,Average>());
        }
    }
    
    public void checkOut(int id, String stationName, int t) {
    	if(lines.get(customers.get(id).start).containsKey(stationName)) {
    		
    		Average temp = lines.get(customers.get(id).start).get(stationName);
    		temp.sum += (t-customers.get(id).time);
    		temp.trips++;	
    		
    	}
        lines.get(customers.get(id).start).put(stationName,new Average(t-customers.get(id).time,1));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        Average temp = lines.get(startStation).get(endStation);
        return (double)temp.sum/(double)temp.trips;
    }
}
