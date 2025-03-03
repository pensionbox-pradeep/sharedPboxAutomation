package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomBankIfsc 
{
	 private static final Map<String, List<String>> bankData = new HashMap<>();
	    static
	    {
	    bankData.put("AHMEDABAD MERCANTILE COOPERATIVE BANK", Arrays.asList(
	            "AMCB0RTGS4S", "AMCB0660036", "AMCB0660035", "AMCB0660034", 
	            "AMCB0660033", "AMCB0660032", "AMCB0660031", "AMCB0660030", 
	            "AMCB0660029", "AMCB0660028", "AMCB0660027", "AMCB0660026"
	    ));
	    bankData.put("ABHYUDAYA COOPERATIVE BANK LIMITED", Arrays.asList(
	            "ABHY0065001", "ABHY0065002", "ABHY0065003", "ABHY0065004", 
	            "ABHY0065005", "ABHY0065006", "ABHY0065007", "ABHY0065008", 
	            "ABHY0065009", "ABHY0065010", "ABHY0065011", "ABHY0065012"
	    ));
	    bankData.put("Ahmednagar Merchants Co-operative Bank", Arrays.asList(
	            "AMDN0000118", "AMDN0000117", "AMDN0000116", "AMDN0000115", 
	            "AMDN0000114", "AMDN0000113", "AMDN0000112", "AMDN0000111", 
	            "AMDN0000110", "AMDN0000109", "AMDN0000108", "AMDN0000107"
	    ));
	    }

	    // Method to get a random bank name and IFSC code
	    public static String[] getRandomBankAndIFSC() {
	        // Get a list of bank names
	        List<String> bankNames = new ArrayList<>(bankData.keySet());

	        // Generate a random bank name
	        Random random = new Random();
	        String bankName = bankNames.get(random.nextInt(bankNames.size()));

	        // Generate a random IFSC code from the selected bank
	        List<String> ifscCodes = bankData.get(bankName);
	        String ifscCode = ifscCodes.get(random.nextInt(ifscCodes.size()));

	        return new String[]{ifscCode,bankName};
	    }

}
