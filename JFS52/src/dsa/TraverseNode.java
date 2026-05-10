package dsa;

public class TraverseNode {

	public void traverse(ListNode head)
	{
		ListNode node=head;
		while(node!=null)
		{
			System.out.println(node.val);
			node=node.next;
		}
	}
	
	public static void main(String[] args) {
	
		ListNode l1=new ListNode(90);
		ListNode l2=new ListNode(37);
		ListNode l3=new ListNode(19);
		ListNode l4=new ListNode(10);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		
		TraverseNode t=new TraverseNode();
		ListNode head=l1;
		t.traverse(head);
	}

}
