// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		for(int c=0; c<x2; c++)
		{
			x1++;
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		for(int c=0; c<x2; c++)
		{
			x1--;
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int newv = 0;
		for(int c=0; c<x2; c++)
		{
			newv = plus(newv,x1);
		}
		return newv;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		if (n == 0)
		{
			return 1;
		}
		int newv = 1;
		for(int c=0; c<n; c++)
		{
			newv = times(newv,x);
		}
		return newv;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int div = 0;
		while (x1>=x2)
		{
			x1 = minus(x1,x2);
			div ++;
		}
		return div;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int div1 = div(x1,x2);
		int x2v = times(x2,div1);
		int modu = minus(x1,x2v);
		return modu;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int v = 1;
		while (true)
		{
			int v2 = times(v,v);
			if (v2 == x)
			{
				return v;
			}
			else if (v2 > x)
			{
				return minus(v,1);
			}
			v ++;
		}
		
	}	  	  
}