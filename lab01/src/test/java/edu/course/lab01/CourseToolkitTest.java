package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);
        assertTrue(result);
    }

    @Test
    void returnsFalseForOne() {
        boolean result = CourseToolkit.isPrime(1);
        assertFalse(result);
    }

    @Test
    void returnsFalseForTrirtySix() {
        boolean result = CourseToolkit.isPrime(36);
        assertFalse(result);
    }

    @Test
    void returnsFalseForFortyNine() {
        boolean result = CourseToolkit.isPrime(49);
        assertFalse(result);
    }

    @Test
    void returnsTrueForTwo() {
        boolean result = CourseToolkit.isPrime(2);
        assertTrue(result);
    }

    @Test 
    void returnsTrueForNegativeEvenNumber(){
        boolean result = CourseToolkit.isEven(-8);
        assertTrue(result);
    }

    @Test 
    void testIsPalindrome(){
        boolean result = CourseToolkit.isPalindrome("казак");
        assertTrue(result);
    } 
    @Test  
    void testIsPalindrome2(){
        boolean result = CourseToolkit.isPalindrome("нос");
        assertFalse(result);
    }
    @Test 
    void testIsPalindrome3(){
        boolean result = CourseToolkit.isPalindrome("");
        assertTrue(result);
    } 
     @Test 
    void testIsPalindrome0(){
        assertThrows(IllegalArgumentException.class,() ->CourseToolkit.isPalindrome(null));
    }
    
    @Test 
    void testAverage(){
       assertEquals(3.5,CourseToolkit.average(new int[]{3, 4}));
    }

    @Test 
    void testAverage1(){
       assertEquals(-3.5,CourseToolkit.average(new int[]{-3,-4}));
    }

    @Test 
    void testAverage2(){
       assertThrows(IllegalArgumentException.class,()->CourseToolkit.average(null));
    }

     @Test 
    void testAverage3(){
       assertThrows(IllegalArgumentException.class,()->CourseToolkit.average(new int[]{}));
    }

    @Test 
    void testmax(){
       assertEquals(4,CourseToolkit.max(new int[]{3, 4}));
    }

    @Test 
    void testmin(){
       assertEquals(3,CourseToolkit.min(new int[]{3, 4}));
    }

    @Test 
    void testmax2(){
       assertThrows(IllegalArgumentException.class,()->CourseToolkit.max(null));
    }

    @Test 
    void testmax3(){
       assertThrows(IllegalArgumentException.class,()->CourseToolkit.max(new int[]{}));
    }

     @Test 
    void testmin2(){
       assertThrows(IllegalArgumentException.class,()->CourseToolkit.min(new int[]{}));
    }
    @Test 
    void testmin3(){
       assertThrows(IllegalArgumentException.class,()->CourseToolkit.min(null));
    }

}
