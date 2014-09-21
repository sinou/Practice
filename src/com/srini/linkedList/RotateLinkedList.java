package com.srini.linkedList;

public class RotateLinkedList {

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
		System.out.println(rotateMe(a, 2));
	}
	
	public static int reduceRotations(int byNPositions, int myLength){
		int temp = byNPositions % myLength;
		if(temp < 0){
			temp += myLength;
		}
		return temp;
	}
	
	public static LList rotateMe(LList head, int byNPositions){
		
		int pointOfinterest = reduceRotations(byNPositions, findMyLength(head));
		
		LList temp = head;
		
		while(pointOfinterest > 1){
			temp = temp.next;
			pointOfinterest--;
		}
		
		 LList newHead = temp.next;
		 temp.next = null;
		 
		 LList curr = newHead;
		 while(curr.next != null){
			 curr = curr.next;
		 }
		
		 curr.next = head;
		 
		 return newHead;
		 
	}
	
	public static int findMyLength(LList head){
		int length = 0;
		while(head != null){
			head = head.next;
			length++;
		}
		return length;
	}
}
