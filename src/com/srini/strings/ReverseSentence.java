package com.srini.strings;

public class ReverseSentence {
	public static void main(String args[]){
		System.out.println(reverseForMe("The quick brown fox jumps over the lazy dog".toCharArray()));
	}
	public static char[] reverseSentenceByWords(char[] sentence, int begin, int end){
		
		while(begin < end){
			char temp = sentence[begin];
			sentence[begin] = sentence[end];
			sentence[end] = temp;
			begin++;
			end--;
		}
		
		return sentence;
	}
	
	public static char[] reverseForMe(char[] sentence){
		int begin = 0;
		for(int i = 0; i < sentence.length; i++){
			if(sentence[i] == ' '){
				sentence = reverseSentenceByWords(sentence, begin, i - 1);
				begin = i + 1;
			}
		}
		sentence = reverseSentenceByWords(sentence, begin, sentence.length - 1);
		sentence  = reverseSentenceByWords(sentence, 0, sentence.length - 1);
		return sentence;
	}

}
