package com.srini.CodeCon;

//Problem        : Matching Datasets
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class ProblemZ
{
  public static void main(String[] args)
  {
	 LinkedList<Double> original = new LinkedList<Double>();
	 LinkedList<Double> approximate = new LinkedList<Double>();
	 List<LinkedList<Double>> originalDataSet = new LinkedList<LinkedList<Double>>();
	 List<LinkedList<Double>> approximateDataSet = new LinkedList<LinkedList<Double>>();
     Scanner stdin = new Scanner(System.in);
     int num = Integer.parseInt(stdin.nextLine());
     for( int i = 0; i < num*2; i++ )
     {
    	 String []temp = stdin.nextLine().split(",");
    	 if(i < num){
    		 
    		 for(String t: temp){
    			 original.add(new Double(t));
    		 }
    		 originalDataSet.add(original);
    		 original = new LinkedList<Double>();
    	 }else{
    		 for(String t: temp){
    			 approximate.add(new Double(t));
    		 }
    		 approximateDataSet.add(approximate);
    		 approximate = new LinkedList<Double>();
    	 }
    	 
     }
     
     for(int i = 0; i < originalDataSet.size(); i++){
    	 LinkedList<Double> min = new LinkedList<Double>();
    	 for(int j = 0; j < approximateDataSet.size(); j++){
    		     min.add(compareLinkedList(originalDataSet.get(i), approximateDataSet.get(j)));
    		 
    	 }
    	 System.out.println(i + "," + findMin(min));
    	 
     }
     stdin.close();
  }
  
  public static int findMin(LinkedList<Double> min){
	  double m = min.get(0);
	  int minPos = 0;
	  for(int i = 0; i < min.size(); i++){
		  if(min.get(i) < m){
			  m = min.get(i);
			  minPos = i;
		  }
	  }
	  return minPos;
  }
  
  public static Double compareLinkedList(LinkedList<Double> a, LinkedList<Double> b){
	  double sum1 = 0;
	  for(int i = 0; i < a.size(); i++){
		  /*if(a.get(i)/b.get(i) > 1.1D || a.get(i)/b.get(i) < 0.9D){ //some threshold because approximation
			  return false;
		  }*/
		  sum1 += Math.abs(a.get(i) - b.get(i));
		  //sum2 += ;
	  }
	  
	  return sum1;
  }

}
