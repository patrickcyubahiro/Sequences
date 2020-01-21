/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_of_today;

/**
 *
 * @author Patrick CYUBAHIRO
 */
public class Assignment_Of_Today {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
int number=0, s=1, sum=0, average=0;
while(number<50)
{
s=s+number;
System.out.print("  "+s);
number=number+1;
sum= sum+ s;
average= sum/50;
}
System.out.print("\n");
System.out.print("The sum of the first 50 numbers is: \n"+sum);
System.out.print("\n");
System.out.print("The average of the first 50 numbers is: \n"+average);
System.out.print("\n");
}
}
