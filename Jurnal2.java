/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.pkg2;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class Jurnal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int n, i, j, space = 1;

        System.out.print("Enter the number of rows: ");

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        space = n - 1;

        for (j = 1; j <= n; j++) 

        {

            for (i = 1; i <= space; i++) 

            {

                System.out.print(" ");

            }

            space--;

            for (i = 1; i <= 2 * j - 1; i++) 

            {

                System.out.print("*");                

            }

            System.out.println("");

        }

        space = 1;

        for (j = 1; j <= n - 1; j++) 

        {

            for (i = 1; i <= space; i++) 

            {

                System.out.print(" ");

            }

            space++;

            for (i = 1; i <= 2 * (n - j) - 1; i++) 

            {

                System.out.print("*");

            }

            System.out.println("");

        }

    }
    
}
