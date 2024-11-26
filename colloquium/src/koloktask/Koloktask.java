/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Koloktask;

/**
 *
 * @author egorm
 */
// 

import java.util.ArrayList;
import java.util.List;

public class Koloktask {

    public List<Integer> generateFibonacci(int n) 
    {
        if (n <= 0) 
        {
            throw new IllegalArgumentException("n должно быть натуральным числом (n > 0)");
        }
        List<Integer> fibonacciNumbers = new ArrayList<>();
        if (n >= 1) 
        {
            fibonacciNumbers.add(0); 
        }
        if (n >= 2) 
        {
            fibonacciNumbers.add(1); 
        }
        for (int i = 2; i < n; i++) 
        {
            int nextNumber = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
            fibonacciNumbers.add(nextNumber);
        }
        return fibonacciNumbers;
    }
    
}
