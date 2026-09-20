class Solution(object):
    def reverseDegree(self, s):
        """
        :type s: str
        :rtype: int
        """
        total_sum = 0
        
        # enumerate(s, 1) starts the character index at 1 instead of 0
        for i, char in enumerate(s, 1):
            # Calculate reversed alphabet position ('a' -> 26, 'b' -> 25, etc.)
            rev_val = 26 - (ord(char) - ord('a'))
            
            # Multiply the value by its position in the string and add to total
            total_sum += rev_val * i
            
        return total_sum
