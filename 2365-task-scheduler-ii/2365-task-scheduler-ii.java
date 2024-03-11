class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        long dayCount = 1;
        HashMap<Integer,Long> taskDate = new HashMap<Integer,Long>();
        
        for(int i=0;i<tasks.length;i++){
            if(!taskDate.containsKey(tasks[i])){
                taskDate.put(tasks[i],dayCount);
                dayCount++;
            } else {
                if(dayCount<=space+taskDate.get(tasks[i])){
                    dayCount=space+taskDate.get(tasks[i])+1;
                }
                
                taskDate.put(tasks[i],dayCount);
                dayCount++;
            }
        }

        return dayCount-1;
    }
}