class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        if set(sentence) == set("abcdefghijklmnopqrstuvwxyz"):
            return True

        return False