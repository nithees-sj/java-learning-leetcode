// Definition for a Node.
// class Node {
//     public int val;
//     public Node prev;
//     public Node next;
//     public Node child;
// }

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        flattenDFS(head);
        return head;
    }

    private Node flattenDFS(Node node) {
        Node curr = node;
        Node last = null;

        while (curr != null) {
            Node next = curr.next;

            // If there is a child, flatten it
            if (curr.child != null) {
                Node childTail = flattenDFS(curr.child);

                // Connect current node with child
                curr.next = curr.child;
                curr.child.prev = curr;

                // If next exists, connect tail with next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                // Clear child pointer
                curr.child = null;

                // Move last to childTail
                last = childTail;
            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }
}