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
public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Number:  ");
	  int number = sc.nextInt();
          
          for (int i = number; i >= 1; i--) {
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println();
        }
    }
}


