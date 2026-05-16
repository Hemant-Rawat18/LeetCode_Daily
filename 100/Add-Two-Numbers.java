1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13                
14        ListNode dummy =new ListNode(0);
15        ListNode current=dummy;
16        int carry=0;
17        while(l1!=null || l2!=null){
18            int x=(l1!=null) ? l1.val:0;
19            int y=(l2!=null) ? l2.val:0;
20        
21            int sum=x+y+carry;
22            carry=sum/10;
23            int digit=sum%10;
24            current.next=new ListNode(digit);
25            current=current.next;
26            if(l1!=null)l1=l1.next;
27            if(l2!=null)l2=l2.next;
28        }
29        if(carry>0){
30            current.next=new ListNode(carry);
31        }
32        return dummy.next;
33
34    }
35}