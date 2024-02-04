class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) < len(t): return ''
        
        need, match, l, start, windowLen = Counter(t), 0, 0, 0, len(s) + 1
        
        for r, ch in enumerate(s):
            if ch in need:
                need[ch] -= 1
                match += need[ch] == 0

            while match == len(need):
                if windowLen > r - l + 1:
                    start, windowLen = l, r - l + 1
                
                removeCh = s[l]
                l += 1 
                if removeCh in need:
                    match -= need[removeCh] == 0
                    need[removeCh] += 1

        return s[start:start + windowLen] if windowLen <= len(s) else ''