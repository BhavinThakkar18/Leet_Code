class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0 ,j=0;
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) {  
                i++;
            }
            else {
                j++;
            }
        }
        int k=0;
        int ans[]= new int [list.size()];   
        for(int m: list){   // creating array
            ans[k++]=m;
        }
        return ans;
    }
}