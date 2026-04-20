class Solution:
    def trap(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        t = 0
        lmax = 0
        rmax = 0
        while l<r:
            lmax = max(lmax, height[l])
            rmax = max(rmax, height[r])
            if height[l] < height[r]:
                t = t + lmax - height[l]
                l += 1
            else:
                t = t + rmax - height[r]
                r -= 1
        
        return t
        