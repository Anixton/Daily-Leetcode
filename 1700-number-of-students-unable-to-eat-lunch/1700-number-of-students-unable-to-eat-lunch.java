class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sandwichIndex = 0;
        Queue<Integer> myQ = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            myQ.add(students[i]);
        }
        
        int result = 0;
        
        while(!myQ.isEmpty()) {
            boolean found = false;
            for(int i=0;i<myQ.size();i++){
                int current = myQ.poll();
                if(current == sandwiches[sandwichIndex]){
                    sandwichIndex++;
                    found = true;
                    break;
                } else {
                    myQ.add(current);
                }
            }
            
            if(!found){
                return myQ.size();
            }
        }
        
        return myQ.size();
    }
}