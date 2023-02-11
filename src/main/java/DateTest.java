
import virk.manpreet.invoice.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class DateTest {
   public static void main(String[] args) {
      Date date = new Date(2, 11, 2023);
      System.out.println("Month: " + date.getMonth());
      System.out.println("Day: " + date.getDay());
      System.out.println("Year: " + date.getYear());
      System.out.println("Date: ");
      date.displayDate();
   }
}

  
