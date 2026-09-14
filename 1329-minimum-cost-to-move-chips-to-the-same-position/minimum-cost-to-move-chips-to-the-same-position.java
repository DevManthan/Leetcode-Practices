class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int index : position){
            if(index % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        return even > odd ? odd : even;
    }
}