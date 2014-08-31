package linkedlist;


public class IntersectionPoint {

	public static void main(String args[]){
		List a = new List(1);
		List b = new List(2);
		List c = new List(3);
		List d = new List(4);
		List e = new List(5);
		List f = new List(6);
		a.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		b.next = e;
		System.out.println(findIntersectionPoint(a, b).data);
	}
	
	public static List findIntersectionPoint(List a, List b){
		int sizeOfA = getLength(a);
		int sizeOfB = getLength(b);
		int diff = 0;
		if(sizeOfA > sizeOfB){
			diff = sizeOfA - sizeOfB;
			a = moveNSteps(a, diff);
		}else if(sizeOfB > sizeOfA){
			diff = sizeOfB - sizeOfA;
			b = moveNSteps(b, diff);
		}
		while(a != null && b != null){
			if(a == b){
				return a;
			}
			a = a.next;
			b = b.next;
		}
		return null;
	}
	
	public static List moveNSteps(List head, int diff){
		while(diff-- != 0){
			head = head.next;
		}
		return head;
	}
	
	public static int getLength(List head){
		int count = 0;
		while(head != null){
			head = head.next;
			count++;
		}
		return count++;
	}
	
}

class List{
	int data;
	List next;
	public List(int data){
		this.data = data;
		this.next = null;
	}
	
	public String toString(){
		return this.data + "";
	}
	
}