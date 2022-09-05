class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int [gain.length+1];
        int max_altitude=0;
        for(int i=1;i<gain.length+1;i++)
        {
            altitude[i]=altitude[i-1]+gain[i-1];
            if(altitude[i]>max_altitude)
            {
                max_altitude=altitude[i];
            }
        }
        return max_altitude;
    }
}