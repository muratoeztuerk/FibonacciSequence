/** 
 * 
 * In mathematics, the Fibonacci numbers are the numbers in the following 
 * integer sequence, called the Fibonacci sequence, and characterized by the fact 
 * that every number after the first two is the sum of the two preceding ones:
 * 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144.... [WIKIPEDIA]
 * 
 * @author Murat Öztürk 
 * 
 */


public class FibonacciSequence {

	public static void main(String[] args) {

		for (int i = 0; i < 13; i++) {
			System.out.println(FibonacciNumbers(i));
		}

	}

	static int FibonacciNumbers(int n) {

		if (n <= 1)
			return n;
		else
			return FibonacciNumbers(n - 1) + FibonacciNumbers(n - 2); // F(n) = F(n-1) + F(n-2)

	}

}


