class Solution:
    def get_count_key(s):
        count = [0] * 26
        for char in s:
            count[ord(char)-ord('a')] += 1
        return tuple(count)

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}
        for s in strs:
            sorted_key = "".join(sorted(s))
            groups[sorted_key] = groups.get(sorted_key, [])
            groups[sorted_key].append(s)
        result = []
        for x in groups.keys():
            result.append(groups.get(x))
        return result