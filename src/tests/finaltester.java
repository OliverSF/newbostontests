package tests;

public class finaltester {

	public static void main(String[] args) {
		finalclass finalObject = new finalclass(10);
		
		for(int i = 0; i <5; i++){
			finalObject.add();
			System.out.printf("%s",finalObject);
		}
	}

}
