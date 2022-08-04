class Solution {
    public int mirrorReflection(int p, int q) {
        
        while(p%2==0 && q%2==0){   //keep dividing by 2 until one is odd
            p/=2;
            q/=2;
        }
        
        
        if(p%2==0 && q%2!=0) return 2;   //if p is even and q is odd
        
        if(p%2!=0 && q%2==0) return 0;   //if p is odd and q is even
        
        if(p%2!=0 && q%2!=0) return 1;  //if both p and q are odd
        
        return -1;
        
    }
}