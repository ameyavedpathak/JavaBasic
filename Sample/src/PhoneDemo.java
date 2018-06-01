public class PhoneDemo {
	public static String searchPhone(String[][] records, String name) {
		for(int i=0; i< 4; i++) {
			//if (records[i][0].trim().equalsIgnoreCase(name.trim())) {
				if (records[i][0].equalsIgnoreCase(name)) {
				return records[i][1];
			}
			

		}
		return null;	
	}
	
	public static void main(String[] args) {
		String phoneBook [][] = {
				{"Tom", "555-3322"},
				{"Mary", "555-8976"},
				{"Jon", "555-1037"},
				{"Rachel", "555-1400"}
				
		};
		System.out.println(searchPhone(phoneBook, "Mary"));
		System.out.println(searchPhone(phoneBook, "Tom"));
		System.out.println(searchPhone(phoneBook, "Jon"));
		System.out.println(searchPhone(phoneBook, "Rachel"));
	}

}