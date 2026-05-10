package dsa;

public class InsertDoubleNode {

	public DoubleListNode insertAtBeg(DoubleListNode node,int val)
	{
		
		while(node.prev!=null)
		{
			node=node.prev;
		}
		
		DoubleListNode newNode=new DoubleListNode(val);
		newNode.next=node;
		node.prev=newNode;
		return newNode;
	}
	
	public DoubleListNode insertAtMiddle(DoubleListNode node,int val,int position)
	{
		
		while(node.prev!=null)
		{
			node=node.prev;
		}
		
		for(int i=1;i<position-1;i++)
		{
			node=node.next;
		}
		
		DoubleListNode newNode=new DoubleListNode(val);
		newNode.next=node.next;
		node.next.prev=newNode;
		newNode.prev=node;
		node.next=newNode;
		return newNode;
	}
	
	public DoubleListNode insertAtEnd(DoubleListNode node,int val)
	{
		
		while(node.next!=null)
		{
			node=node.next;
		}
		
		DoubleListNode newNode=new DoubleListNode(val);
		node.next=newNode;
		newNode.prev=node;
		return newNode;
	}
	
	public static void main(String args[]) {

		DoubleListNode d1 = new DoubleListNode(10);
	    DoubleListNode d2 = new DoubleListNode(20);
	    DoubleListNode d3 = new DoubleListNode(30);

	    d1.next = d2;
	    d2.prev = d1;
	    d2.next = d3;
	    d3.prev = d2;

	    DoubleListNode head = d2;

	    head.traverseAtBeg(head);

	    InsertDoubleNode i = new InsertDoubleNode();

	    head = i.insertAtBeg(head, 5);
	    head.traverseAtBeg(head);
	    
	    head=i.insertAtMiddle(head, 15, 2);
	    head.traverseAtBeg(head);
	    
	    head = i.insertAtEnd(head, 25);
	    head.traverseAtBeg(head);
		
	}
}
