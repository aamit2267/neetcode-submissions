class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        return [h for h, _ in Counter(nums).most_common(k)]