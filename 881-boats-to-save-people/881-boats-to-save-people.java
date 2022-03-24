class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people); //[1,2,2,3] limit=3;
        int ans=people.length;
        int i=0;
        int j=people.length-1;
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                i++;
                j--;
            }
            else
            {
                j--;
            }
            count++;
        }
        return count;
    }
}
