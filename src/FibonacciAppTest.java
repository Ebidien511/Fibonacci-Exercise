import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciAppTest {

    FibonacciApp fibonacciApp = new FibonacciApp();
    @Test
    void startWithZeroWithCountOfEight() {
        //given
        int startValue = 0;
        int count=8;
        //when
        ArrayList<Integer> result = fibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3,5,8,13));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithZeroWithCountOfFive() {
        //given
        int startValue = 0;
        int count=5;
        //when
        ArrayList<Integer> result = fibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithOneWithCountOfEight() {
        //given
        int startValue = 1;
        int count=8;
        //when
        ArrayList<Integer> result = fibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,5,8,13,21,34));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithOneWithCountOfFive() {
        //given
        int startValue = 1;
        int count=5;
        //when
        ArrayList<Integer> result = fibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,5,8));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithNegativeNumber() {
        //given
        int startValue = -1;
        int count=8;
        //when
        ArrayList<Integer> result = fibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-1,0,-1,-1,-2,-3,-5,-8));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithLesserNegativeNumber() {
        //given
        int startValue = -5;
        int count=8;
        //when
        ArrayList<Integer> result = fibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-5,-4,-9,-13,-22,-35,-57,-92));
        //then
        assertEquals(expected,result);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionOnNegativeCount() {
        //given
        int startValue = 1;
        int count=-1;
        //when
        assertThrows(IllegalArgumentException.class,()->{
            fibonacciApp.generateFibonacciSequence(count, startValue);
        });
    }

    @Test
    void shouldThrowIllegalArgumentExceptionOnCountLessThanThree() {
        //given
        int startValue = 1;
        int count=2;
        //when
        assertThrows(IllegalArgumentException.class,()->{
            FibonacciApp.generateFibonacciSequence(count, startValue);
        });
    }

    @Test
    void shouldReturnFibonacciSequenceWithCountOfThree() {
        //given
        int startValue = 2;
        int count=3;
        //when
        ArrayList<Integer> result = fibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,3,5));
        //then
        assertEquals(expected,result);
    }

    //RECURSIVE FIBONACCI



}