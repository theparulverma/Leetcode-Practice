/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

    
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);//copy kar rahe h harr node ki aur insert kar rahe h right mein
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        // random pointers ko aasign kar rahe h copy node.
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

    
        Node original = head;
        Node copied = head.next;
        Node result = head.next;

        while (original != null && copied != null) {
            original.next = original.next != null ? original.next.next : null;
            copied.next = copied.next != null ? copied.next.next : null;

            original = original.next;
            copied = copied.next;
        }

        return result;
    }
}
