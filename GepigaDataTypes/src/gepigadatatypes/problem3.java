/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gepigadatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class problem3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        int minutes = sc.nextInt();
        int minutes_in_day = 1440;
        int minutes_in_year = 526600;
        
        int year = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;
        
        
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
        
      
    }
}

