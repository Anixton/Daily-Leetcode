/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        
        ListNode traversel = head;
        boolean  turnOnOdd = true;
        
        while(traversel!=null){
            if(turnOnOdd){
                oddList.add(traversel.val);
                turnOnOdd=false;
            } else {
                evenList.add(traversel.val);
                turnOnOdd=true;
            }
            
            traversel=traversel.next;
        }
        
        traversel=head;
        for(int i=0;i<oddList.size();i++){
            traversel.val=oddList.get(i);
            traversel=traversel.next;
        }
        
        for(int j=0;j<evenList.size();j++){
            traversel.val=evenList.get(j);
            traversel=traversel.next;
        }
        
        return head;
    }
}