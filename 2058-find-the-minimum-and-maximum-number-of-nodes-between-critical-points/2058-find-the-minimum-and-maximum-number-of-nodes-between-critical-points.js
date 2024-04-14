/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number[]}
 */
var nodesBetweenCriticalPoints = function(head) {
    let extremeIndices = [];
    
    let beforeMiddle = head.val;
    let middle = head.next.val;
    let middleIndex = 1;
    
    head = head.next;
    head = head.next;
    
    while(head != null) {
        if(middle > beforeMiddle && middle > head.val) {
            extremeIndices.push(middleIndex);
        }
        
        if(middle < beforeMiddle && middle < head.val) {
            extremeIndices.push(middleIndex);
        }
        
        beforeMiddle = middle;
        middle = head.val;
        head = head.next;
        middleIndex++;
    }
    
    if(extremeIndices.length < 2) {
        return [-1, -1];
    }
    
    let minimumDistance = Number.MAX_VALUE;
    
    for(let index = 1; index < extremeIndices.length; index++) {
        minimumDistance = Math.min(minimumDistance, extremeIndices[index] - extremeIndices[index - 1]);
    }
    
    let maximumDistance = extremeIndices[extremeIndices.length - 1] - extremeIndices[0];
    
    return [minimumDistance, maximumDistance];
};