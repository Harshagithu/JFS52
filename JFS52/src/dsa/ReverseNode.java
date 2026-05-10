package dsa;

public class ReverseNode {

	public static ListNode reverseNode(ListNode head)
	{
		
		if(head==null)
		{
			return null;
		}
		if(head.next==null)
		{
			return head;
		}
		ListNode prev=null;
		ListNode curr=head;
		while(curr!=null)
		{
			ListNode nextNode=curr.next;              
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		head=prev;
		return head;
	}
	
	public static void traverse(ListNode head)
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
		ListNode l3=new ListNode(30);
		ListNode l4=new ListNode(40);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		
		System.out.println("Before Reverse:");
		traverse(l1);
		
		System.out.println();
		ListNode head=reverseNode(l1);
		
		System.out.println("After Reverse:");
		traverse(head);
	}
}
