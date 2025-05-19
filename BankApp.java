package com.bank.app;
import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;
public class BankApp{
         public static void main(String[] args){
            BankAccount ban=new BankAccount();
            ban.setAccountNumber("2345678910089");
            ban.setBalance(50000.00);
           
          Customer cust=new Customer();
              cust.setCustomerName("Bujji");
              cust.setCustomerId(255);
          ban.showAccountDetails();
            System.out.println();
            cust.showCustomerDetails();
}
}
          