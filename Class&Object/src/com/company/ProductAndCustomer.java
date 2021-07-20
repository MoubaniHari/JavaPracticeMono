package com.company;
import java.util.Scanner;
class Product{
    private String itemNo;
    private String itemName;
    private double itemPrice;
    private short itemQty;

    public String getItemNo(){ return  itemNo;}
    public String getItemName(){ return itemName;}
    public double getItemPrice(){return itemPrice;}
    public short getItemQty(){return itemQty;}

    public void setItemPrice(double itemPrice1){
        itemPrice = itemPrice1;
    }
    public void setItemQty(short itemQty1){
        itemQty = itemQty1;
    }

    public Product(String itemNo1){
        itemNo = itemNo1;
    }
    public Product(String itemNo1,String itemName1){
        itemNo = itemNo1;
        itemName = itemName1;
    }
    public Product(String itemNo1,String itemName1,double itemPrice1,short itemQty1){
        itemNo = itemNo1;
        itemName = itemName1;
        setItemPrice(itemPrice1);
        setItemQty(itemQty1);
    }
}

class Customer{
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhNo;

    public String getCustomerId(){ return customerId;}
    public String getCustomerName(){ return customerName;}
    public String getCustomerAddress(){return customerAddress;}
    public String getCustomerPhNo(){return customerPhNo;}

    public void setCustomerAddress(String customerAddress1){
        customerAddress = customerAddress1;
    }
    public void setCustomerPhNo(String customerPhNo1){
        customerPhNo = customerPhNo1;
    }

    public Customer(String customerId1){
        customerId = customerId1;
    }
    public Customer(String customerId1,String customerName1){
        customerId = customerId1;
        customerName = customerName1;
    }
    public Customer(String customerId1,String customerName1,String customerAddress1,String customerPhNo1){
        customerId = customerId1;
        customerName = customerName1;
        setCustomerAddress(customerAddress1);
        setCustomerPhNo(customerPhNo1);
    }
}

public class ProductAndCustomer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the item number: ");
        String itemNo2 = s.nextLine();
        System.out.println("Enter the item name: ");
        String itemName2 = s.nextLine();
        System.out.println("Enter the item price: ");
        double itemPrice2 = s.nextDouble();
        System.out.println("Enter the quantity of the item: ");
        short itemQty2 = s.nextShort();
//        Product p = new Product(itemNo2);
//        Product p = new Product(itemNo2,itemName2);
        Product p = new Product(itemNo2,itemName2,itemPrice2,itemQty2);
        System.out.println("The item number of the product is - " + p.getItemNo());
        System.out.println("The name of the product is - " + p.getItemName());
        System.out.println("The price of the product is - " + p.getItemPrice());
        System.out.println("The quantity of the product is - " + p.getItemQty());

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the customer id: ");
        String customerId1 = s1.nextLine();
        System.out.println("Enter the customer name: ");
        String customerName1 = s1.nextLine();
        System.out.println("Enter the customer address: ");
        String customerAddress1 = s1.nextLine();
        System.out.println("Enter the customer phone number: ");
        String customerPhNo1 = s1.nextLine();
//        Customer c = new Customer(customerId1);
//        Customer c = new Customer(customerId1,customerName1);
        Customer c = new Customer(customerId1,customerName1,customerAddress1,customerPhNo1);
        System.out.println("The id number of the customer is - " + c.getCustomerId());
        System.out.println("The name of the customer is - " + c.getCustomerName());
        System.out.println("The address of the customer is - " + c.getCustomerAddress());
        System.out.println("The phone number of the customer is - " + c.getCustomerPhNo());
    }
}
