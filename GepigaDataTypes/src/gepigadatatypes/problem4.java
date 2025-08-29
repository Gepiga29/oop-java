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
public class problem4 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("  Input weight in pounds: " );
        double pounds = sc.nextDouble();
        System.out.println("Input height in inches: ");
        double inches = sc.nextDouble();
        
        double weightkg = pounds * 0.45359237;
        double heightinches = inches * 0.0254;
        double BMI = weightkg/(heightinches*heightinches);
        
        System.out.println(" Body Mass Index is "+BMI);
                
    }
}


