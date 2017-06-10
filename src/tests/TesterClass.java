package tests;

public class TesterClass {

	public static void main(String[] args) {
		NewTest Clock = new NewTest();
		NewTest Clock2 = new NewTest(5);
		NewTest Clock3 = new NewTest(5,13);
		NewTest Clock4 = new NewTest(5,13,23);
		
		System.out.printf("%s\n",Clock.toMilitary());
		System.out.printf("%s\n",Clock2.toMilitary());
		System.out.printf("%s\n",Clock3.toMilitary());
		System.out.printf("%s\n",Clock4.toMilitary());
		System.out.println(Clock.toString());
		
		
	}

}
