package utilities;

public class UtilsClass {

	public String getMethodNameOld() 
	{ 
		// getStackTrace() method return 
		// current method name at 0th index 
		String nameofSelectedMethod = new Throwable() 
				.getStackTrace()[2]   //0 is getMethodName, 1 is the called method.
				.getMethodName(); 
		return nameofSelectedMethod;
	} 

	/* BLOCK TO TEST THE GET METHOD NAME METHOD
	 * 
	 * public static void method1() { System.out.println(getMethodNameOld()); }
	 * 
	 * public static void method2() { method1(); }
	 * 
	 * public static void main(String[] args) { method2(); }
	 * 
	 */
	public static String getMethodName() {
		Throwable th =new Throwable(); 
		 for (int i = 0; i < th.getStackTrace().length; i++) {
	            if (!th.getStackTrace()[i].getClassName().equals(UtilsClass.class.getName())) {
	                return th.getStackTrace()[i].getMethodName();
	            }
	        }
		return "<FAILED TO GET METHOD NAME>";
	} 
}
