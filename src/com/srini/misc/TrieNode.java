package com.srini.misc;
//simple implimentation of a trie
//this data struture only works for ASCII 256 character set
public class TrieNode {
	
	boolean val = false;
	TrieNode []children;
	// this is a very basic implementation and can only take English alphabets and no special characters
	//it also, does not differentiate between an upper-case letter and a lower-case letter
	public TrieNode(){
		this.val = true;
		this.children = new TrieNode[26];
	}
	
}
