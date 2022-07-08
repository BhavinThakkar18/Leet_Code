class Solution {
    private HashMap<String, Integer> memo = new HashMap<>();

    private int calculateCost(int[] houses, int[][] cost, int m, int n, int target, int hIndex, int color,
            int neighborhoods) {
        String key = String.valueOf(hIndex) + "+" + String.valueOf(color) + "+" + String.valueOf(neighborhoods);

        if (neighborhoods > target) {
            memo.put(key, Integer.MAX_VALUE / 2);
            return Integer.MAX_VALUE / 2;
        }

        if (hIndex == m) {
            int value = (neighborhoods == target) ? 0 : Integer.MAX_VALUE / 2;
            memo.put(key, value);
            return value;
        }

        if (memo.containsKey(key)) {
            return memo.get(key);
        } else {
            int value = Integer.MAX_VALUE / 2;

            if (houses[hIndex] == 0) {
                for (int i = 0; i < n; i++) {
                    value = Math.min(value,
                            cost[hIndex][i] + calculateCost(houses, cost, m, n, target, hIndex + 1, i + 1,
                                    (color == i + 1) ? neighborhoods : neighborhoods + 1));
                }
            } else {
                value = Math.min(value,
                        calculateCost(houses, cost, m, n, target, hIndex + 1, houses[hIndex],
                                (color == houses[hIndex]) ? neighborhoods : neighborhoods + 1));
            }

            memo.put(key, value);
            return value;
        }
    }

    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int ans = calculateCost(houses, cost, m, n, target, 0, 0, 0);

        return (ans == Integer.MAX_VALUE / 2) ? -1 : ans;
    }
}
