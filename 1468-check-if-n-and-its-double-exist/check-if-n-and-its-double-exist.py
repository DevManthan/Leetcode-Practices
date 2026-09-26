class Solution(object):
    def checkIfExist(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        seen = {}
        for index, a in enumerate(arr):
            if (a*2 in seen) or (a%2 == 0 and a/2 in seen):
                return True
                
            seen[a] = index

        return False
        
        