

class Solution {
    public int pivotIndex(int[] arr) {
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int ls=0;
        int rs= sum;
        
        for(int i=0;i<arr.length;i++){
            rs= rs-arr[i];
            
            if(ls==rs){
                return i;
            }
            ls+=arr[i];
        }
        return -1;
    }
}