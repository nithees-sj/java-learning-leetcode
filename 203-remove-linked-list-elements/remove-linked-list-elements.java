class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode c= new ListNode(-1);
       ListNode tempC = c;
       ListNode temp = head;
       while(temp!=null){
        if(temp.val!=val){
            tempC.next = temp;
            tempC =temp;
        }
        temp = temp.next;
       } 
       tempC.next = null;
       return c.next;
    }
}