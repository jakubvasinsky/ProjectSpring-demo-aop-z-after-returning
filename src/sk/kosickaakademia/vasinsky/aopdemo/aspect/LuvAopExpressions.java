package sk.kosickaakademia.vasinsky.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
public class LuvAopExpressions {

    @Pointcut("execution(* sk.kosickaakademia.vasinsky.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){ }

    @Pointcut("execution(* sk.kosickaakademia.vasinsky.aopdemo.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* sk.kosickaakademia.vasinsky.aopdemo.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterAndSetter(){}
}
