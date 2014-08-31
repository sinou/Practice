package linkedlist;

import java.util.HashSet;
import java.util.Set;

import linkedlist.LList;

public class MergeSortList {

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
		System.out.println(a.toString());
		System.out.println(mergeSort(a).toString());
		System.out.println(nthFromLast(3, a).data);
		System.out.println(removeDuplicates(a).toString());
	}
	
	public static LList removeDuplicates(LList head){
		HashSet<Integer> setOfNodes = new HashSet<Integer>();
		LList curr = head;
		setOfNodes.add(curr.data);
		while(curr.next != null){
			if(!setOfNodes.contains(curr.next.data)){
				setOfNodes.add(curr.next.data);
				curr = curr.next;
			}else{
				curr.next = curr.next.next;
			}
		}
		return head;
	}
	
	public static LList nthFromLast(int n, LList head){
		LList pointerFromStart = head;
		LList pointerFromN = head;
		while(pointerFromN != null && n > 0){
			pointerFromN = pointerFromN.next;
			n--;
		}
		if(n > 0){
			return null;
		}
		else{
			while(pointerFromN != null){
				pointerFromStart = pointerFromStart.next;
				pointerFromN = pointerFromN.next;
			}
		}
		return pointerFromStart;
	}
	
	public static void cutMeInHalf(LList head, Pair firstSecond){
		
		if(head == null){
			return;
		}
		
		if(head.next == null){
			firstSecond.first = head;
			firstSecond.second = null;
		}else{
			
			LList slow = head;
			LList fast = head.next;
			while(fast != null){
				fast = fast.next;
				if(fast != null){
					fast = fast.next;
					slow = slow.next;
				}
			}
			
			firstSecond.first = head;
			firstSecond.second = slow.next;
			
			slow.next = null;
			
		}
		
		
	}
	
	public static LList mergeSort(LList head){
		if(head == null || head.next == null){
			return head;
		}
		
		Pair firstSecond = new Pair();
		cutMeInHalf(head, firstSecond);
		LList first = mergeSort(firstSecond.first);
		LList second = mergeSort(firstSecond.second);
		
		return mergeUs(first, second);
	}
	
	public static LList mergeUs(LList first, LList second){
		
		if(first == null && second == null){
			return null;
		}
		if(first == null){
			return second;
		}
		if(second == null){
			return first;
		}
		
		LList newHead;
		if(first.data > second.data){
			newHead = second;
			second = second.next;
		}else{
			newHead = first;
			first = first.next;
		}
		
		LList newCurrent = newHead;
		while(first != null && second != null){
			LList temp = null;
			if(first.data < second.data){
				temp = first;
				first= first.next;
			}else{
				temp = second;
				second = second.next;
			}
			newCurrent.next = temp;
			newCurrent = temp;
		}
		
		if(first != null){
			newCurrent.next = first;
		}else if(second != null){
			newCurrent.next = second;
		}
		
		return newHead;
		
		
	}
	
}
