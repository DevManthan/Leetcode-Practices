class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        ArrayList<Boolean> result = new ArrayList();
        for(int candie : candies){
            max = Math.max(max, candie);
        }
        for(int i = 0; i < candies.length;i++){
            if((candies[i] + extraCandies) >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;

    }
}