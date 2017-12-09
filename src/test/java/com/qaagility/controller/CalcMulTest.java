package com.qaagility.controller;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcMulTest {
  CalcMul myCal = new CalcMul();
  
  public void testSlow() {
     System.out.println("slow");
  }
  
public void testSlower() {
     System.out.println("slower");
  }

public void testFast() {
     System.out.println("fast-updated");
  }

 @Test
    public void testCalc(){
      assertEquals("Result",18,myCal.multiply(3,6));
    }
  
 @Test
    public void testCalc1(){
      assertEquals("Result",240,myCal.multiply(40,6));
    }
}
