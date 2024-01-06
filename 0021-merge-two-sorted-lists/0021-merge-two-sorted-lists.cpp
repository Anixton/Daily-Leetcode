/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (list1 == NULL) {
            if (list2 == NULL) {
                return NULL;
            } else {
                return list2;
            }
        }

        else if (list2 == NULL) {
            return list1;
        }

        else {
            ListNode* result = NULL;
            ListNode* head = NULL;
            ListNode* l1 = list1;
            ListNode* l2 = list2;

            while (l1 != NULL && l2 != NULL) {
                if (l1->val < l2->val) {
                    if (result == NULL) {
                        result = l1;
                        head = result;
                    } else {
                        result->next = l1;
                        result = result->next;
                    }

                    l1 = l1->next;
                }

                else {
                    if (result == NULL) {
                        result = l2;
                        head = result;
                    } else {
                        result->next = l2;
                        result = result->next;
                    }

                    l2 = l2->next;
                }
            }

            if (l1 != NULL) {
                result->next = l1;
            }

            if (l2 != NULL) {
                result->next = l2;
            }
            
            return head;
        }
    }
};