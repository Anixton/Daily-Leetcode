public class RandomizedSet {
    private Dictionary<int,int> itemSet;
    public RandomizedSet() {
        itemSet=new Dictionary<int,int>();
    }
    
    public bool Insert(int val) {
        bool returnVariable=true;
        if(itemSet.ContainsKey(val)){returnVariable=false;}
        else{itemSet.Add(val,1);}
        return returnVariable;
    }
    
    public bool Remove(int val) {
        bool returnVariable=false;
        if(itemSet.ContainsKey(val))
        {
            itemSet.Remove(val);
            returnVariable=true;
        }
        return returnVariable;
    }
    
    public int GetRandom() {
        Random random = new Random();
        int randomIndex = random.Next(0, itemSet.Count);
        int randomKey = itemSet.Keys.ElementAt(randomIndex);

        return randomKey;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * bool param_1 = obj.Insert(val);
 * bool param_2 = obj.Remove(val);
 * int param_3 = obj.GetRandom();
 */