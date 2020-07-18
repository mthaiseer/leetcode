package linkedlist;

/**
 *
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LoopStartNodeFinder {

    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        //find intersection point
        while (fast != null && fast.next != null) {


            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        //if no cycle then return null
        if (fast == null || fast.next == null) {
            return null;
        }


        //if cycle exists then move slow->head and fast remain same
        //move slow and fast one position each. if both meet then its the begining of cycle
        ListNode ptr1 = head;
        ListNode ptr2 = fast;
        while (ptr1 != ptr2) {

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }

        return ptr1;


    }
}
