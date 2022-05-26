package com.yang.junit;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;
public class CalculatorTest {
    @Before
    public void before(){
        System.out.println("do before");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("do beforeClass");}
    @Test
    public void evaluatesExpression(){
        System.out.println("do evaluatesExpression");
        Calculator calculator=new Calculator();
        int sum=calculator.evaluate("1+2+3");
        assertEquals(6,sum);}
    @Test
    public void evaluatesExpressionOther(){
        System.out.println("evaluatesExpressionOther");
        Calculator calculator=new Calculator();
        int sum=calculator.evaluate("1+2+3+4");
        assertEquals(10,sum);}
    @After
    public void after(){
        System.out.println("do after");}
    @AfterClass
    public static void afterClass(){
        System.out.println("do afterClass");
    }
}
