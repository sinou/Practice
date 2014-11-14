package com.srini.CodeCon;

//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Your submission should *ONLY* use the following class name
public class Problem42
{
  public static void main(String[] args)
  {
      Scanner stdin = new Scanner(System.in);
      List<String> questions = new LinkedList<String>();
      int num = Integer.parseInt(stdin.nextLine());
      for( int i = 0; i < num; i++ )
      {
    	  questions.add(stdin.nextLine()+"\n42");
    	  
      }
      stdin.close();
      
      for(String question: questions){
    	  System.out.println(question);
      }

  }
}
