public class MergeTwoList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while(l1 != null && l2!= null){
            if(l1.val>l2.val){
                current.next = l2;
                l2 = l2.next;
            }else{
                current.next = l1;
                l1 = l1.next;
            }

            current = current.next;
        }

        current.next = (l1!=null)?l1:l2;

        return dummy.next;
        }

    public static ListNode createList(int[] head){
        ListNode dummy = new ListNode(head[0]);
        ListNode current = dummy;

        for(int i=1;i<head.length;i++){
            current.next = new ListNode(head[i]);
            current = current.next;
        }

        return dummy;
    }

    public static void printList(ListNode head){
        ListNode current = head;

        while(current!=null){
            System.out.print(current.val);
            if(current.next!=null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        MergeTwoList merge = new MergeTwoList();

        int[] numlist1 = {1,2,4};
        int[] numlist2 = {1,3,4};
        //output - 1,1,2,3,4,4

        ListNode l1 = createList(numlist1);
        printList(l1);
        ListNode l2 = createList(numlist2);
        printList(l2);


        ListNode result = merge.mergeTwoLists(l1, l2);
        printList(result);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, ListNode next){
        this.val= val; 
        this.next=next; 
    }
}

