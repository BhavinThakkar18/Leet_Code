class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        int i=0;
        int j=l-1;
        char temp;
        while(i<=j)
        {
            temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
    }
}