class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count={}
        good_pairs=0
        for num in nums:
            if num in count:
                good_pairs+=count[num]
                count[num]+=1
            else:
                count[num]=1
        return good_pairs        