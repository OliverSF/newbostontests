package tests;

public class CompoundInterestTest {
	//Compound Interest: A(amount) = P(principle - what's there now)(1 + R(rate))^ n (number of years) ie A=P(1+R)^n

	public static void main(String[] args) {
		double amount;
		double principle = 10000;
		double rate = .01; //gaining 1% per day
		
		for (int day = 1; day <= 20; day++) {
			amount = principle*Math.pow(1 + rate, day); //Math.pow is build in formula
		System.out.println(day + " " + amount);
		}
		
	}

}
