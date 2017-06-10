package tests;

public class finalclass {
	private int sum;
	private final int NUMS;
	
	public finalclass(int x) {
		NUMS = x;
	}
	
	public void add(){
		sum +=NUMS;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
}
	