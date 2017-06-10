package tests;

public enum enumeration {
	oliver("nice","22"),
	kelsey("cutie", "13"),
	julia("goodtime", "15"),
	nicole("italian", "23"),
	candice("different", "21"),
	sarah("tada","25");
	
	
	private final String desc;
	private final String year;
	
	enumeration(String description, String age) {
		desc = description;
		year = age;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getAge() {
		return year;
	}
}
