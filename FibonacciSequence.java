/*

In mathematics, the Fibonacci numbers are the numbers in the following 
integer sequence, called the Fibonacci sequence, and characterized by the fact 
that every number after the first two is the sum of the two preceding ones:
1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144.... [WIKIPEDIA]

*/
package fibonaccisequence;

/**
 *
 * @author Murat Öztürk
 */
public class FibonacciSequence {

    public static void FibonacciNumbers(int first, int second, int last) {
        int sum=first+second;
        
        if (sum<=last){
            System.out.println(sum);
            FibonacciNumbers(sum, first, last);
        }
    }
    
    public static void main(String[] args) {
      
        FibonacciNumbers(0, 1, 150);
        
    }
    
}
