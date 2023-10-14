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
//    public static long getFactorial(int n) throws IllegalAccessException{
//        long result = 1;
//        
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be betwen 0...20");
//        
//        
//        if(n==0 || n== 1)
//            return 1;
//        
//        for(int i = 2; i <= n; i++)
//            result *= i;
//            
//        
//        return result;
//    }
    
    // Nâng cấp hàm tính giai thừa, dùng thuật toán đệ quy
    
    // n! = 1.2.3.4.5...
    //5! = 1.2.3.4.5
    // 5! = 4! x 5
    // 4! = 3! x 4
    // 3! = 2! X 3
    // 2! = 2 X 1!
    //1! là 1, dừng, không đuổi bắt
    
    // n! = n x ( n-1)!
    // đệ quy == recursion: gọi lại chính mình với một quy mô nhỏ hơn
     public static long getFactorial(int n) throws IllegalAccessException{
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be betwen 0...20");
        
        
        if(n==0 || n== 1)
            return 1;
        
        return n * getFactorial(n-1); //n! = (n-1)!
    }
}
