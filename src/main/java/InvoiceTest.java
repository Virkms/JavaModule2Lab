/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import virk.manpreet.invoice.Invoice;
/**
 *
 * @author Virkms
 */
public class InvoiceTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input part:");
        String Part = input.nextLine();
        System.out.print("input Decription:");
        String Description = input.nextLine();
        System.out.print("input quantity:");
        int quantity = input.nextInt();
        System.out.print("input price:");
        double price =input.nextDouble();
        Invoice invoice = new Invoice(Part,Description,quantity,price);
         System.out.println("Part number: " + invoice.getPart());
        System.out.println("Part description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPrice());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
        
    }
    
}
