/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module2lab1;
import java.util.Scanner;

/**
 *
 * @author behlt
 */


public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice invoice = new Invoice("", "", 0, 0.0);

        System.out.println("Enter the part number: ");
        invoice.setPartNumber(input.nextLine());
        System.out.println("Enter the part description: ");
        invoice.setPartDescription(input.nextLine());
        System.out.println("Enter the quantity: ");
        invoice.setQuantity(input.nextInt());
        System.out.println("Enter the price per item: ");
        invoice.setPricePerItem(input.nextDouble());

        System.out.println("\nPart number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: $" + invoice.getPricePerItem());
        System.out.println("Invoice amount: $" + invoice.getInvoiceAmount());
    }
}

