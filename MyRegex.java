/* This is a program that uses regular expression to validate an IP address input by a user.
   This program is implemented by using the Java String method "matches(String regex)" which returns
   a boolean (true or false) by comparing a user input to a regular expression.
   The program could also have been implemented by importing the Matcher and Pattern classes from
   java.util.regex .
*/

package LawPavilionCodingChallengeFromBenjaminEdun;


/**
 *
 * @author Benjamin
 */

import javax.swing.JOptionPane;
//import java.util.Scanner;


class MyRegex {
    
String numberZeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
//  \d represents any digit in regular expression (regex), so the previous line can 
//   be replaced with the next line commented out below:
//   String numberZeroTo255 = "([0-9]{1,2}|(0|1)[0-9]{2}|2[0-4][0-9]|25[0-5])";

/*   
    EXPLANATION OF numberZeroTo255 regex is given below:

    \\d{1,2}     --->  matches any one or two digit number

    (0|1)\\d{2}  --->  matches any three digit number starting with 0 or 1.

    2[0-4]\\d    --->  matches numbers between 200 and 249.

    25[0-5]      --->  mcatches numbers between 250 and 255.
*/

public String pattern = numberZeroTo255 + "\\." + numberZeroTo255 + "\\." + numberZeroTo255 + "\\." + numberZeroTo255;

}// end class MyRegex



class TestMyRegex{
    
    public static void main(String[] args){
            
 /*  This program uses the JOptionPane to interact with the user (get user input and display output).
     To make the program  use the Scanner class and print output to screen, simply uncomment the
     line for Scanner class import, uncomment the section below  beginning from "Scanner inputString
     declaration to the end of the while loop. Comment-out or remove the entire block containing
        while(true)
        {
          .
          .
          .
        }//end while
  */

//        Scanner inputString = new Scanner(System.in);
//        
//        System.out.print("Enter the IP address that you want to validate: ");
//
//        while(inputString.hasNext()){
//            
//            String IPAddress = inputString.nextLine();
//            
//            System.out.println(IPAddress.matches(new MyRegex().pattern));
//            
//            System.out.println();       
//
//            
//            System.out.print("Enter the IP address that you want to validate: ");
//            
//       }//end while loop   

       while(true){
            
            try
            {
                
                String IPAddress = JOptionPane.showInputDialog( "Please enter the IP address you want to validate, "
                        + "when you are done, simply terminate the program by closing the dialog box or click cancel.");
            
                JOptionPane.showMessageDialog(null, IPAddress.matches(new MyRegex().pattern));
                
            }//end try
            catch(Exception e)
           {
                JOptionPane.showMessageDialog(null,"Bye, you have terminated the progam!");
               System.exit(0);
            }//end catch   
       }//end while loop   
    }//end main
}//enc class TestMyRegex

