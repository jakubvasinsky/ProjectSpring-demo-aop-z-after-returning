package sk.kosickaakademia.vasinsky.aopdemo.dao;


import org.springframework.stereotype.Component;
import sk.kosickaakademia.vasinsky.aopdemo.Account;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

private String name;
private String serviceCode;


public List <Account> findAccounts() {

    List<Account> myAccounts = new ArrayList<>();
    Account temp1 = new Account("Jožko", "silver");
    Account temp2 = new Account("František", "gold");
    Account temp3 = new Account("Alžbeta", "platinum");

    myAccounts.add(temp1);
    myAccounts.add(temp2);
    myAccounts.add(temp3);

    return myAccounts;
}


    public void AddAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass()+ ": ADDING AN ACCOUNT... ");
    }

    public boolean doWork(){
        System.out.println(" DOING WORK: WRITING CODE...");
    return true;
    }


    public String getName() {
        System.out.println(getClass()+ ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+ ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass()+ ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass()+ ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
