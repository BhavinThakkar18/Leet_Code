class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> numSet(nums.begin(),nums.end());
        int res=0;
        for(int num:nums)
        {
            if(numSet.find(num-1)==numSet.end())
            {
                int cnt=0;
                int currNum=num;
            while(numSet.find(currNum)!=numSet.end())
            {
                cnt++;
                currNum++;
            }
            res=max(res,cnt);
            }
        }
        return res;
    }
};