import utils.ListNode;

/**
 * @Author VITI.lewis
 * @Despriction:
 * @Date:Created in 2020/3/24 5:37 下午
 * @Modify By:
 */
public class fastSlow {
    public ListNode middleNode (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while ( fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
