class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for f in nums:
            if f in seen:
                return True
            seen.add(f)
        return False