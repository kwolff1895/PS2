package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int newiValue) {
		iValue = newiValue;
	}

	public int getiValue() {
		return iValue;

	}

	public boolean isEven() {
		return isEven(iValue);
	}
	
	public boolean isPrime(){
		return isPrime(iValue);
	}


	public boolean isOdd() {
		return isOdd(iValue);
	}

	public static boolean isPrime(int n){
		if (n==1){
			return false;
		}
		for (int a=2; a<=a/2; a++){
			if (n % a == 0) {
				return false;
				
			}
		}
		return true;
	}

	public static boolean isEven(int n) {
		return (n%2==0);
	}

	public static boolean isOdd(int n) {
		return (n%2 != 0);
	}


	public static boolean isEven(MyInteger n) {
		return n.isEven();
	}

	public static boolean isOdd(MyInteger n) {
		return n.isOdd();
	}

	public static boolean isPrime(MyInteger n) {
		return n.isPrime();
	}

	public boolean equals(int n) {
		return (iValue == n);
	}

	public boolean equals(MyInteger n) {
		return equals(n.getiValue());
	}
}
