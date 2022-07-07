class ListNode {
    char data;
    ListNode next;
    public ListNode(char data) {
        this.data = data;
    }
}

public class PalindromeLinkedList {
    ListNode start;
    
    ListNode reverseIterateRec(ListNode currentNode, ListNode prevNode) {
        if(currentNode == null) {
            return prevNode;
        }
        ListNode nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseIterateRec(nextNode, currentNode);
    }

    boolean palindrome() {
        ListNode slow, fast;
        slow = fast = start;
        ListNode prev = null, midNode = null;
        // Move to the middle of the Linked List
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // For odd number of characters
        if(fast != null) {
            midNode = slow;
            slow = slow.next;
        }

        ListNode secondHalf = slow;
        prev.next = null;
        secondHalf = reverseIterateRec(secondHalf, null);
        boolean result = compare(start, secondHalf);
        secondHalf = reverseIterateRec(secondHalf, null);
        if(midNode != null) {
            prev.next = midNode;
            midNode.next = secondHalf;
        }
        return result;
        
    }

    boolean compare(ListNode a, ListNode b) {
        while(a != null && b != null) {
            if(a.data == b.data) {
                a = a.next;
                b = b.next;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList obj = new PalindromeLinkedList();
        obj.start = new ListNode('m');
        obj.start.next = new ListNode('a');
        obj.start.next.next = new ListNode('d');
        obj.start.next.next.next = new ListNode('d');
        obj.start.next.next.next.next = new ListNode('a');
        obj.start.next.next.next.next.next = new ListNode('m');

        System.out.println(obj.palindrome());

    }

}
