package benchJavaAssignment;

public class benchJavaQuestion2 {
        public static void main(String[] args) {  
    	
        String str = "This   is    a   practice     question";  
        String noExtraSpaceStr = str.replaceAll("\\s+", " ").trim(); 
        
        /* using built in method 
         * \\s+ will match one or more whitespace characters 
         * using replaceAll we will replace all the unncessary blanks with a single blank.
         * trim() method removes whitespace from both ends of a string.
         */
        
        System.out.println(noExtraSpaceStr);  
    }  
}
