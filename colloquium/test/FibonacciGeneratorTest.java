/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Koloktask.Koloktask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FibonacciGeneratorTest {

    private final Koloktask generator = new Koloktask();

    @Test
    public void testGenerateFibonacci_ValidInput() 
    {
        assertEquals(List.of(0), generator.generateFibonacci(1));
        assertEquals(List.of(0, 1), generator.generateFibonacci(2));
        assertEquals(List.of(0, 1, 1, 2, 3), generator.generateFibonacci(5));
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8), generator.generateFibonacci(7));
    }

    @Test
    public void testGenerateFibonacci_ZeroInput() 
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
        {
            generator.generateFibonacci(0);
        });
        assertEquals("n должно быть натуральным числом (n > 0)", exception.getMessage());
    }

    @Test
    public void testGenerateFibonacci_NegativeInput() 
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
        {
            generator.generateFibonacci(-5);
        });
        assertEquals("n должно быть натуральным числом (n > 0)", exception.getMessage());
    }
}
