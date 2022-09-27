import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //sort an array
        Arrays.sort(nums);
        
        List<Integer> ans = new ArrayList<Integer>();
        int start=0;
        int end=nums.length-1;
        
        //binary search
        while(start<=end)
        {
            int mid = start + (end-start)/2; // find mid index
            int copy=mid;  // have a copy of mid index
            if(nums[mid]==target)
            {
                // check left side (i.e consider middle element as target)
                while(mid>0 && nums[mid-1]==target)
                {
                    if(!ans.contains(mid-1))
                    {
                        ans.add(mid-1);
                    }
                    mid--;   
                }
                //add mid element
                mid=copy;
                if(!ans.contains(mid))
                {
                    ans.add(mid);
                }
                mid=copy;
                // check right side (i.e consider middle element as target)
                while(mid<nums.length-1 && nums[mid+1]==target)
                {
                    if(!ans.contains(mid+1))
                    {
                        ans.add(mid+1);
                    }
                    mid++;
                    
                }
                //sort ans before return
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
        //sort ans before return
        Collections.sort(ans); 
        return ans;
    }
}