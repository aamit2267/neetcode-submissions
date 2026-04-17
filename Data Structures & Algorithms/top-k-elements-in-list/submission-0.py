class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        h = {}
        for n in nums:
            if n not in h:
                h[n] = 0
            h[n] += 1
        h = list(dict(sorted(h.items(), key=lambda item: item[1], reverse=True)))
        return h[0:k]