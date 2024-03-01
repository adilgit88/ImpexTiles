package com.Inventory;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class InventoryManagement extends OrderManagement
{

   // static ArrayList<String> item=new ArrayList<String>();
    static Scanner sc=new Scanner(System.in);
    //static String item;

    InventoryManagement() {
        Inventory();
    }
    static void Inventory(){
        System.out.println("\n<<<<< Inventory Management >>>>>\n");
        System.out.println("1.Add Item");
        System.out.println("2.view Item");
        System.out.println("3.Delete Item");
        System.out.println("4.Main Menu");
        System.out.print("Select your choice (number only) : ");

        String select=sc.next();

        switch (select){
            case "1"://Add Item
                //System.out.println("Add Item");
                InventoryManagement.addItem();
                break;
            case "2"://Item List
                //System.out.println("\nItem List\n");
                viewItem();
                break;
            case "3"://Delete Item
                //System.out.println("Delete Item");
                deleteItem();
                break;
            case "4"://Main menu
                // System.out.println("Main menu");
                new MainMenu();
                break;
            case "0":
                System.out.println("Thank You");
                return;
            default:
                System.out.println("invalid choice please try again");
                Inventory();

        }
    }
    static void addItem(){

        System.out.print("Item Name : ");
        item.add(sc.next());
        System.out.println("item added successful");
        Inventory();

    }
    static void viewItem(){

        Iterator<String> i=item.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        Inventory();
    }
    static void deleteItem(){

        Iterator<String> i=item.iterator();
        System.out.println("\n <<<<< Item List >>>>>\n");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }



        if (item.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {

            System.out.print("\nEnter the item you want to remove: ");
            String itemRemove = sc.next();


            if (item.contains(itemRemove)) {
                item.remove(itemRemove);
                System.out.println(itemRemove + " has been removed from inventory.");

                System.out.println("\nSelect 1: for Delete more Items");
                System.out.println("Select 2: for Inventory Management");
                System.out.println("Select 3: for Main Menu\n");

                String select = sc.next();
                switch (select) {
                    case "1":
                        deleteItem();
                    case "2":
                        Inventory();
                    case "3":
                       new MainMenu();
                    default:
                        System.out.println("invalid choice please try again");

                }


            } else {
                System.out.println("\nItem not found in inventory.");
                Inventory();
            }
            sc.close();
        }
    }
}