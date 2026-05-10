package dsa;

public class ListNode {
   int val;
   ListNode next;
   
   public ListNode(int x)
   {
	   this.val=x;
   }
   
   public static void main(String args[])
   {
	   ListNode l1=new ListNode(67);
	   ListNode l2=new ListNode(78);
	   ListNode l3=new ListNode(21);
	   ListNode l4=new ListNode(90);
	   
	   l1.next=l2;
	   l2.next=l3;
	   l3.next=l4;
	   l4.next=null;
	   
	   ListNode temp=l1;
	   
	   while(temp!=null)
	   {
		   System.out.println(temp.val);
		   temp=temp.next;
	   }
   }
}
