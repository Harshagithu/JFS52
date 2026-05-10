package dsa;

public class InsertNode {
	
    public ListNode insertAtBegin(ListNode head, int val)
    {
    	ListNode newNode=new ListNode(val);
    	newNode.next=head;
    	head=newNode;
    	return head;
    }
    
    public ListNode insertAtMiddle(ListNode head,int val,int position)
    {
    	ListNode newNode=new ListNode(val);
    	ListNode temp=head;
    	for(int i=1;i<position-1;i++)
    	{
    		temp=temp.next;
    	}
    	newNode.next=temp.next;
		temp.next=newNode;
    	return head;
    }
    
    public ListNode insertAtEnd(ListNode head, int val)
    {
    	ListNode newNode=new ListNode(val);
    	ListNode temp=head;
    	while(temp.next!=null)
    	{
    		temp=temp.next;
    	}
    	temp.next=newNode;
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
    	
    	InsertNode i1=new InsertNode();
    	System.out.println("traversing elements before insertion");
    	ListNode head=l1;
    	i1.traverse(head);
    	
    	System.out.println();
    	
    	head=i1.insertAtBegin(head, 5);
        System.out.println("traversing elements after insertion at begin");
    	i1.traverse(head);
    	
    	System.out.println();
    	
    	head=i1.insertAtMiddle(head, 22, 3);
    	System.out.println("traversing elements after insertion at middle");
    	i1.traverse(head);
    	
    	
    	System.out.println();
    	
    	head=i1.insertAtEnd(head, 12);
    	System.out.println("traversing elements after insertion at end");
    	i1.traverse(head);
    	
    }
}
