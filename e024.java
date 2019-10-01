package e024;


import java.math.BigInteger;

public class e024 {
	private static long ans;
	private static int max;
	private	static BigInteger a;
	private	static BigInteger b;

	public e024(BigInteger ONE, int i) {
		a = b = ONE;
		ans=2;
		max=i;
	}

	public static void main(String[] args) {

		e024 d = new e024(BigInteger.ONE,1000);
		d.work();
		d.print();
	}

	private void print() {
		System.out.print(ans);
		
	}

	private void work() {
	while(true) {
		ans++;
		BigInteger c=a.add(b);
		if(Chek(c.toString())) break;
		a=b;
		b=c;
	}
		
		
	}

	private boolean Chek(String s) {
		if(s.length()==max)
			return true;
		return false;
	}

	/*
	 * 1000-digit Fibonacci number   
     * Problem 25
	 * 
	 */

}
