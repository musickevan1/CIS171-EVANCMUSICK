/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gregcalsubmit;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author evanmusick
 */
public class GregCalSubmit {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a month (1-12): ");
    int month = input.nextInt() - 1;
    System.out.print("Enter year: ");
    int year = input.nextInt();
    input.close();

    Calendar calendar = new GregorianCalendar(year, month, 1);
    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

    System.out.println("     " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG,
      java.util.Locale.getDefault()) + " " + calendar.get(Calendar.YEAR));
    System.out.println("----------------------------------");
    System.out.println(" Sun Mon Tue Wed Thr Fri Sat");

    calendar.set(Calendar.DAY_OF_MONTH, 1);
    int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
      System.out.print("    ");
    }

    for (int i = 1; i <= daysInMonth; i++) {
      if (i < 10) {
        System.out.print("   " + i);
      } else {
        System.out.print("  " + i);
      }

      if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
        System.out.println();
      }

      calendar.add(Calendar.DAY_OF_MONTH, 1);
    }

    System.out.println();

  }
}