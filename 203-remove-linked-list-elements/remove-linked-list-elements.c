#include <stdlib.h>

struct ListNode* removeElements(struct ListNode* head, int val) {
    if (head == NULL) {
        return NULL;
    }
    head->next = removeElements(head->next, val);
    if (head->val == val) {
        struct ListNode* next = head->next;
        free(head);
        return next;
    } else {
        return head;
    }
}
