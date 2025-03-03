package utilities;

import java.util.Random;

public class JavaUtilities 
{
	public  String generateRandomEmail() {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();

		StringBuilder randomAlphabets = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			char randomChar = allowedChars.charAt(random.nextInt(allowedChars.length()));
			randomAlphabets.append(randomChar);
		}

		return randomAlphabets.toString() + "@dewesh.in";
	}
	
	private static final String[] PREFIXES = {"6", "7", "8", "9"};
	private static final String COUNTRY_CODE = "91";

	public String generateRandomIndianMobileNumber() {
	    Random random = new Random();
	    StringBuilder mobileNumber = new StringBuilder(COUNTRY_CODE);
	    mobileNumber.append(PREFIXES[random.nextInt(PREFIXES.length)]);

	    for (int i = 1; i < 10; i++) {
	        mobileNumber.append(random.nextInt(10));
	    }

	    return mobileNumber.toString();
	}

	
	public  String generateRandomAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            int digit = random.nextInt(10); // Generates a random digit (0 to 9)
            accountNumber.append(digit);
        }

        return accountNumber.toString();
    }
	
	public static int[] generateRandomNumbers(int targetSum, int count, int maxForOne) {
	    Random random = new Random();
	    int[] numbers = new int[count];
	    int currentSum = 0;

	    for (int i = 0; i < count - 1; i++) {
	        int randomNumber = random.nextInt(maxForOne) + 1;
	        numbers[i] = randomNumber;
	        currentSum += randomNumber;
	    }

	    // Ensure the last number makes the sum exactly equal to targetSum
	    numbers[count - 1] = targetSum - currentSum;

	    return numbers;
	}
	
	public static String[] generateRandomNumbersAsString(int targetSum, int count, int maxForOne) {
	    Random random = new Random();
	    int[] numbers = new int[count];
	    int currentSum = 0;

	    for (int i = 0; i < count - 1; i++) {
	        int randomNumber = random.nextInt(maxForOne) + 1;
	        numbers[i] = randomNumber;
	        currentSum += randomNumber;
	    }

	    // Ensure the last number makes the sum exactly equal to targetSum
	    numbers[count - 1] = targetSum - currentSum;

	    // Convert int array to String array
	    String[] stringNumbers = new String[count];
	    for (int i = 0; i < count; i++) {
	        stringNumbers[i] = String.valueOf(numbers[i]);
	    }

	    return stringNumbers;
	}
	
	public static int[] generateRandnumberSum100()
	{
		Random random=new Random();
		int[] numbers=new int[4];
		numbers[0]= random.nextInt(6);
		numbers[1]= random.nextInt(76);
		int remaingSum=100-numbers[0]-numbers[1];
		numbers[2]=random.nextInt(remaingSum+1);
		numbers[3] = remaingSum-numbers[2];
		return numbers;

	}
}
