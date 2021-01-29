package sk.kosickaakademia.vasinsky.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

    @Before("sk.kosickaakademia.vasinsky.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterAndSetter()")
    public void logToCloudAsync(){
        System.out.println("\n =====>>> Logging to cloud");
    }

}
