package linkedlist;

public class InsersionSortLinkedList {
	
	public static void main(String args[]){
		Node a = new Node(5);
		a.next = new Node(4);
		a.next.next = new Node(3);
		System.out.println(insertionSorted(a).toString());
	}
	
	public static Node insertionSorted(Node original){
		
		Node sorted = null;
		Node curr = original;
		while(curr != null){
			Node temp = curr.next;
			sorted = sortForMe(sorted, curr);
			curr = temp;
		}
		return sorted;
		
	}
	
	public static Node sortForMe(Node head, Node node){
	
		if(node == null){
			return head;
		}
		if(head == null || node.data <= head.data){
			node.next = head;
			return node;
		}
		
		Node curr = head;
		
		while(curr.next != null && curr.next.data < node.data){
			curr = curr.next;
		}
		
		node.next = curr.next;
		curr.next = node;
		
		return head;
		
		
		
	}
	
}

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	public String toString(){
		String printMe = "";
		Node temp = this;
		while(temp != null){
			printMe += temp.data + "->";
			temp = temp.next;
		}
		return printMe;
	}
}