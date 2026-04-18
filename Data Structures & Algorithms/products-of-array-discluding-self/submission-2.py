class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        h = dict(Counter(nums))
        n = len(nums) 
        try:
            if h[0] > 1:
                return [0] * n
        except:
            pass

        r = []
        for i in range(0, n):
            if nums[i] == 0:
                r.append(int(math.prod(nums[0:i])*math.prod(nums[i+1:n])))
            else:
                r.append(int(math.prod(nums)/nums[i]))
        return r