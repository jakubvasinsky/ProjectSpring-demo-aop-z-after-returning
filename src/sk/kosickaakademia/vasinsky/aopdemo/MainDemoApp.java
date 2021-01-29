package sk.kosickaakademia.vasinsky.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.kosickaakademia.vasinsky.aopdemo.dao.AccountDAO;
import sk.kosickaakademia.vasinsky.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        Account myAccount = new Account();
        myAccount.setName("Jakub");
        myAccount.setLevel("Gold");
        theAccountDAO.AddAccount(myAccount, true);
        theAccountDAO.doWork();

        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");

        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();

        System.out.println("------------"+" Name: " +name + " Code:  " + code+ "-----------------");

        theMembershipDAO.AddAccount();
        theMembershipDAO.goToSleep();


        context.close();

    }

}
