package com.srini.misc;

import java.util.ArrayList;

public class WordSearch {
	public static char[][] grid = {{ 'a', 'b', 'c', 'd' }, 
		{ 'e', 'f', 'g', 'h' },
		{ 'i', 'j', 'k', 'l' }, 
		{ 'm', 'n', 'o', 'p' } };
	public static boolean[][] visited = {{ false, false, false, false }, 
		{ false, false, false, false },
		{ false, false, false, false }, 
		{ false, false, false, false } };
	
	public static void main(String args[]){
		
		searchFor("afko");
		
	}
	
	public static void searchFor(String word){
		if(word.length() < 0){
			U.pl("Invalid input");
			return;
		}
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				searchEveryWhere(i, j, word, new StringBuffer(""));
			}
		}
		U.pl("not found!");
	}
	public static void searchEveryWhere(int i, int j, String word, StringBuffer currentWord){
		if(word.equals(currentWord.toString()) && word.length() > 0){
			printVisisted();
			System.exit(0);
		}
		if(currentWord.length() > word.length()){
			return;
		}
		ArrayList<Coordinates> neighbors = findNeighbors(i, j);
		for(Coordinates xY: neighbors){
			currentWord.append(grid[xY.x][xY.y]);
			visited[xY.x][xY.y] = true;
			searchEveryWhere(xY.x, xY.y, word, currentWord);
			currentWord.setLength(currentWord.length() - 1);
			visited[xY.x][xY.y] = false;
		}
			
	}
	
	public static void printVisisted(){
		for(int i = 0; i < visited.length; i++){
			for(int j = 0; j < visited[0].length; j++){
				U.p(visited[i][j] + " ");
			}
			U.pl("");
		}
	}
	
	public static ArrayList<Coordinates> findNeighbors(int x, int y){
		int minX = Math.max(0, x - 1);
		int maxX = Math.min(grid.length - 1, x + 1);
		int minY = Math.max(0, y - 1);
		int maxY = Math.min(grid[0].length - 1, y + 1);
		ArrayList<Coordinates> neighbors = new ArrayList<Coordinates>();
		for(int i = minX; i <= maxX; i++){
			for(int j = minY; j <= maxY; j++){
				if(!visited[i][j]){
					neighbors.add(new Coordinates(i, j));
				}
			}
		}
		return neighbors;
	}
}

class Coordinates{
	int x;
	int y;
	public Coordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
}