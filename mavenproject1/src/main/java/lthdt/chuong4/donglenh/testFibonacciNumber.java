/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong4.donglenh;
import lthdt.chuong4.logic.FibonacciNumber;
/**
 *
 * @author LENOVO
 */
public class testFibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciNumber fn = new FibonacciNumber();
        System.err.println("So Fibonacci tai n = 15 la: " +fn.calcFibo(15));
        for (int i = 1; i <= 20; i++){
            System.out.println(fn.calcFibo(i) +". ");
        }
    }
    
}
