import numpy as np
import heapq

class Solution:
    def mostBooked(self, n: int, meetings: List[List[int]]) -> int:
        meetings.sort()
        rooms = [0] * n
        counts = [0] * n
        heap = []
        for idx in range(len(meetings)):
            meeting = meetings[idx]
            duration = meeting[1] - meeting[0]
            while heap and heap[0][0] <= meeting[0]:
                ele = heapq.heappop(heap)
                rooms[ele[1]] = 0
            try:
                next_room = rooms.index(0)
            except:
                next_room = -1
            if next_room == -1:
                meeting[0] = heap[0][0]
                ele = heapq.heappop(heap)
                rooms[ele[1]] = 0
                next_room = rooms.index(0)
            rooms[next_room] = 1
            counts[next_room] += 1
            appender = [meeting[0] + duration, next_room]
            heapq.heappush(heap, appender)
        return np.argmax(counts)