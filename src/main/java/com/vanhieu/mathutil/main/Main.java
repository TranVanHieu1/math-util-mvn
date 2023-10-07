/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vanhieu.mathutil.main;

import com.vanhieu.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //test thử hàm mình vừa tính giai thừa có đúng không
        // chuẩn bị data test, test case
        //Test case #1: check if getFactorial() runs well with n = 0;
        //Test procedures: given n = 0, Invoke getFactorial(n=0)
        
        //Expected Result : 1  // 0! = 1
        
        long expected = 1;
        int n = 0;  //nếu tôi đưa vào 0!
        long actual = MathUtility.getFactorial(0); //chạy hàm mới biết
        
        System.out.println(n + "! | Expected " + expected + "| actual " + actual);
        
        //in ra và tự kết luận có giống không
        
    }
          
}
