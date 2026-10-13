class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            // 1. Shift from 1-indexed to 0-indexed system
            columnNumber--;
            // 2. Get the remainder to isolate the current rightmost character
            int remainder = columnNumber % 26;
            // 3. Convert remainder to its ASCII character representation ('A' is 65)
            char ch = (char) ('A' + remainder);
            result.append(ch);
            // 4. Divide by 26 to move to the next position
            columnNumber /= 26;
        }
        // The characters were collected right-to-left, so reverse the string
        return result.reverse().toString();
    }
}
