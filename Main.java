import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int minimum, maximum, newInt;
        double average;
         
        System.out.println("Please enter " + 10 + " more grades(s).");
        while (!scnr.hasNextInt()) 
            {
        		scnr.nextLine();               
        		System.out.println("Error! Invalid number.");
            }
            newInt = scnr.nextInt();
            maximum = newInt;
            minimum = newInt;
            average = newInt;
             
        for (int i=0; i<9; i++)
        {
        		System.out.println("Please enter " + (9 - i) + " grade(s).");
        		while (!scnr.hasNextInt()) 
            {
        			scnr.nextLine();
        			System.out.println("Error! Invalid number.");
            }
            newInt = scnr.nextInt();
             
             
            maximum = Math.max(maximum, newInt);
            minimum= Math.min(minimum, newInt);
            average= (average + newInt);   
        }
        average=average/10;
        System.out.println("This is the Maximum :" +maximum);
        System.out.println("This is the Minimum :" +minimum);
        System.out.println("This is the Average :" +average);
         
       
	}
}