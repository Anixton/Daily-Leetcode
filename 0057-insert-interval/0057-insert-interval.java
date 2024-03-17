class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int[][] result = new int[1][2];
            result[0][0] = newInterval[0];
            result[0][1] = newInterval[1];
            
            return result;
        }
        
        List<List<Integer>> arrangedIntervals = new ArrayList<>();
        int index = 0;
        boolean added = false;
        
        if(intervals[0][0]>newInterval[1]){
            List<Integer> current = new ArrayList<>();
            current.add(newInterval[0]);
            current.add(newInterval[1]);
                
            arrangedIntervals.add(current);
            added=true;
        }
        
        while(index<intervals.length) {
            if(intervals[index][0] > newInterval[1]){
                if(!added){
                    List<Integer> middle = new ArrayList<>();
                    middle.add(newInterval[0]);
                    middle.add(newInterval[1]);
                
                    arrangedIntervals.add(middle);
                    added=true;
                }
                
                List<Integer> current = new ArrayList<>();
                current.add(intervals[index][0]);
                current.add(intervals[index][1]);
                
                arrangedIntervals.add(current);
            }
            
            else if(intervals[index][1] < newInterval[0]){
                List<Integer> current = new ArrayList<>();
                current.add(intervals[index][0]);
                current.add(intervals[index][1]);
                
                arrangedIntervals.add(current);
            }
            
            else {
                List<Integer> current = new ArrayList<>();
                current.add(Math.min(intervals[index][0],newInterval[0]));
                
                while(index+1<intervals.length && intervals[index+1][0]<=newInterval[1]){
                    index++;
                }
                
                current.add(Math.max(intervals[index][1],newInterval[1]));
                arrangedIntervals.add(current);
                added=true;
            }
            index++;
        }
        
        if(!added){
            List<Integer> current = new ArrayList<>();
            current.add(newInterval[0]);
            current.add(newInterval[1]);
                
            arrangedIntervals.add(current);
        }
        
        int[][] result = new int[arrangedIntervals.size()][2];
        
        for(int i=0;i<arrangedIntervals.size();i++){
            result[i][0] = arrangedIntervals.get(i).get(0);
            result[i][1] = arrangedIntervals.get(i).get(1);
        }
        
        return result;
        // convert arrangedIntervals to 2d array
    }
}