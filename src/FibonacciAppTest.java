import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciAppTest {

    //FIBONACCI WITHOUT RECURSION

    @Test
    void startWithZero_WithCountOfEight() {
        //given
        int startValue = 0;
        int count=8;
        //when
        ArrayList<Integer> result = FibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3,5,8,13));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithZero_WithCountOfFive() {
        //given
        int startValue = 0;
        int count=5;
        //when
        ArrayList<Integer> result = FibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithOne_WithCountOfEight() {
        //given
        int startValue = 1;
        int count=8;
        //when
        ArrayList<Integer> result = FibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,5,8,13,21,34));
        //then
        assertEquals(expected,result);
    }

    @Test
    void startWithOne_WithCountOfFive() {
        //given
        int startValue = 1;
        int count=5;
        //when
        ArrayList<Integer> result = FibonacciApp.generateFibonacciSequence(count, startValue);
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
        ArrayList<Integer> result = FibonacciApp.generateFibonacciSequence(count, startValue);
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
        ArrayList<Integer> result = FibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-5,-4,-9,-13,-22,-35,-57,-92));
        //then
        assertEquals(expected,result);
    }

    @Test
    void shouldThrowIllegalArgumentException_OnNegativeCount() {
        //given
        int startValue = 1;
        int count=-1;
        //then
        assertThrows(IllegalArgumentException.class,()->{
            FibonacciApp.generateFibonacciSequence(count, startValue);
        });
    }

    @Test
    void shouldThrowIllegalArgumentException_OnCountLessThanThree() {
        //given
        int startValue = 1;
        int count=2;
        //then
        assertThrows(IllegalArgumentException.class,()->{
            FibonacciApp.generateFibonacciSequence(count, startValue);
        });
    }

    @Test
    void shouldReturnFibonacciSequence_WithCountOfThree() {
        //given
        int startValue = 2;
        int count=3;
        //when
        ArrayList<Integer> result = FibonacciApp.generateFibonacciSequence(count, startValue);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,3,5));
        //then
        assertEquals(expected,result);
    }

    //RECURSIVE FIBONACCI

    @Test
    void testIndividualReturnValues(){
        //given
        assertEquals(0,FibonacciApp.recursiveFibonacci(0));
        assertEquals(1,FibonacciApp.recursiveFibonacci(1));
        assertEquals(1,FibonacciApp.recursiveFibonacci(2));
        assertEquals(2,FibonacciApp.recursiveFibonacci(3));
        assertEquals(3,FibonacciApp.recursiveFibonacci(4));
        assertEquals(5,FibonacciApp.recursiveFibonacci(5));
    }


    @Test
    void generateSequenceForCountOfEight() {
        //given
        int count=8;
        //when
        ArrayList<Integer> result = FibonacciApp.generateRecursiveFibonacciSequence(count);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3,5,8,13));
        //then
        assertEquals(expected,result);
    }

    @Test
    void generateSequenceForCountOfFive() {
        //given
        int count=5;
        //when
        ArrayList<Integer> result = FibonacciApp.generateRecursiveFibonacciSequence(count);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3));
        //then
        assertEquals(expected,result);
    }
}