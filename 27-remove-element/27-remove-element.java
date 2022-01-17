class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int index = 0;
        int k =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                ++k;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                index = i;
                break;
            }
        }
        System.out.println("index= "+index);
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
//        //System.out.print("[");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + ", ");
//        }
//        System.out.println("]");
        return (nums.length-k);

    }
}