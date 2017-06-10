package tests;

public class PotPieTester {

	public static void main(String[] args) {
		PotPie potObject = new PotPie(4,5,6);
		composition compositionObject = new composition("Greg", potObject);
		
		System.out.println(compositionObject);
	}

}
