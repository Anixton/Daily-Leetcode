class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        HashSet<String> alreadyExists = new HashSet<String>();
        List<String> result = new ArrayList<>();
        
        for(int i=0;i<folder.length;i++){
            boolean found=false;
            int traverse=1;
            
            while(traverse<folder[i].length()){
                while(traverse<folder[i].length() && folder[i].charAt(traverse)!='/'){
                    traverse++;
                } 
                
                if(alreadyExists.contains(folder[i].substring(0,traverse))){
                    found=true;
                    break;
                }
                traverse++;
            }
            
            if(!found && alreadyExists.contains(folder[i].substring(0,folder[i].length()))){
                found=true;
            }
            

            if(!found){
                alreadyExists.add(folder[i]);
                result.add(folder[i]);
            }
        }
        
        return result;
    }
}