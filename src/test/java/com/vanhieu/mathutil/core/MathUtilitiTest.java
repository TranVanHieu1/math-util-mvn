/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vanhieu.mathutil.core;

import com.vanhieu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilitiTest {
    //Cấu trúc của test case gồm: ID hoặc Desc hoặc Step/Procedures | Expected Result | Status
    //Test case #1: - Verify getFactorial(with n = 0)
    //Step: 
        // 1.Given n = 0
        // 2.Call/invoke getFactorial (n=0)
    //Expected Result:
            // the method must return 1 as the result of 0!
    //Status: PASSED | FALLED đoán xem, chờ code xong, chạy mới biết được
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk() throws IllegalAccessException {
        assertEquals(1, MathUtility.getFactorial(0));
        
    }
    
    //Test case #2: - Verify getFactorial(with n = 1)
    //Step: 
        // 1.Given n = 1
        // 2.Call/invoke getFactorial (n=1)
    //Expected Result:
            // the method must return 1 as the result of 1!
    //Status: PASSED | FALLED đoán xem, chờ code xong, chạy mới biết được
     @Test
    public void verifyFactorialGivenRightArgument1ReturnOk() throws IllegalAccessException{
        assertEquals(1, MathUtility.getFactorial(1));
        
    }
    //Test case #3: - Verify getFactorial(with n = 5)
    //Step: 
        // 1.Given n = 5
        // 2.Call/invoke getFactorial (n=5)
    //Expected Result:
            // the method must return 120 as the result of 5!
    //Status: PASSED | FALLED đoán xem, chờ code xong, chạy mới biết được
     @Test
    public void verifyFactorialGivenRightArgument5ReturnOk() throws IllegalAccessException{
        assertEquals(120, MathUtility.getFactorial(5));
        
    }
    
}
