public class AddListNumbers{
    
    public ListNode addTwoList(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while(l1 !=null || l2 !=null || carry>0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum/10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }

    public static ListNode createList(int[] digits){
        if(digits == null || digits.length ==0) return null;

        ListNode head = new ListNode(digits[0]);
        ListNode current = head;

        for(int i=1; i< digits.length; i++){
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
        AddListNumbers add = new AddListNumbers();
        
        int[] num1 = {2,4,3};
        int[] num2 = {5,6,4};
        ListNode l1 = createList(num1);
        ListNode l2 = createList(num2);
        
        System.out.println("Input List 1 : ");
        printList(l1);
        System.out.println("Input List 2 : ");
        printList(l2);
        
        ListNode result = add.addTwoList(l1, l2);
        System.out.println("sum : ");
        printList(result);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
}
