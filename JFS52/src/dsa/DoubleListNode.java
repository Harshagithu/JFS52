package dsa;

public class DoubleListNode {
	int val;
	DoubleListNode prev;
	DoubleListNode next;
	
	public DoubleListNode(int data) {
		
		this.val=data;
		prev = null;
		next = null;
	}
	public void traverseAtBeg(DoubleListNode node) {
		while(node.prev!=null) {
			node=node.prev;
		}
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		System.out.println();
	}
	public void traverseAtEnd(DoubleListNode node) {
		while(node.next!=null) {
			node=node.next;
		}
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.prev;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		DoubleListNode d1=new DoubleListNode(10);
		DoubleListNode d2=new DoubleListNode(20);
		DoubleListNode d3=new DoubleListNode(30);
		d1.next=d2;
		d2.prev=d1;
		d2.next=d3;
		d3.prev=d2;
		d2.traverseAtBeg(d2);	
		d2.traverseAtEnd(d2);
	}
	
	

}