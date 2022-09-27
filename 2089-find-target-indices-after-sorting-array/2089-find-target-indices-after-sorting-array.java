import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            int copy=mid;
            if(nums[mid]==target)
            {
                while(mid>0 && nums[mid-1]==target)
                {
                    if(!ans.contains(mid-1))
                    {
                        ans.add(mid-1);
                    }
                    mid--;   
                }
                mid=copy;
                if(!ans.contains(mid))
                {
                    ans.add(mid);
                }
                mid=copy;
                while(mid<nums.length-1 && nums[mid+1]==target)
                {
                    if(!ans.contains(mid+1))
                    {
                        ans.add(mid+1);
                    }
                    mid++;
                    
                }
                Collections.sort(ans); 
                return ans;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        Collections.sort(ans); 
        return ans;
    }
}