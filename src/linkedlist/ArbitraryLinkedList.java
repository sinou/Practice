package linkedlist;

import java.util.Hashtable;

public class ArbitraryLinkedList {
	
	public static void main(String args[]){
		QuirkyLinkedList node = new QuirkyLinkedList(5);
		node.next = new QuirkyLinkedList(4);
		node.next.next = new QuirkyLinkedList(3);
		node.arbitraryPointer = node.next.next;
		node.next.arbitraryPointer = node;
		node.next.next.arbitraryPointer = node.next;
		System.out.println(deepCopy(node));
	}
	
	public static QuirkyLinkedList deepCopy(QuirkyLinkedList original){
		
		QuirkyLinkedList current = original;
		QuirkyLinkedList newHead = null;
		QuirkyLinkedList newPrevious = null;
		Hashtable<QuirkyLinkedList, QuirkyLinkedList> map = new Hashtable<QuirkyLinkedList, QuirkyLinkedList>();
		while(current != null){
			QuirkyLinkedList newNode = new QuirkyLinkedList(current.data);
			newNode.arbitraryPointer = current.arbitraryPointer;
			if(newPrevious == null){
				newHead = newNode;
			}else{
				newPrevious.next = newNode;
			}
			map.put(current, newNode);
			newPrevious = newNode;
			current = current.next;
			
		}
		
		QuirkyLinkedList newCurrent = newHead;
		
		while(newCurrent != null){
			if(newCurrent.arbitraryPointer != null){
				QuirkyLinkedList temp = map.get(newCurrent.arbitraryPointer);
				newCurrent.arbitraryPointer = temp;
			}
			newCurrent = newCurrent.next;
		}
		
		return newHead;
		
	}
	
}

class QuirkyLinkedList{
	int data;
	QuirkyLinkedList next;
	QuirkyLinkedList arbitraryPointer;
	public QuirkyLinkedList(int data){
		this.data = data;
		this.next = null;
		this.arbitraryPointer = null;
	}
	public String toString(){
		QuirkyLinkedList temp = this;
		String printMe = "";
		while(temp != null){
			printMe += temp.data + "(" + temp.arbitraryPointer.data + ")" + "->";
			temp = temp.next;
		}
		return printMe+"null";
	}
}