class Solution(object):
    def twoSum(self, numbers, target):
        seen={} # {number:index}
        for i,num in enumerate(numbers):
            complement=target-num  

            if complement in seen:
                return [seen[complement]+1,i+1]
                
            seen[num]=i