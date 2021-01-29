package sk.kosickaakademia.vasinsky.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.kosickaakademia.vasinsky.aopdemo.dao.AccountDAO;
import sk.kosickaakademia.vasinsky.aopdemo.dao.MembershipDAO;

import java.util.List;

public class AfterReturningDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
       List<Account> theAccounts = theAccountDAO.findAccounts();


        System.out.println("\n \n Main program for AfterReturningDemoApp");
        System.out.println("---------");
        System.out.println(theAccounts);
        System.out.println("\n");



        context.close();

    }

}
