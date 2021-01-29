package sk.kosickaakademia.vasinsky.aopdemo.dao;

import org.springframework.stereotype.Component;



@Component
public class MembershipDAO {
public void AddAccount(){
    System.out.println(getClass()+": ADDING A MEMBERSHIP ACCOUNT...");
}

public void goToSleep(){
    System.out.println(" GOING TO SLEEP... zZz ...");
}
}
