/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;
import java.util.Scanner;
/**
 *
 * @author theCh
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // initialize variables, and do math
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int intYear = sc.nextInt();
        int a = intYear % 19;
        int b = intYear / 100; int c = intYear % 100;
        int d = b / 4; int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h =(19 * a + b - d - g + 15) % 30;
        int j = c / 4; int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2* j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;
        
        //Deciding the month
        String Month;
        switch (n) {
            case 1: Month = "January";
            break;
            case 2: Month = "Febuary";
            break;
            case 3: Month = "March";
            break;
            case 4: Month = "April";
            break;
            case 5: Month = "May";
            break;
            case 6: Month = "June";
            break;
            case 7: Month = "July";
            break;
            case 8: Month = "August";
            break;
            case 9: Month = "September";
            break;
            case 10: Month = "October";
            break;
            case 11: Month = "November";
            break;
            case 12: Month = "December";
            break;
            default: Month = "Invalid  Month";
            break;
        }
        
        // Output the result
        System.out.println("In " + intYear + ", Easter Sunday fell on " + Month + " " + p + ".");
    }
    
}
