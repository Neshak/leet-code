public class DeleteNthNode{
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;

        for(int i=0; i<n; i++){
            head = head.next;
        }

        while(head != null){
            head = head.next;
            current = current.next;
        }

        current.next = current.next.next;

        return dummy.next;
    }

    public static ListNode createList(int[] digits){
        if(digits==null||digits.length==0) return null;

        ListNode head = new ListNode(digits[0]);
        ListNode current = head;

        for(int i=1;i<digits.length;i++){
            current.next = new ListNode(digits[i]);
            current = current.next;
        }

        return head;
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

    public static void main(String[] args) {
        DeleteNthNode delete = new DeleteNthNode();
        int n =2;
        int[] num1 = {1,2,3,4,5};
        ListNode l1 = createList(num1);

        System.out.println("Input list : "); 
        printList(l1);
        System.out.println("n value : "+ n);

        ListNode result = delete.removeNthFromEnd(l1, n);
        System.out.println("Output list : ");
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
