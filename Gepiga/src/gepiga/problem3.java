/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gepiga;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class problem3 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Input a 1st number:  ");
	  int firstnum = sc.nextInt();
            System.out.print("Input a 2nd number:  ");
            int secondnum = sc.nextInt();
            System.out.print("Input a 3rd number:  ");
	  int thirdnum = sc.nextInt();
          
        int greatest = firstnum;
        if (secondnum > greatest) {
            greatest = secondnum;
        } 
        if (thirdnum > greatest) {
            greatest = thirdnum;
        }
        System.out.println("The Greatest: "+ greatest);
    }
                  
    }

    
