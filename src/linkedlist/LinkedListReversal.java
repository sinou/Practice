package linkedlist;

public class LinkedListReversal {
	
	public static void main(String args[]){
		LList a = new LList(1);
		LList b = new LList(2);
		LList c = new LList(3);
		LList d = new LList(4);
		LList e = new LList(5);
		LList f = new LList(6);
		LList g = new LList(7);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		System.out.println(reverseMe(a));
	}
	
	public static LList reverseMe(LList head){
		LList previous = null;
		LList current = head;
		LList forward;
		while(current!= null){
			forward = current.next;
			current.next= previous;
			previous = current;
			current = forward;
		}
		
		return previous;
	}
	
}
