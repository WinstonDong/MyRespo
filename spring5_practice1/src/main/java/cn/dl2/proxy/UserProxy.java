package cn.dl2.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    //提取了公共切入点
    @Pointcut(value = "execution(* cn.dl2.domain.User.add())")
    public void pointcutDemo(){
        System.out.println("pointcutDemo has executed...");
    }

    //前置通知
    //@Before(value = "execution(* cn.dl2.domain.User.add(..))")
    @Before(value = "pointcutDemo()")
    public void before(){
        System.out.println("before...");
    }

    //后置通知
    @AfterReturning(value = "pointcutDemo()")
    public void afterRunning(){
        System.out.println("afterRunning....");
    }

    //环绕通知
    @Around(value = "pointcutDemo()")
    public void arroundRunning(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("preRunning....");
        proceedingJoinPoint.proceed();
        System.out.println("afterRunning...");
    }

    //异常通知
    @AfterThrowing(value = "execution(* cn.dl2.domain.User.add(..))")
    public void exceptionRunning(){
        System.out.println("exception running...");
    }

    //最终通知
    @After(value = "execution(* cn.dl2.domain.User.add(..))")
    public void finalRunning(){
        System.out.println("final running....");
    }
}
