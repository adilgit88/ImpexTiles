package com.Inventory;




import java.util.Scanner;

public class MainMethod
{
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        new UserManagement();
       new InventoryManagement();
      new MainMenu();
        new OrderManagement();
        System.out.println("hi back to main method");
    }
}
