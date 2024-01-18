class Solution {
public:
    int climbStairs(int n) {
        
        vector<int> vec={0,1,2,3};
        int count=4;

        while(count<n+1)
        {   
            vec.push_back(vec.at(count-1)+vec.at(count-2));
            count++;
        }
        return vec.at(n);
    }
};