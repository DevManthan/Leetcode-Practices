class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = {}
        totalCount = 0
        for num in nums:
            if num in count:
                totalCount += count[num]
                count[num] += 1
            else:
                count[num] = 1


        return totalCount