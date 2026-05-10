package dsa;

public class CircularLinkedList {

	int val;
	CircularLinkedList next;
	
	public CircularLinkedList(int x)
	{
		this.val=x;
	}
	
	public static void traverse(CircularLinkedList head)
	{
        
		CircularLinkedList temp=head;	
		do
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}while(temp!=head);
		
	}
	public static CircularLinkedList insertAtBeg(CircularLinkedList head,int val)
	{
		CircularLinkedList newNode=new CircularLinkedList(val);
		CircularLinkedList temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public static CircularLinkedList insertAtEnd(CircularLinkedList head,int val)
	{
		CircularLinkedList newNode=new CircularLinkedList(val);
		CircularLinkedList temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=head;
		return head;
	}
	
	public static CircularLinkedList insertAtMiddle(CircularLinkedList head,int val,int position)
	{
		CircularLinkedList newNode=new CircularLinkedList(val);
		CircularLinkedList temp=head;
		for(int i=1;i<position-1;i++)
		{
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	
	public static CircularLinkedList deleteAtBeg(CircularLinkedList head)
	{
		CircularLinkedList temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		temp.next=head.next;
		head=temp.next;
		return head;
	}
	
	public static CircularLinkedList deleteAtEnd(CircularLinkedList head)
	{
		CircularLinkedList temp=head;
		while(temp.next.next!=head)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}
	
	public static CircularLinkedList deleteAtMiddle(CircularLinkedList head,int position)
	{
		CircularLinkedList temp=head;
		for(int i=1;i<position-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}
	
	public static void main(String args[]) {
		
		CircularLinkedList l1=new CircularLinkedList(10);
		CircularLinkedList l2=new CircularLinkedList(20);
		CircularLinkedList l3=new CircularLinkedList(30);
		CircularLinkedList l4=new CircularLinkedList(40);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l1;
		
		CircularLinkedList head=l1;
		
		System.out.println("----- Before Operations linked list -----");
		traverse(head);
		
		System.out.println();
		System.out.println("----- Insertion at Begin -----");
	    head=insertAtBeg(head,5);
	    traverse(head);
	    
	    System.out.println();
	    System.out.println("----- Insertion at End -----");
	    head=insertAtEnd(head,25);
	    traverse(head);
	    
	    System.out.println();
	    System.out.println("----- Insertion at Middle -----");
	    head=insertAtMiddle(head,15,2);
	    traverse(head);
	    
	    System.out.println();
	    System.out.println("----- Deletion at Begin -----");
	    head=deleteAtBeg(head);
	    traverse(head);
	    
	    System.out.println();
	    System.out.println("----- Deletion at End -----");
	    head=deleteAtEnd(head);
	    traverse(head);
	    
	    System.out.println();
	    System.out.println("----- Deletion at Middle -----");
	    head=deleteAtMiddle(head,2);
	    traverse(head);
		
	}
}
