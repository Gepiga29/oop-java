/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gepigadatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GepigaDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Scanner sc = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble(); 
        double celsius = (fahrenheit - 32)* 5.0/9.0;
        
        System.out.println(fahrenheit+" degrees Fahrenheit is equal to "+ celsius + " in Celsius");
    }
}
    
    

