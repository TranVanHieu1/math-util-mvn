/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vanhieu.mathutil.core;

/**
 *
 * @author Admin
 */

//Đây là bộ thư viện chưa các hàm dùng trong tính toán
//Toán học, clone giống class Math bên JDK
//khi gọi là thư việc dùng chung mà không cần nhớ 
// Gì sau khi xử lí -> thư viện chứa đò STATIC
public class MathUtility {
   
    public static final double PI = 3.1415;
    
    
    //àm tính n! = 1.2.3.4
    // n< 0> 20 ko tính do 21! tràn kiểu long
    //ko tính giai thừa âm!!!
    //0! = 1! = 1
    public static long getFactorial(int n) throws IllegalAccessException{
        long result = 1;
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be betwen 0...20");
        
        
        if(n==0 || n== 1)
            return 1;
        
        for(int i = 2; i <= n; i++)
            result *= i;
            
        
        return result;
    }
}
