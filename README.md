# springboot2-aop-jpa
Demo project for Spring Boot AOP and JPA

# Notes:
AOP is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns. It does this by adding additional behavior to existing code without modifying the code itself.

Instead, we can declare the new code and the new behaviors separately.

An **aspect** is a modularization of a concern that cuts across multiple classes. Unified logging can be an example of such cross-cutting concern.

A **Joinpoint** is a point during the execution of a program, such as the execution of a method or the handling of an exception.

A **Pointcut** is a predicate that helps match an Advice to be applied by an Aspect at a particular JoinPoint.

An **Advice** is an action taken by an aspect at a particular Joinpoint.


# Common AspectJ annotations :

**@Before** – Run before the method execution
    
**@After** – Run after the method returned a result

**@AfterReturning** – Run after the method returned a result, intercept the returned result as well.

**@AfterThrowing** – Run after the method throws an exception

**@Around** – Run around the method execution, combine all three advices above.

