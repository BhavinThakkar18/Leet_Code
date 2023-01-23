class Solution {
    public int findJudge(int n, int[][] trust) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
        }
        for(Map.Entry<Integer,Integer> mapEle:map.entrySet()){
            if(mapEle.getValue()==n-1){
                ans=mapEle.getKey();
            }
        }
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==ans)
                return -1;
        }
        if(n==1 && trust.length==0)
            return 1;
        return ans==0?-1:ans;

    }
}