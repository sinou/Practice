package linkedlist;

public class SwapNthNode {

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
		System.out.println(a);
		System.out.println(swapFirstWithNth(a, 4));
	}
	
	public static LList swapFirstWithNth(LList head, int n){
		LList prev = null;
		LList curr = head;
		if(head == null || head.next ==null){
			return head;
		}
		while(n > 1){
			prev = curr;
			curr = curr.next;
			n--;
		}
		prev.next = head;
		LList temp = curr.next;
		curr.next = head.next;
		head.next = temp;
		
		return curr;
	}
}
