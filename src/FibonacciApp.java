import java.util.ArrayList;
import java.util.List;

public class FibonacciApp {

    //MAIN
    public static void main(String[] args) {
        System.out.println("Fibonacci without recursion: "+generateFibonacciSequence(8,0));
        System.out.println("Recursive Fibonacci: "+generateRecursiveFibonacciSequence(8));
    }

    //FIBONACCI WITHOUT RECURSION
    public static ArrayList<Integer> generateFibonacciSequence(int count, int startValue){
        if(count <3){
            throw new IllegalArgumentException("count must be greater than or equal to 3");
        }
        else{
            int firstValue=startValue;
            int secondValue=firstValue+1;
            int tempSum=0;

            ArrayList<Integer> sequence = new ArrayList<>(List.of(firstValue,secondValue));

            for(int i=2;i<count;i++){
                tempSum=firstValue+secondValue;
                sequence.add(tempSum);
                firstValue=secondValue;
                secondValue=tempSum;
            }
            return sequence;
        }
    }

    //RECURSIVE FIBONACCI
    public static int recursiveFibonacci(int index){
        if(index<=1)return index;

        return recursiveFibonacci(index-2) + recursiveFibonacci(index-1);
    }

    public static ArrayList<Integer> generateRecursiveFibonacciSequence(int count){
        ArrayList<Integer> sequence = new ArrayList<>();
        for(int i=0;i<count;i++){
            sequence.add(recursiveFibonacci(i));
        }
        return sequence;
    }




    



}
