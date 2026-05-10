package dsa;

public class StackLinkedList {

	ListNode head;
	public StackLinkedList()
	{
		head=null;
	}
	
	public void push(int value)
	{
		ListNode node=new ListNode(value);
		node.next=head;
		head=node;
	}
	
	public int peek()
	{
		return head.val;
	}
	
	public int pop()
	{
		int num=head.val;
		head=head.next;
		return num;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public static void main(String args[])
	{
	
		StackLinkedList stack=new StackLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
}
