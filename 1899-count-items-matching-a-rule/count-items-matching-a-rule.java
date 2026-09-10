class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type")) {
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(0).equals(ruleValue)) {
                    count++;

                }
            }
        }
        else if (ruleKey.equals("color")) {
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(1).equals(ruleValue)) {
                    count++;

                }
            }
        }
        else{
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(2).equals(ruleValue)) {
                    count++;

                }
            }
        }
        return count;
    }
}