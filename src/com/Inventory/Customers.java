package com.Inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Customers extends OrderManagement
{
        private List<CustomersDetails>CustomersList;
    public Customers() {
        this.CustomersList = new ArrayList<>();
    }
public void addCustomer(CustomersDetails customersDetails){
    CustomersList.add(customersDetails);
    System.out.println("i am ddin");
}

}

class CustomersDetails{
    private String name;
    private String phoneNumber;
    private String email;
    //private Map<Integer, OrderManagement>;


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}