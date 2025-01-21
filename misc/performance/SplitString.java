package performance;

public class SplitString {

	public static void main(String[] args) {
		 String input = "Name:- N Pradeep P Pai Father:- N Pramod S Pai Address:- 3-33, Shri Mahalasa, Naikanakatte Kergal (Udupi)";

	        // Split the string using ':-' as a delimiter
	        String[] parts = input.split(":-");
	        
	       // System.out.println(parts[0]);
	       // System.out.println(parts[1]);
	       // System.out.println(parts[2]);
	        System.out.println(parts[3]);
	        
	        String [] parts1 = parts[1].split("Father");
	        System.out.println(parts1[0]);
	      //  System.out.println(parts1[1]);
	        
	        String [] parts2 = parts[2].split("Address");
	        System.out.println(parts2[0]);
	      //  System.out.println(parts2[1]);
	        
//	        // Extract each part and trim the extra spaces
//	        String name = parts[1].split("Father")[0].trim();
//	        String father = parts[2].split("Address")[0].trim();
//	        String address = parts[3].trim();
//
//	        // Print the results
//	        System.out.println("Name: " + name);
//	        System.out.println("Father: " + father);
//	        System.out.println("Address: " + address);
	}

}
