package com.srini.misc;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
	
	static HashMap<Integer, LinkedList<Integer>> bookKeeper = new HashMap<Integer, LinkedList<Integer>>();
	static LinkedList<Integer> values = new LinkedList<Integer>();
	static int sizeOfCache;
	
	public LRUCache(HashMap<Integer, LinkedList<Integer>> bookKeeper, LinkedList<Integer> values, int sizeOfCache){
		this.bookKeeper = bookKeeper;
		this.values = values;
		this.sizeOfCache = sizeOfCache;
	}
	
	static int get(int data){
		LinkedList temp = bookKeeper.get(data);
		if(temp == null){
			return -1;
		}
		values.remove(data);
		values.addLast(data);
		return data;
	}
	
	static void put(int data){
		LinkedList temp = bookKeeper.get(data);
		if(temp == null){
			evictIfNeeded();
			values.addLast(data);
			LinkedList t = new LinkedList<Integer>();
			t.add(data);
			bookKeeper.put(data, t); // i should create my own data structure and put the linkedlist node as
										//value here(i.e. the reference of the linkedlist node i created to be added to 'values' list) 
										//but you know that is obvious (and i am lazy)
		}
	}
	
	static void evictIfNeeded(){
		if(bookKeeper.size() == sizeOfCache){
			int temp = values.removeFirst();
			bookKeeper.remove(temp);
		}
	}
}
