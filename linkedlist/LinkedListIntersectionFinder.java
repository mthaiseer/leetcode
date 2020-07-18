package linkedlist;



public class LinkedListIntersectionFinder {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB ==  null){
            return null;
        }

        int lengthA = findLength(headA);
        int lengthB = findLength(headB);

        if(lengthA > lengthB){
            int diff = Math.abs(lengthA-lengthB);
            int ptr =0;
            ListNode nodeA = headA;
            while(ptr != diff){
                nodeA = nodeA.next;
                ptr++;
            }

            while(nodeA!= headB){
                if(nodeA == null || headB == null){
                    return null;
                }
                nodeA = nodeA.next;
                headB = headB.next;
            }

            return nodeA;
        }

        if(lengthA <lengthB){
            int diff = Math.abs(lengthA-lengthB);
            int ptr =0;
            ListNode nodeA = headB;
            while(ptr != diff){
                nodeA = nodeA.next;
                ptr++;
            }

            while(nodeA!= headB){
                if(nodeA == null || headB == null){
                    return null;
                }
                nodeA = nodeA.next;
                headB = headB.next;
            }

            return nodeA;
        }

        return null;

    }

    private int findLength(ListNode node){
        int length =0;
        if(node !=null){
            length++;
            node = node.next;
        }
        return length;
    }
}
