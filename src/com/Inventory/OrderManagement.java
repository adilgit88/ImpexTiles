package com.Inventory;

import java.util.*;


public class OrderManagement extends MainMethod
{
    private static int counter=1;
    private static Map<String,String> orderDetails=new HashMap<>();
    static Scanner sc=new Scanner(System.in);




//    static String customerName[]=new String[100];
//    static int customerPhoneNumber[]=new int[100];

    static ArrayList<String> item=new ArrayList<String>();
    static ArrayList<String> orders=new ArrayList<String>(); // for store the orders.
     OrderManagement(){

            System.out.println("\n<<<<< Order Management >>>>>\n");
            System.out.println("1.Create new Order");
            System.out.println("2.Edit Order");
            System.out.println("3.Order List");
            System.out.println("4.Main Menu");
            System.out.print("Select your choice (number only) : ");

            String select=sc.next();

            switch (select){
                case "1"://Create new order
                    NewOrder();
                    break;
                case "2"://Edit Order

                    break;
                case "3"://Order list
                    test();
                    break;
                case "4"://Main menu
                    new MainMenu();
                    break;
                case "0":
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("invalid choice please try again");


            }

        }
        static void test(){
            System.out.println("test method");
            if (orderDetails.isEmpty()){
                System.out.println("order list is empty please enter the orders ");
                new OrderManagement();
            }else {
                for (Map.Entry<String, String> entry : orderDetails.entrySet()) {
                    System.out.println("Order number: " + entry.getKey());
                    System.out.println("Order Details: " + entry.getValue());
                    new OrderManagement();
                }
            }
        }
        void NewOrder(){
        for (int i = 0; true; new OrderManagement()){
            String generateOrderNumber = generateOrderNumber();
            System.out.println("Order Number :"+generateOrderNumber);
            System.out.print("Customer Name: ");
            String name=sc.next();
            System.out.println("phone Number : ");
            String phoneNumber=sc.next();
            System.out.println("Email: ");
            String email=sc.next();
            System.out.println("item number or name : ");
            String item=sc.next();
//
//            System.out.println("Email2: ");
//            String email2=sc.next();

            System.out.println("order Created your order number is: "+generateOrderNumber );


            orderDetails.put(generateOrderNumber,"\n  name : "+name+"\n  Phone number: "+phoneNumber+"\n  Email: "+email+"\n  item : "+item);

        }




        }
private static String generateOrderNumber(){
         String s=String.format("%04d",counter);
         counter++;
         return s;
}


     }

