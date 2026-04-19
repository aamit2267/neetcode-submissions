class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        cr_count = 1
        mx_count = 1
        nums = list(set(nums))
        nums.sort()
        for i in range(len(nums)-1):
            print(nums[i+1], nums[i])
            if abs(nums[i+1] - nums[i]) == 1:
                cr_count += 1
            else:
                cr_count = 1
            if cr_count > mx_count:
                mx_count = cr_count
        return mx_count
            