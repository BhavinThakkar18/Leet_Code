class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        int wid = 0;
        for(int i: wall.get(0))
            wid += i;

        Map<Integer, Integer> cutMap = new HashMap<>();

        for(List<Integer> row: wall) { 
            int count = 0;
            for(int i: row) {
                count += i;
                if(count != wid) {
                    if(cutMap.containsKey(count)) {
                        cutMap.put(count, cutMap.get(count)+1);
                    } else {
                        cutMap.put(count, 1);
                    }
                }
                
            }
        }

        int result = wall.size();
        for(int i: cutMap.keySet()) {
            result = Math.min(result, wall.size() - cutMap.get(i));
        }

        return result;
    }
}