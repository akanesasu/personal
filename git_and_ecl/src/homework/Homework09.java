package homework;

public class Homework09 {
	public static void main(String[] args) {
		AddFuncI afi = (int x, int y) -> x+y;
		System.out.println(afi.add(37, 5));
		
		MulFuncI mufi = (int x, int y) -> System.out.println(x*y);
		mufi.mul(37, 5);
		
		MinusFuncI mfi = (int x, int y) -> System.out.println(x-y);
		mfi.minus(37, 5);
		
		isPrimeFuncI ipfi = x -> {
			if(x==1) return false;
			for(int i=2;i<x;i++) if(x%i==0) return false;
			return true;
		};
		System.out.println(ipfi.isPrime(72));
	} // end main
} // end class 

@FunctionalInterface
interface AddFuncI {
	public abstract int add(int x, int y);
}

@FunctionalInterface
interface MulFuncI {
	public abstract void mul(int x, int y);
}

@FunctionalInterface
interface MinusFuncI {
	public abstract void minus(int x, int y);
}

@FunctionalInterface
interface isPrimeFuncI {
	public abstract boolean isPrime(int x);
}