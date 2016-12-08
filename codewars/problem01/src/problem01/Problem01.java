/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem01;

import java.util.Scanner;

/**
 *
 * @author gingrbred
 */
public class Problem01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What's Your Name?");
        String response = scan.nextLine();
        System.out.printf("Greetings, O Honorable %s the Magnificent! May I kiss your signet ring? \n", response);
    }
    
}
