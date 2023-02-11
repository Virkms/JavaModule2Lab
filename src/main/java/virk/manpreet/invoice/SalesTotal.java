package virk.manpreet.invoice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java. util. Scanner;
public class SalesTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int ProductNum;
        int quantity;
       double retailPrice;
         ProductNum = input.nextInt();
         while (ProductNum != -1) {
         quantity = input.nextInt();
         
         retailPrice = switch (ProductNum) {
                case 1 -> 2.98;
                case 2 -> 4.50;
                case 3 -> 9.98;
                case 4 -> 4.49;
                case 5 -> 6.87;
                default -> 0;
            };
          
         System.out.println("Enter product number (1 to 5) and quantity sold");
                  ProductNum= input.nextInt();
total += retailPrice * quantity;

                 
    }
    System.out.println("Total Sale is" + total + "Dollars");
    System.out.print(total);
    int N = 5;
  System.out.println("N\t10*N\t100*N\t1000*N\n");
  for(int i=1;i<=N;i++)
    System.out.println(i + "\t" + i * 10 + "\t" + i * 100 + "\t" + i * 1000);
} 
} 
    

