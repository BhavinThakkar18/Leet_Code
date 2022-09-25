class Solution {
    public int findComplement(int num) {
        // XOR with 1 would flip the bits
        long i=1;
        while(i<=num)
        {
            num^=i;
            i<<=1;
        }
        return num;
    }
}