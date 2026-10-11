from typing import List
class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        newList = []
        for i in range(2):
            for num in nums:
                newList.append(num)
        return newList