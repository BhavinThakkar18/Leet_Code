class Solution {
    public int compareVersion(String version1, String version2) {
        String[] numbers1=version1.split("\\.");
        String[] numbers2=version2.split("\\.");
        
        int maxLength = Math.max(numbers1.length,numbers2.length);
        for(int i=0;i<maxLength;i++)
        {
            int v1=i < numbers1.length ? Integer.parseInt(numbers1[i]) : 0;
            int v2=i < numbers2.length ? Integer.parseInt(numbers2[i]) : 0;
            if(v1 > v2)
            {
                return 1;
            }
            if(v1 < v2)
            {
                return -1;
            }
        }
        return 0;
    }
}