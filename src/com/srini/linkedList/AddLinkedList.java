package com.srini.linkedList;

public class AddLinkedList {
    
	public static void main(String args[]){
		LinkedList a = new LinkedList(9);
		a.next = new LinkedList(8);
		a.next.next = new LinkedList(7);
		LinkedList b = new LinkedList(9);
		b.next = new LinkedList(9);
		LinkedList print = addLinkedList(a, b);
		System.out.println(print.toString());
		System.out.println(a.toString());
		System.out.println(reverse(a).toString());
		LinkedList c = new LinkedList(9);
		c.next = new LinkedList(8);
		c.next.next = new LinkedList(7);
		System.out.println(removeFromLinkedList(c, 8).toString());
	}
	
	public static LinkedList removeFromLinkedList(LinkedList a, int removeMe){
		LinkedList previous = null;
		LinkedList current = a;
		while(current != null){
			if(current.data == removeMe){
				break;
			}
			previous = current;
			current = current.next;
		}
		if(current == null){
			return a;
		}
		if(current.data == a.data){
			return a.next;
		}
		previous.next = current.next;
		return a;
	}
	
	public static LinkedList addLinkedList(LinkedList a, LinkedList b){
		int carry = 0, first = 0, second = 0, t = 0;
	    LinkedList result = null, temp = null, last = null;
		while(a != null || b != null || carry > 0){
			first = (a == null? 0 : a.data);
			second = (b == null? 0 : b.data);
			t = first + second + carry;
			temp = new LinkedList(t % 10);
			carry = t / 10;
			if(result == null){
				result = temp;
			}else{
				last.next = temp;
			}
			last = temp;
			if(a != null){
				a = a.next;
			}
			if(b != null){
				b = b.next;
			}
		}
			return result;
	}
	
	
	public static LinkedList reverse(LinkedList a){
		if(a == null || a.next == null){
			return a;
		}
		LinkedList reversedPart = null;
		LinkedList toBeReversed = null;
		toBeReversed = a.next;
		reversedPart = a;
		reversedPart.next = null;
		
		while(toBeReversed != null){
			LinkedList temp = toBeReversed;
			toBeReversed = toBeReversed.next;
			temp.next = reversedPart;
			reversedPart = temp;
		}
		return reversedPart;
	}
	
	
}

class LinkedList{
	int data;
	LinkedList next;
	public LinkedList(int data){
		this.data = data;
		this.next = null;
	}
	public String toString(){
		String printMe = "";
		LinkedList temp = this;
		while(temp != null){
			printMe += temp.data + "->";
			temp = temp.next;
		}
		return printMe;
	}
}