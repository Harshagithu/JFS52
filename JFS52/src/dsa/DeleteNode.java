package dsa;

public class DeleteNode {
	
	 public ListNode deleteAtBegin(ListNode head)
	    {
	        head=head.next;
	    	return head;
	    }
	    
	    public ListNode deleteAtMiddle(ListNode head,int position)
	    {
	    	
	    	ListNode temp=head;
	    	for(int i=1;i<position-1;i++)
	    	{
	    		temp=temp.next;
	    	}
	    	temp.next=temp.next.next;
	    	return head;
	    }
	    
	    public ListNode deleteAtEnd(ListNode head)
	    {
	    	ListNode temp=head;
	    	while(temp.next.next!=null)
	    	{
	    		temp=temp.next;
	    	}
	    	temp.next=null;
	    	return head;
	    }
	    
	    public void traverse(ListNode head)
	    {
	    	ListNode temp=head;
	    	while(temp!=null)
	    	{
	    		System.out.print(temp.val+" ");
	    		temp=temp.next;
	    	}
	    }
		
	    public static void main(String args[])
	    {
	    	ListNode l1=new ListNode(10);
	    	ListNode l2=new ListNode(20);
	    	ListNode l3=new ListNode(25);
	    	ListNode l4=new ListNode(40);
	    	
	    	l1.next=l2;
	    	l2.next=l3;
	    	l3.next=l4;
	    	l4.next=null;
	    	
	    	DeleteNode d1=new DeleteNode();
	    	System.out.println("traversing elements before insertion");
	    	ListNode head=l1;
	    	d1.traverse(head);
	    	
	    	System.out.println();
	    	
	    	head=d1.deleteAtBegin(head);
	        System.out.println("traversing elements after deletion at begin");
	    	d1.traverse(head);
	    	
	    	System.out.println();
	    	
	    	head=d1.deleteAtMiddle(head, 2);
	    	System.out.println("traversing elements after deletion at middle");
	    	d1.traverse(head);
	    	
	    	System.out.println();
	    	
	    	head=d1.deleteAtEnd(head);
	    	System.out.println("traversing elements after deletion at end");
	    	d1.traverse(head);
	    	
	    }
}
