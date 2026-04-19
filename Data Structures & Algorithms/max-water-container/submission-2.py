class Solution:
    def maxArea(self, heights: List[int]) -> int:
        area = 0
        l = 0
        r = len(heights) - 1
        while l < r:
            minheight = min(heights[l], heights[r])
            width = r-l
            area = max(area, minheight * width)

            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1
        return area
