package com.srini.linkedList;

import com.srini.linkedList.LList;

public class ReverseEven {
	
	public static void main(String args[]){
		LList a = new LList(1);
		LList b = new LList(2);
		LList c = new LList(3);
		LList d = new LList(4);
		LList e = new LList(5);
		LList f = new LList(6);
		LList g = new LList(6);
		a.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = b;
		b.next = g;
		System.out.println(a);
		System.out.println(reverseEven(a).toString());
		
	}
	
	public static LList reverseEven(LList head){
		
		LList curr = head;
		LList listEven = null;
		while(curr != null && curr.next != null){
			LList even = curr.next;
			curr.next = even.next;
			even.next = listEven;
			listEven = even;
			curr = curr.next;
		}
		return mergeUs(head, listEven);
		
	}
	
	public static LList mergeUs(LList list1, LList list2){
		LList head = list1;
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		while(list1.next != null && list2 != null){
			LList temp = list2;
			list2 = list2.next;
			
			temp.next = list1.next;
			list1.next = temp;
			list1 = temp.next;
		}
		if(list1.next == null){
			list1.next = list2;
		}
		return head;
	}
	
}
