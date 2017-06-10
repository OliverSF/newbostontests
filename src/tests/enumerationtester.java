package tests;

import java.util.EnumSet;

public class enumerationtester {

	public static void main(String[] args) {
		for(enumeration people : enumeration.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
		}
		System.out.println("\nAnd now for the range of constants!!!\n");
		
		for	(enumeration people: EnumSet.range(enumeration.kelsey, enumeration.candice)) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
	}

	}
}