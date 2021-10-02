/*
Given a singly linked list of N nodes.
The task is to find the middle of the linked list. For example, if the linked list is
1-> 2->3->4->5, then the middle node of the list is 3.
If there are two middle nodes(in case, when N is even), print the second middle element.
For example, if the linked list given is 1->2->3->4->5->6, then the middle node of the list is 4.

*/

class Solution
{
    int getMiddle(Node head)
    {
         Node p= head;
         Node q= head;
         
         while(q!=null && q.next!=null){
             q=q.next.next;
             p=p.next;
         }
         
         return p.data;
    }
}

