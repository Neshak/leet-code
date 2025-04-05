public class ReverseLinkedList {
    

    public ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode prev = null;

        while(current!= null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static ListNode createList(int[] nums){
        ListNode dummy = new ListNode(nums[0]);
        ListNode current = dummy;

        for(int i=1; i<nums.length;i++){
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return dummy;
    }

    public static void printLinkedList(ListNode head){
        while(head!=null){
            System.out.print(head.val);
            if(head.next!=null) System.out.print("->");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ReverseLinkedList t= new ReverseLinkedList();

        int[] nums = {1,2,3,4,5};
        ListNode list = createList(nums);

        printLinkedList(list);

        ListNode result = t.reverseList(list);
        printLinkedList(result);
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