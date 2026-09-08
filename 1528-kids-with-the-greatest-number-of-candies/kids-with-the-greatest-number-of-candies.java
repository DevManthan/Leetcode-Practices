class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList();
        for(int candie : candies){
            if(candie > max)
            max = candie;
        }
        for(int i = 0; i < candies.length;i++){
                result.add((candies[i] + extraCandies) >= max);
        }
        return result;

    }
}