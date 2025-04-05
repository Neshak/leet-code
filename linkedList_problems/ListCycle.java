public class ListCycle {
   // no printlist(), has the list has cycle, it will create a infinite loop!
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    public static ListNode createList(int[] nums, int cyclePos){
        if(nums == null || nums.length ==0) return null;
        
        ListNode dummy = new ListNode(nums[0]);
        ListNode current = dummy;
        ListNode cycleNode = null;  // node where cycle will point

        for(int i=1; i<nums.length;i++){
            current.next = new ListNode(nums[i]);
            current = current.next;
            if(i==cyclePos){
                cycleNode = current;   // save the node to loop back to
            }
        }
        
        // create the cycle if cyclePos is valid
        if(cyclePos >= 0 && cycleNode != null){
            current.next = cycleNode;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListCycle listCycle = new ListCycle();

        int[] nums = {1,2,3,4,2};
        int cyclePos = 1;
        ListNode list = createList(nums, cyclePos);
        
        boolean result = listCycle.hasCycle(list);
        System.out.println(result);
    } 
}

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
        next = null;
    }
    ListNode(int val, ListNode next){
        this.val= val; 
        this.next=next; 
    }
}
