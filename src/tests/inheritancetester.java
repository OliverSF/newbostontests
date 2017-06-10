package tests;

public class inheritancetester {

	public static void main(String[] args) {
		//Creating objects from subclasses
		
		inheritance inheritObject = new inheritance();
		inheritance2 inheritance2Object = new inheritance2();
		
		inheritObject.eat();
		inheritance2Object.eat();

	}

}
