/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var removeNodes = function(head) {
    let maxSoFar = 0;
    let result = null;
    
    const helper = function(current) {
        if(current == null) return;
        
        helper(current.next);
        
        if(current.val >= maxSoFar) {
            maxSoFar = current.val;
            current.next = result;
            result = current;
        }
    }
    
    helper(head);
    return result;
};