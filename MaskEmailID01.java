public class MaskEmailID01 {
    public static void main(String[] args) {
        String email = "testmail@.mailme.com";
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
    	int index = email.indexOf("@");
    	String end_id = email.substring(index);
    	String mask = "";
    	int size = email.substring(2, index).length();
    	for(int i = 0 ; i < size ; i++) {
    		mask += "X";
    	}
    	mask = email.substring(0,2) + mask + end_id;
    	return mask;
        
    }

}
