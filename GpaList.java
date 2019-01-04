/**************************************************************
 * GpaList.java      Author: Devin Groves
 *
 *
 * I assert that the program I am submitting is the result of my own efforts.
 *************************************************************/

import java.util.ArrayList;

import java.util.List;

public class GpaList {

       private List<Double> grades;

      

       public GpaList()

       {

             grades = new ArrayList<Double>();

       }

      

       public void addGrade(String gradeStr)

       {

             double grade = Double.parseDouble(gradeStr);

             try {

             if(grade >= 0.0 && grade <=4.0)

                    grades.add(grade);

             else

                    throw new InvalidValueException(" Grade : "+grade+" out of range");

             } catch (InvalidValueException e) {

                    System.out.println(e.getMessage());

                   

             }catch(NumberFormatException e)

             {

                    System.out.println(" Input was not numeric");

             }

       }

      

       public double calc()

       {

             double sum=0;

             for(int i=0;i<grades.size();i++)

                    sum += grades.get(i);

             try {

                    double avg = (int)sum/grades.size(); // Do IntegerDivision since double division doesn't throw divide by zero exception

                    return(sum/grades.size());

             }catch(ArithmeticException e)

             {

                    return 0;

             }

       }

      

}