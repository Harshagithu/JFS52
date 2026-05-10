package dsa;

public class DeleteDoubleNode {

	public DoubleListNode deleteAtBeg(DoubleListNode node)
	{
		
		while(node.prev!=null)
		{
			node=node.prev;
		}
		
		node=node.next;
		node.prev=null;
		return node;
	}
	
	public DoubleListNode deleteAtMiddle(DoubleListNode node,int position)
	{
		
		while(node.prev!=null)
		{
			node=node.prev;
		}
		
		for(int i=1;i<position-1;i++)
		{
			node=node.next;
		}
		
		DoubleListNode temp=node.next;
		node.next=temp.next;
		temp.next.prev=node;
		return node;
	}
	
	public DoubleListNode deleteAtEnd(DoubleListNode node)
	{
		
		while(node.next!=null)
		{
			node=node.next;
		}
		
		node=node.prev;
		node.next=null;
		return node;
	}
	
	public static void main(String args[]) {

		DoubleListNode d1 = new DoubleListNode(10);
	    DoubleListNode d2 = new DoubleListNode(20);
	    DoubleListNode d3 = new DoubleListNode(30);
	    DoubleListNode d4 = new DoubleListNode(40);
	    DoubleListNode d5 = new DoubleListNode(50);

	    d1.next = d2;
	    d2.prev = d1;
	    d2.next = d3;
	    d3.prev = d2;
	    d3.next = d4;
	    d4.prev = d3;
	    d4.next = d5;
	    d5.prev = d4;

	    DoubleListNode head = d2;

	    head.traverseAtBeg(head);

	    DeleteDoubleNode i = new DeleteDoubleNode();

	    head = i.deleteAtBeg(head);
	    head.traverseAtBeg(head);
	    
	    head=i.deleteAtMiddle(head, 2);
	    head.traverseAtBeg(head);  
	    head = i.deleteAtEnd(head);
	    head.traverseAtBeg(head);
		
	}
}
