/**************************************************************
 * GpaDriver.java      Author: Devin Groves
 *
 *
 * I assert that the program I am submitting is the result of my own efforts.
 *************************************************************/

import java.util.Scanner;

public class GpaDriver{

       public static void main(String args[]) throws InvalidValueException

       {

             GpaList list = new GpaList();

             String input;

             Scanner scan = new Scanner(System.in);

             do {

                    System.out.print(" Enter a grade (Q to quit) : ");

                    input = scan.nextLine();

                    if(input.equalsIgnoreCase("Q"))

                           break;

                    try {

                           list.addGrade(input);

                    }

                    catch(NumberFormatException e)

                    {

                           System.out.println(" Input was not numeric");

                    }

                   

             }while(!input.equalsIgnoreCase("Q"));

             System.out.print(" Average :" +list.calc());

             scan.close();

       }

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 1.	What was the most valuable thing you learned in this lab?
//    How to specifccaly create, throw, and handle custom exceptions.
// 2.	What did you like best about this lab?
//    I liked best that now that I know how to use custom exceptions 
//    I've thought of many ways in which they could be useful in futurue programs.
// 3.	Were there any particular problems you encountered?
//    I did not encounter any problems.
// 4.	Do you have any suggestions for improving this lab as an effective learning experience?
//    Not that I can think of.
