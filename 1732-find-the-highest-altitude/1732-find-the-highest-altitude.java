class Solution {
    public int largestAltitude(int[] gain) {
        // int[] altitude = new int [gain.length+1];
        int max_altitude=0;
        int temp=0;
        for(int i=1;i<gain.length+1;i++)
        {
            temp+=gain[i-1];
            if(temp>max_altitude)
            {
                max_altitude=temp;
            }
        }
        return max_altitude;
    }
}