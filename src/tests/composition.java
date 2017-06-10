package tests;

public class composition {
	private String name;
	private PotPie birthday;
	
	public composition(String theName, 	PotPie theDate) {
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}

}
