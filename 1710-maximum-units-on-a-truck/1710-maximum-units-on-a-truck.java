class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        sortbyColumn(boxTypes,1);
        int ans=0;
        for(int i=0;i<boxTypes.length;i++)
        {
            if(boxTypes[i][0]<=truckSize)   
            {
                ans += boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0]; 
            }
            else if(boxTypes[i][0]>truckSize)
            {
                ans += truckSize*boxTypes[i][1];
                break;
            }
        
        }
        return ans;
    }
    public static void sortbyColumn(int[][] arr, int col)
    {
       Arrays.sort(arr, Comparator.comparingInt(o -> -o[1]));
    }
}