class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);
        int count = 0;

        for (int j = 0; j < items.size(); j++) {
            if (items.get(j).get(index).equals(ruleValue)) {
                count++;

            }
        }
        return count;
    }
}