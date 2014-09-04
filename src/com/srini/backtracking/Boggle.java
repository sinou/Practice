package com.srini.backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class Boggle {
	
	public static void main(String args[]){
		
	}
	
	static HashSet<String> dict;
	static char[][] grid;
	static boolean[][] bitMap;
	
	public Boggle(HashSet<String> dict1, char[][] grid1, boolean[][] bitMap1){
		dict = dict1;
		grid = grid1;
		bitMap = bitMap1;
		for(int i = 0; i < bitMap.length; i++){
			for(int j = 0; j < bitMap[i].length; j++){
				bitMap[i][j] = false;
			}
		}
	}
	
	public static void startGame(){
		
		HashSet<String> words = new HashSet<String>();
		StringBuffer currentWord = new StringBuffer();
		
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				findWordsRecursively(i, j, currentWord, words);
			}
		}
		
	}
	
	public static void findWordsRecursively(int x, int y, StringBuffer currentWord, HashSet<String> words){
		
		if(currentWord.length() > 0 && dict.contains(currentWord.toString())){
			words.add(currentWord.toString());
		}
		
		ArrayList<IntPair> neighbors = findAllNeighbors(x, y);
		for(IntPair xY: neighbors){
			currentWord.append(grid[xY.first][xY.second]);
			bitMap[xY.first][xY.second] = true;
			findWordsRecursively(xY.first, xY.second, currentWord, words);
			currentWord.setLength(currentWord.length() - 1);
			bitMap[xY.first][xY.second] = false;
		}
	}
	
	public static ArrayList<IntPair> findAllNeighbors(int x, int y){
		
		int startX = Math.max(0, x - 1);
		int startY = Math.max(0, y - 1);
		int endX = Math.min(grid.length - 1, x + 1);
		int endY = Math.max(grid[0].length - 1, x - 1);
		ArrayList<IntPair> neighbors = new ArrayList<IntPair>();
		
		for(int i = startX; i < endX; i++){
			for(int j = startY; j < endY; j++){
				if(!bitMap[i][j]){
					neighbors.add(new IntPair(i, j));
				}
			}
		}
		
		return neighbors;
		
	}
}

class IntPair{
	int first;
	int second;
	
	public IntPair(int first, int second){
		this.first = first;
		this.second = second;
	}
}
