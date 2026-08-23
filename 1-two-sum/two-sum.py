class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        seen = {}
        for index, a in enumerate(nums):
            compliment = target - a

            if compliment in seen:
                return [seen[compliment], index]
                
            seen[a] = index

        return []