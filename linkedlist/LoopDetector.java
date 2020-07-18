package linkedlist;

public class LoopDetector {

    public boolean hasCycle(ListNode head) {


        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;


        while(fast != slow ){

            if(fast == null || fast.next == null ){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;

    }
}
