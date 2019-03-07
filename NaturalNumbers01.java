public class NaturalNumbers01 {
    public static void main(String[] args) {
        System.out.println(getNaturalNumbers(11,20));
    }
	public static String getNaturalNumbers(int num1, int num2)	{
       String s="";
		int i;
		if(num1 <=0 || num2 <=0) {
			return "-1";
		}
		else if(num2 < num1) {
			return "-2";
		}
		else {
			for(i = num1;i < num2;i++) {
		    	   s=s+i+" ";
		       }
			s=s+i;
			return s;
		}
	}
}
