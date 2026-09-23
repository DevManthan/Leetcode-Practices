class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = new int[2];
        int aSum = 0;
        int bSum = 0;
        for(int x: aliceSizes){
            aSum += x;
        }
        for(int x: bobSizes){
            bSum += x;
        }

        int target = (aSum + bSum)/2;
        int diff = target - aSum;
        Set<Integer> set = new HashSet<>();
        for (int b : bobSizes) set.add(b);
        for(int x : aliceSizes){
            if(set.contains(x+diff)){
                return new int[]{x,x+diff};
            }
        }

        return new int[2];
       
    }

}