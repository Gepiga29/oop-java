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
public class problem7 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
      int sum = 0, number;
     
      
        do {
            System.out.println("Enter a Number: ");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("Sum: "+ (sum - 0));
          
    }
}

    

