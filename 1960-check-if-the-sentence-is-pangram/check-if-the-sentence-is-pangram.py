class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        flag = True
        st = "abcdefghijklmnopqrstuvwxyz"

        for ch in st:
            if ch not in sentence:
                flag = False
        
        return flag